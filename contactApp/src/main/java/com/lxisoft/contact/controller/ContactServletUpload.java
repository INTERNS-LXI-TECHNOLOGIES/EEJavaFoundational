package com.lxisoft.contact.controller;
import com.lxisoft.contact.model.*;
import com.lxisoft.contact.repository.*;
import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*; 
import java.util.*; 
import java.sql.*;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.output.*;

public class ContactServletUpload extends HttpServlet{ 

public void doPost(HttpServletRequest req,HttpServletResponse res)  throws ServletException,IOException,IndexOutOfBoundsException
{ 
	try{
	Contact contact=new Contact();
ContactRepository cR=new ContactRepository(); 
//res.setContentType("text/html");//setting the content type  
//PrintWriter out=res.getWriter();//get the stream to write the data
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		ServletFileUpload upload = new ServletFileUpload(new DiskFileItemFactory());
		List<FileItem> fileItems = upload.parseRequest(req);
//System.out.println("content type is:"+contentType);

        for(FileItem f:fileItems)
            {
            	System.out.println(f.getName());
            	f.write(new File("F:/temp/"+f.getName()));
            	File file=new File("F:/temp/"+f.getName());
            	FileReader fr=new FileReader(file);
            	BufferedReader br=new BufferedReader(fr);
            	String data;
            	while((data=br.readLine())!=null)
            	{
					String item[]=data.split(",");
					contact.setName(item[0]);
					contact.setNum(item[1]);
					cR.createContact(contact);
            	}
            	 br.close();
            }
   
        }
        catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}