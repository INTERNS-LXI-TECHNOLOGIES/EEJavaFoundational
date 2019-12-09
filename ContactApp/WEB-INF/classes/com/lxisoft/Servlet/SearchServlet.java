package com.lxisoft.Servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Repository.*;
import com.lxisoft.Models.*;

import com.lxisoft.Domain.*;


public class SearchServlet extends HttpServlet
{
	// public void init()throws ServletExecption
	// {
	// }
        static MysqlRepository repo=new MysqlRepository();
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
   		
         try {
         Contact contact=null;
         String name=(String)request.getParameter("name");
         HttpSession session=request.getSession();
         ViewListModel cont=(ViewListModel)session.getAttribute("use");
         // ArrayList<Contact> contacts=repo.getAllContacts();
         // for(int i=0;i<contacts.size();i++)
         // {
         //    String s=contacts.get(i).getName();
         //    if(s.equals(name)) 
         //    {
         //       contact=contacts.get(i);                        
         //    }
         // }
         // if(contact!=null)
         // {
         //    request.setAttribute("contacts",listView);
         //    request.getRequestDispatcher("jsp\\main.jsp").forward(request, response);

         // }
         // ViewList view=new ViewList();
         // ArrayList<ViewListModel> listView=null;
         // if(contacts!=null)
         // {
         //    view.clearArray();
         //    for(int i=0;i<contacts.size();i++)
         //    {
         //       view.setContact(contacts.get(i));
         //    }
         //    listView=view.getAllContacts();
         // }

         // request.setAttribute("contacts",listView);
         // request.getRequestDispatcher("jsp\\main.jsp").forward(request, response);
         PrintWriter out = response.getWriter();
         out.println("<h1>" +cont.getName()+ "</h1>");
         }catch(Exception e)
         {
System.out.println("exception "+e);
         }
      	// out.println("<h1>" + request.getParameter("name")+ "</h1>");
	}
}