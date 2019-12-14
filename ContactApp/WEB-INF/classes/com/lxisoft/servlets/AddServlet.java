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
              contact.setName(request.getParameter("name"));
              contact.setNo(request.getParameter("num"));
              ArrayList<Contact> contactList=repo.getAllContacts();
                  for(int i=0;i<contactList.size();i++)
                  {
                   if(contact.getName().equals(contactList.get(i).getName()))
                    {
                     System.out.println("hi...equal");
                      exists=true;
                    }
                  }
                  if(exists)
                  {
                    request.setAttribute("contacts",contact);
                    RequestDispatcher rd=request.getRequestDispatcher("jsp\\ContactAdd.jsp");
                    rd.forward(request,response);
                  }
                  else{
                        repo.addContactDetails(contact);
                        //ArrayList<Contact> contactList=repo.getAllContacts();
                        ContactsListModel contactlistmodel=new ContactsListModel();
                        if(contactList!=null)
                        { 
                          for(int i=0;i<contactList.size();i++)
                          {
                            ContactModel contactmodel=new ContactModel();
                            contactmodel.setId(contactList.get(i).getId());
                            contactmodel.setName(contactList.get(i).getName());
                            contactlistmodel.setAllContacts(contactmodel);
                          }
                        }
                        ArrayList<ContactModel> contacts=contactlistmodel.getAllContacts();
                        HttpSession session=request.getSession();
                        session.setAttribute("contactmodel",contacts);
                        // request.setAttribute("contactmodel",contacts);
                        RequestDispatcher rd=request.getRequestDispatcher("View");
                        rd.forward(request,response);
                      }
              // response.sendRedirect("View");
         }catch(SQLException n)
         {
           n.printStackTrace();
         }
  	}
}