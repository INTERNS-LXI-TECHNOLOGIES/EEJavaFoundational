package com.lxisoft.Contact.servlet;

import java.io.*;
import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import com.lxisoft.Contact.model.ContactModel;
import com.lxisoft.Contact.repositoryImpl.RepositoryImpl;


@WebServlet("/createcsv")
public class Createcsv extends HttpServlet {
	ArrayList<ContactModel> contacts = new ArrayList <ContactModel>();
	ArrayList<String> phno = new ArrayList<String>();
	RepositoryImpl ri = new RepositoryImpl();
	RepositoryImpl si = new RepositoryImpl();
	int count = 0;
	String data;
	
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
		
	        
	            try {
	            	ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
	                List <FileItem> multiparts = sf.parseRequest(request);
	                PrintWriter out = response.getWriter();
	                for(FileItem item : multiparts){
	                    if(!item.isFormField()){
	                        String name = new File(item.getName()).getName();
	                        item.write( new File("/Users/Lenovo/Desktop/project/New folder (2)/" + name));
	                        
	                        File file = new File("c:/Users/Lenovo/Desktop/project/New folder (2)/" + name);
	    	    			FileReader fR = new FileReader(file);
	    	    			BufferedReader bR = new BufferedReader(fR);
	    	    			while((data = bR.readLine())!= null){
	    	    					String[] split = data.split(",");
	    	    					ContactModel cml = new ContactModel();
	    	    					ArrayList<String> phno = new ArrayList<String>();
	    	    					cml.setName(split[0]);
	    	    					cml.setMailId(split[1]);
	    	    					for(int i=2;i<4;i++) {
	    	    						phno.add(split[i]);
	    	    						cml.setPhoneNumber(phno);
	    	    					}
	    	    					ri.createContact(cml);
	    	    					out.println("file_source");
	    	                
	                    }
	                    
	                    
	                }
	                }
	                
	                out.println("<a href="+"Read.jsp"+">back to jsp</a>");

	            }catch (Exception ex) {
	               request.setAttribute("gurumessage", "File Upload Failed due to " + ex);
	            }         		
	       
	            	            
}
	
	
	    }



		
		
			
          
//         if(request.getParameter("txt") == null)
//         {
//             response.sendRedirect("Read.jsp");
//             return;
//         }
//         PrintWriter out = response.getWriter();
//
//         FileInputStream input = null;
//         File theFile = new File(request.getParameter("txt"));
//         input = new FileInputStream(theFile);
//         out.println("FullPathname" + " " + theFile.getAbsolutePath());
//
//        try {
//        	File file = new File(theFile.getAbsolutePath());
//			FileReader fR = new FileReader(file);
//			BufferedReader bR = new BufferedReader(fR);
//			while((data = bR.readLine())!= null){
//					String[] split = data.split(",");
//					ContactModel cml = new ContactModel();
//					ArrayList<String> phno = new ArrayList<String>();
//					cml.setName(split[0]);
//					cml.setMailId(split[1]);
//					for(int i=2;i<4;i++) {
//						phno.add(split[i]);
//						cml.setPhoneNumber(phno);
//					}
//					ri.createContact(cml);
//					out.println("file_source");
//					out.println("<a href="+"Read.jsp"+">back to jsp</a>");
//			}
//        }
//        catch(Exception e) {
//        	
//        }
 
                 
          

	
//<form action="createcsv" method="post">
//<h1>File</h1>
//<input type="file" name="txtPhoto" placeholder="Upload Your Image" accept="image/gif, image/jpeg, image/png" /><br /><br />
//<input type="submit" value="Save">
//</form>