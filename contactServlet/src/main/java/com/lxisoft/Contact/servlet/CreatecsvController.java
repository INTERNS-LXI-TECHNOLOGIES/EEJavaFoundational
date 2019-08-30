package com.lxisoft.Contact.servlet;

import java.io.*;
import java.util.*;


import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;

import javax.servlet.Servlet;

import com.lxisoft.Contact.model.ContactModel;
import com.lxisoft.Contact.repositoryImpl.RepositoryImpl;

 
@WebServlet("/createcsv")

public class CreatecsvController  extends HttpServlet implements Servlet {
	
	ArrayList<ContactModel> contacts = new ArrayList <ContactModel>();
	ArrayList<String> phno = new ArrayList<String>();
	RepositoryImpl ri = new RepositoryImpl();
	RepositoryImpl si = new RepositoryImpl();
    
    String data;
   
    
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
	        
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
//	    	    					for(int i=2;i<4;i++) {
//	    	    						phno.add(split[i]);//when phone number was saved in another table
//	    	    						cml.setPhoneNumber(phno);
//	    	    					}
	    	    					cml.setPhoneNumber(split[2]);
	    	    					String usrname=(String) session.getAttribute("uname");
	    	    					ri.createContact(cml,usrname);
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



		
		
			
          
