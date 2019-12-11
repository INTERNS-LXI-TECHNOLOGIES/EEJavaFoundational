package com.lxisoft.Servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Repository.*;

import com.lxisoft.Domain.*;


public class DeleteServlet extends HttpServlet
{
	static MysqlRepository repo=new MysqlRepository();
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		try {
         
  //        repo.clearAllContacts();
  //       ArrayList<Contact> contacts=repo.getAllContacts();
  //       HttpSession session=request.getSession();
  //        session.setAttribute("contacts",contacts);
         
  //        request.getRequestDispatcher("jsp\\main.jsp").forward(request, response);
		PrintWriter out = response.getWriter();
         out.println("<h1>" +"asdfffff"+ "</h1>");
        
         }catch(Exception e)
         {
System.out.println("exception "+e);
         }
    }
}