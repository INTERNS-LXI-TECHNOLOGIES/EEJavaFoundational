package com.lxisoft.controller;
//import com.lxisoft.contact.*;
import com.lxisoft.contact.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
import java.util.*;


import javax.servlet.Servlet;
import com.oreilly.servlet.MultipartRequest;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.output.*;

public class UploadServlet extends HttpServlet
{

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {    
    	try
    	{ 
    		HttpSession session=request.getSession();
    		response.setContentType("text/html");
	    	PrintWriter out = response.getWriter();   
	    	ServletFileUpload sf=new ServletFileUpload(new DiskFileItemFactory());
	    	List<FileItem> multiparts=sf.parseRequest(request); 
	    	for(FileItem item : multiparts)
	    	{
	    		item.write(new File("e:/new/"+item.getName()));
	    		System.out.println(item.getName());
	    		File file=new File("e:/new/"+item.getName());
	    		
	    		FileWriter fw=new FileWriter(file,true);
				FileReader fr=new FileReader(file);
				BufferedReader br=new BufferedReader(fr);
				int k=0,status=0;	
				String data,username;
				RepoImpl repoImpl=new RepoImpl();
				Contact contact=new Contact();

				while((data=br.readLine())!=null)
					{
						String itm[]=data.split(",");
						contact.setName(itm[k]);
						contact.setNumber(itm[k+1]);
						username=(String)session.getAttribute("uname");
						status=repoImpl.createContact(contact,username);
					}
					
						if(status!=0)
						{
							
							//ArrayList<Contact> list=repoImpl.getAllDB();
							session.setAttribute("list",repoImpl.getAllDB());
							response.sendRedirect("response.jsp");
						}
			}
						
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }

		 
	}
}


	/*public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IndexOutOfBoundsException,FileNotFoundException
	{
		try
		{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();

    	String data;	
    	System.out.println("File: "+req.getParameter("filetxt"));
    	FileInputStream input = null;
		
		File txt=new File(req.getParameter("filetxt"));

		input=new FileInputStream(txt);
		System.out.println("Path : "+txt.getAbsolutePath());

			
			 
			//br.close(); 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}*/

  			
		
	/*	try
		{
			

			FileWriter fw=new FileWriter(file,true);
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			int k=0;	
			String data;	
			while((data=br.readLine())!=null)
				{
					Contact contact=new Contact();
					String item[]=data.split(",");
					contact.setName(item[k]);
					contact.setNumber(item[k+1]);
					RepoImpl repoImpl=new RepoImpl();
					repoImpl.createContact(contact);
					//contactList.add(contact);
				}
			br.close(); 

			// RepoImpl repoImpl=new RepoImpl();
			// //int status=
			// repoImpl.createContact(contact);
		}*/
	// 	catch(Exception e)
	// 	{
	// 		e.printStackTrace();
	// 	}
	// }
	// }


		    	//String directory = "e:/new";
        //PrintWriter out = response.getWriter();
		//MultipartRequest m = new MultipartRequest(request, directory);  
		// if(ServletFileUpload.isMultipartContent(request))
		// {
  //           try {
  //               List<FileItem> multiparts = new ServletFileUpload(new DiskFileItemFactory()).parseRequest(request);
                
  //           }
  //           catch(Exception e)
  //           {
  //           	e.printStackTrace();
  //           }
  //       }