package com.lxisoft.contact.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import javax.servlet.annotation.WebServlet;
import com.lxisoft.contact.model.*;
import com.lxisoft.contact.repo.*;
import java.sql.*;
import java.io.*;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


@WebServlet("/uploadFile")
public class FileUpload extends HttpServlet
{
	
	public void doPost(HttpServletRequest request,HttpServletResponse res)throws ServletException,IOException
	{
		try{
			
			
			RepositoryImpl repo=new RepositoryImpl();
			
			
			ServletFileUpload sf=new ServletFileUpload(new DiskFileItemFactory());
			List<FileItem> multifiles=sf.parseRequest(request);
			
		    for(FileItem item:multifiles)
			{
				if(!item.isFormField())
				{
					String name=new File(item.getName()).getName();
				item.write(new File("F:/csvFile/"+name));
				
				File f=new File("F:/csvFile/"+name);
			FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			String b=null;
			while((b=br.readLine())!=null)
				{

				 String a[]=b.split(",");
				 Contact contact=new Contact();
				 contact.setName(a[0]);
				 contact.setPhoneNumber(a[1]);
				 repo.create(contact);
				}
				}
				
			}
		
		
		
			PrintWriter out=res.getWriter();
			out.println("<h1>"+"File uploaded successfully"+"</h1>");
			out.println("<a href="+"create.jsp"+">back to jsp</a>");
		}
		catch(Exception e){//System.out.println(e);
	e.printStackTrace();}
		
	}
	
	
}