package com.lxisoft.Servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Repository.*;

import com.lxisoft.Domain.*;


public class ViewServlet extends HttpServlet
{
	// public void init()throws ServletExecption
	// {
	// }
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
   		String name=request.getParameter("name");
   		MysqlRepository repo= new MysqlRepository();
         try {
         ArrayList<Contact> contacts=repo.getAllContacts(); 
   		// PrintWriter out = response.getWriter();
         // for(Contact a: contacts)
         // out.println("<h1>"+a.getName()+"</h1>");
   		request.setAttribute("contacts",contacts);
   		request.getRequestDispatcher("jsp\\main.jsp").forward(request, response);
   		}catch(Exception e)
         {
System.out.println("exception "+e);
         }
      	// out.println("<h1>" + request.getParameter("name")+ "</h1>");
	}
}