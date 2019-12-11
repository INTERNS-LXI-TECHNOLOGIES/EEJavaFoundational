package com.lxisoft.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Domain.*;
import com.lxisoft.models.*;
import com.lxisoft.repository.*;
import java.util.*;
import java.sql.*;

public class EditServlet extends HttpServlet
{
	private Repository repo=new MySqlRepo();
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession(false); 
		String name=(String)request.getParameter("user");
		// out.println("hi......"+name);
		try
		{	
			  int index=0,i=0;
			  Contact currentContact=(Contact)session.getAttribute("contact");	
			  Contact contact=new Contact();
			  ArrayList<Contact> contactList=repo.getAllContacts();
              for(i=0;i<contactList.size();i++)
              {
              	if((contactList.get(i)).equals(currentContact))
              	{
              		index=i;
              	}
			  }
			  contact.setId(i);
              contact.setName(request.getParameter("name"));
              contact.setNo(request.getParameter("num"));
              repo.updateRepo(i,contact);
			ContactsListModel contactlistmodel=new ContactsListModel();
              if(contactList!=null)
              { 
                for(int j=0;j<contactList.size();i++)
                {
                  ContactModel contactmodel=new ContactModel();
                  contactmodel.setId(contactList.get(i).getId());
                  contactmodel.setName(contactList.get(i).getName());
                  contactlistmodel.setAllContacts(contactmodel);
                }
              }
              ArrayList<ContactModel> contacts=contactlistmodel.getAllContacts();
              request.setAttribute("contactmodel",contacts);
              RequestDispatcher rd=request.getRequestDispatcher("jsp\\ContactView.jsp");
              rd.forward(request,response);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}