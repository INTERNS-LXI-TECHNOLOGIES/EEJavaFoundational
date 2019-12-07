package com.lxisoft.Servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Repository.*;

import com.lxisoft.Domain.*;


public class ContactAdd extends HttpServlet
{
	// public void init()throws ServletExecption
	// {
	// }
        static MysqlRepository repo=new MysqlRepository();
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
   		
         try {
         Contact contact=new Contact();
   		contact.setName(request.getParameter("name"));
         contact.setNumber(request.getParameter("number"));
         repo.writeNewContact(contact,true);
         ArrayList<Contact> contacts=repo.getAllContacts();
         // request.setAttribute("contacts",contacts);
         // request.getRequestDispatcher("jsp\\main.jsp").forward(request, response);
         PrintWriter out = response.getWriter();
         out.println("<h1>" +contact.getName()+ "</h1>");
         }catch(Exception e)
         {
System.out.println("exception "+e);
         }
      	// out.println("<h1>" + request.getParameter("name")+ "</h1>");
	}
}