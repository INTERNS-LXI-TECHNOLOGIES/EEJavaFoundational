package com.lxisoft.Servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Repository.*;
import com.lxisoft.Models.*;

import com.lxisoft.Domain.*;


public class ContactAddServlet extends HttpServlet
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
         contact.setNo(request.getParameter("number"));
         repo.writeNewContact(contact,true);
         ArrayList<Contact> contacts=repo.getAllContacts();

         ViewList view=new ViewList();
         ArrayList<ViewListModel> listView=null;
         if(contacts!=null)
         {
            view.clearArray();
            for(int i=0;i<contacts.size();i++)
            {
               view.setContact(contacts.get(i));
            }
            listView=view.getAllContacts();
         }

         request.setAttribute("contacts",listView);
         request.getRequestDispatcher("jsp\\main.jsp").forward(request, response);
         // PrintWriter out = response.getWriter();
         // out.println("<h1>" +contact.getName()+ "</h1>");
         }catch(Exception e)
         {
System.out.println("exception "+e);
         }
      	// out.println("<h1>" + request.getParameter("name")+ "</h1>");
	}
}