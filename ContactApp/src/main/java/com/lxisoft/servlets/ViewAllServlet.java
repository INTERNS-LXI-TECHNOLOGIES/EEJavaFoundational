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
            String spageid=request.getParameter("page");  
            int pageid=Integer.parseInt(spageid);  
            int total=5;  
            if(pageid==1){ }  
            else{  
                  pageid=pageid-1;  
                  pageid=pageid*total+1;  
            }

            ArrayList<Contact> contactList=repo.getAllContacts(pageid,total);
            ContactsListModel contactlistmodel=new ContactsListModel();
            if(contactList!=null)
            { 
              for(int i=0;i<contactList.size();i++)
              {
                ContactModel contactmodel=new ContactModel();
                contactmodel.setId(contactList.get(i).getId());
                contactmodel.setFirstName(contactList.get(i).getFirstName());
                contactmodel.setLastName(contactList.get(i).getLastName());
                // contactmodel.setFullName(contactList.get(i).getFullName());
                contactlistmodel.setAllContacts(contactmodel);
              }
            }
            ArrayList<ContactModel> contacts=contactlistmodel.getAllContacts();

            HttpSession session=request.getSession();
            session.setAttribute("contactmodel",contacts);
            session.setAttribute("page",spageid);
            RequestDispatcher rd=request.getRequestDispatcher("ContactView.jsp");
        	  rd.forward(request,response);
                 // response.sendRedirect("jsp\\ContactView.jsp");
           }catch(SQLException n)
          {
             n.printStackTrace();
          }
    	}


}