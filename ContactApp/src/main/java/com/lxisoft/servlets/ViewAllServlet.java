package com.lxisoft.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Domain.*;
import com.lxisoft.models.*;
import com.lxisoft.repository.*;
import java.util.*;
import java.sql.*;

public class ViewAllServlet extends HttpServlet 
{
	private Repository repo=new MySqlRepo();
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
      try{
            ArrayList<Contact> contactList=repo.getAllContacts();
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
            RequestDispatcher rd=request.getRequestDispatcher("jsp\\ContactView.jsp");
      	   rd.forward(request,response);
               // response.sendRedirect("jsp\\ContactView.jsp");
         }catch(SQLException n)
        {
           n.printStackTrace();
        }
  	}


}