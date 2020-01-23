package com.lxisoft.Servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Repository.*;
import com.lxisoft.Domain.*;

public class AdminServlet extends HttpServlet
{
	MysqlRepo repo=new MysqlRepo();
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		
		response.sendRedirect("viewall");
	// PrintWriter out=response.getWriter();
 //        		out.println(words.size()+"...");
	}
        	
}