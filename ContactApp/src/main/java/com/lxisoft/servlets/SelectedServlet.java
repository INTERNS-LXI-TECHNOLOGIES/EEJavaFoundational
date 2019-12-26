package com.lxisoft.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Domain.*;
import com.lxisoft.models.*;
import com.lxisoft.repository.*;
import java.util.*;
import java.sql.*;

public class SelectedServlet extends HttpServlet
{
	private Repository repo=new MySqlRepo();
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		String name=(String)request.getParameter("user");
		HttpSession session=request.getSession(); 
		// out.println("hi.."+name);
		try
		{
			ContactsListModel contactlistmodel=new ContactsListModel();
			ArrayList<Contact> contactList=repo.getAllContacts();
			ArrayList<Contact> currentList=new ArrayList<Contact>();
			// ArrayList<Contact> currentList2=new ArrayList<Contact>();
				for(Contact contact:contactList)
				{	if(name.equalsIgnoreCase(contact.getName()))
					{
		 				currentList.add(contact);		
		 			}
				}
				if(currentList.size()==1)
	 			{
	 				session.setAttribute("currentcontact",currentList.get(0));
	 				 response.sendRedirect("ContactSearch.jsp");
					// request.setAttribute("currentcontactList",currentList.get(0));
					// RequestDispatcher rd=request.getRequestDispatcher("jsp\\ContactSearch.jsp");
					// rd.forward(request,response);
				}
				
				else{
						
					   currentList.clear();
					   for(Contact contact:contactList)
				        {
			 				if((contact.getName().toLowerCase()).contains(name.toLowerCase()))
			 					{
						 			currentList.add(contact);
						 		}
						}	
			            if(currentList.size()!=0)
			            { 
			                for(int i=0;i<currentList.size();i++)
			                {
			                  ContactModel contactmodel=new ContactModel();
			                  contactmodel.setId(currentList.get(i).getId());
			                  contactmodel.setName(currentList.get(i).getName());
			                  contactlistmodel.setAllContacts(contactmodel);
							// out.println(contactmodel.getName());
							// out.println(contactmodel.getId());
			                }
			            }
		            ArrayList<ContactModel> contacts=contactlistmodel.getAllContacts();
		           	session.setAttribute("contactmodel",contacts); 
		           	response.sendRedirect("ContactView.jsp");
		            // request.setAttribute("contactmodel",contacts);
		            // RequestDispatcher rd=request.getRequestDispatcher("View");
	             // 	rd.forward(request,response);
	            }
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}