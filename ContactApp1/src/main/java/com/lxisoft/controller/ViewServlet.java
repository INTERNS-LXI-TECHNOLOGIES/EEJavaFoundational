package com.lxisoft.controller;
import com.lxisoft.contact.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
import java.util.*;

public class ViewServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IndexOutOfBoundsException
	{
		try
		{
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			HttpSession session=req.getSession();
			String username=(String)session.getAttribute("uname");
			
			RepoImpl repoImpl=new RepoImpl();
			
			String spageid=req.getParameter("page");
			System.out.println("PAGE:"+spageid);
	 		int pageid=Integer.parseInt(spageid);
	 		
	 		int total=5;
	 		if(pageid==1){}
	 		else{
	 			pageid=pageid-1;
	 			pageid=pageid*total+1;
	 		}
	 		
						
			if(session!=null)
			{
				//ArrayList<Contact> contactList=repoImpl.getAllDB(pageid,total,username);
				
				session.setAttribute("list",repoImpl.getAllDB(pageid,total,username));
				res.sendRedirect("View.jsp");
			}
			pw.close();
		} 
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}