package com.lxisoft.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Domain.*;
import com.lxisoft.models.*;
import com.lxisoft.repository.*;
import java.util.*;
import java.sql.*;

public class AddServlet extends HttpServlet 
{
	private Repository repo=new MySqlRepo();
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
      try{
              Contact contact=new Contact();boolean exists=false;
              contact.setFirstName(request.getParameter("fname"));
              contact.setLastName(request.getParameter("lname"));
              contact.setNo(request.getParameter("num"));
              ArrayList<Contact> contactList=repo.getAllContacts();
                  for(int i=0;i<contactList.size();i++)
                  {
                   if(contact.getFullName().equals(contactList.get(i).getFullName()))
                    {
                      //System.out.println("hi...equal");
                      exists=true;
                    }
                  }
                  if(exists)
                  {
                    request.setAttribute("contacts",contact);
                    RequestDispatcher rd=request.getRequestDispatcher("ContactAdd.jsp");
                    rd.forward(request,response);
                  }
                  else{
                        repo.addContactDetails(contact);
                        response.sendRedirect("View?page=1");
                      }
              
         }catch(SQLException n)
         {
           n.printStackTrace();
         }
  	}
}