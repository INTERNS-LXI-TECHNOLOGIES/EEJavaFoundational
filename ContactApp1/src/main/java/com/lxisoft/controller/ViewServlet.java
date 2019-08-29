package com.lxisoft.controller;
import com.lxisoft.contact.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.sql.*;
import java.util.*;

public class ViewServlet extends HttpServlet
{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IndexOutOfBoundsException
	{
		try
		{
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			HttpSession session=req.getSession();
			String username=(String)session.getAttribute("uname");
			
			RepoImpl repoImpl=new RepoImpl();
						
			if(session!=null)
			{
				session.setAttribute("list",repoImpl.viewContact(username));
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