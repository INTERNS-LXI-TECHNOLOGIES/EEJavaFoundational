package com.lxisoft.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Domain.*;
import com.lxisoft.models.*;
import com.lxisoft.repository.*;
import java.util.*;
import java.sql.*;

public class DeleteServlet extends HttpServlet
{
	private Repository repo=new MySqlRepo();
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
	{
		try
		{
		
		HttpSession session=request.getSession(); 
		// String name=request.getParameter("user");
		Contact contact= (Contact)session.getAttribute("currentcontact");
		PrintWriter out=response.getWriter();
		// int i=getId(contact.getFullName());
		// out.println("hi......"+i);
		repo.deleteContact(contact);
		 // ArrayList<Contact> contactList=repo.getAllContacts();
   //            ContactsListModel contactlistmodel=new ContactsListModel();
   //            if(contactList!=null)
   //            { 
   //              for(int j=0;j<contactList.size();j++)
   //              {
   //                ContactModel contactmodel=new ContactModel();
   //                contactmodel.setId(contactList.get(j).getId());
   //                contactmodel.setName(contactList.get(j).getName());
   //                contactlistmodel.setAllContacts(contactmodel);
   //              }
   //            }
   //            ArrayList<ContactModel> contacts=contactlistmodel.getAllContacts();
   //             session.setAttribute("contactmodel",contacts);
              // RequestDispatcher rd=request.getRequestDispatcher("View");
              // rd.forward(request,response);
		response.setCharacterEncoding("UTF-8");
		response.sendRedirect("View?page=1");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
			 

}