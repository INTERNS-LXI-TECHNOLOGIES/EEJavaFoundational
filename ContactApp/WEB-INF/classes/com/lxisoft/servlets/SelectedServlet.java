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
		HttpSession session=request.getSession(false); 
		String name=(String)request.getParameter("user");
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
					request.setAttribute("currentcontactList",currentList);
					RequestDispatcher rd=request.getRequestDispatcher("jsp\\ContactSearch.jsp");
					rd.forward(request,response);
				}
				else{
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
			                }
			            }
		            ArrayList<ContactModel> contacts=contactlistmodel.getAllContacts();
		            request.setAttribute("contactmodel",contacts);
		            RequestDispatcher rd=request.getRequestDispatcher("jsp\\ContactView.jsp");
	             	rd.forward(request,response);
	            }
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}