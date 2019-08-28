package com.lxisoft.contact.servlets;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.lxisoft.contact.model.ContactModel;
import com.lxisoft.contact.repositoryimpl.RepositoryImpl;;

@WebServlet("/upload")
public class upload extends HttpServlet
{
	private final String UPLOAD_DIRECTORY = "D:/";
	   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	RepositoryImpl rimpl = new RepositoryImpl();
        //process only if its multipart content
        if(ServletFileUpload.isMultipartContent(request)){
            try {
                List<FileItem> multiparts = new ServletFileUpload( new DiskFileItemFactory()).parseRequest(request);
               
                for(FileItem item : multiparts){
                    if(!item.isFormField()){
                    	
                        String name = new File (item.getName()).getName();
                        item.write( new File(UPLOAD_DIRECTORY + File.separator + name));
                         File f =new File("D:/" + File.separator + name);
                         FileReader fr=new FileReader(f);
                         BufferedReader br=new  BufferedReader(fr); 
                       String n=br.readLine();
                       while(n!=null)
                       {
                    	   ContactModel contactmodel=new ContactModel();
                    	   String[] a=n.split(",");
                    	   contactmodel.setName(a[0]);
                    	   contactmodel.setNumber(a[1]);
                    	   rimpl.add(contactmodel.getName(),contactmodel.getNumber());
                    	   n=br.readLine();
                       }
                    }
                    
                }
            
               //File uploaded successfully
               request.setAttribute("message", "File Uploaded Successfully");
            } catch (Exception ex) {
            	ex.printStackTrace();
               request.setAttribute("message", "File Upload Failed due to " + ex);
            }          
          
        }else{
            request.setAttribute("message",
                                 "Sorry this Servlet only handles file upload request");
        }
    }

}
