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
            String name=(String)request.getParameter("user");
            HttpSession session=request.getSession();
            // session.setAttribute("use",a);
            // ViewListModel cont=(ViewListModel)session.getAttribute("use");
            ArrayList<Contact> contacts=repo.getAllContacts();
            ArrayList<Contact> users=new ArrayList<Contact>();
            ArrayList<Contact> dupUsers=new ArrayList<Contact>();
            for(Contact a: contacts)
            {
               if(a.getName().equals(name))
               {
                  users.add(a);
               }

            }
            if(users.size()==1)
            {
               session.setAttribute("users",users.get(0));
               request.getRequestDispatcher("jsp\\user.jsp").forward(request, response);

            }
            else
            {
                for(Contact a: contacts)
               {
                  if(a.getName().contains(name))
                  {
                     dupUsers.add(a);
                  }

               }
               for(Contact a: dupUsers)
               {
            PrintWriter out = response.getWriter();
            out.println(a.getName());}
            }
             if(dupUsers.size()!=0) 
               {
                 ViewList view=new ViewList();
                  ArrayList<ViewListModel> listView=null;
                  view.clearArray();
                  for(int i=0;i<dupUsers.size();i++)
                  {
                     view.setContact(dupUsers.get(i));
                  }
                  listView=view.getAllContacts();
                  session.setAttribute("contacts",listView);
                  request.setAttribute("search",true);
                  request.getRequestDispatcher("jsp\\main.jsp").forward(request, response);
               }
               // else
               // {
               //    request.getRequestDispatcher("viewall").forward(request, response);
               // }
            




            // {

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
         }catch(Exception e)
         {
            System.out.println("exception "+e);
         }
      	// out.println("<h1>" + request.getParameter("name")+ "</h1>");
	}
}