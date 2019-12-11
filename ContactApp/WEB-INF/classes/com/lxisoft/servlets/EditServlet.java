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
		//HttpSession session=request.getSession(false); 
		String name=(String)request.getParameter("user");
		out.println("hi.."+name);
		// try
		// {
		// 	ArrayList<Contact> contactList=repo.getAllContacts();
		// 	ArrayList<Contact> currentList=new ArrayList<Contact>();
		// 		for(Contact contact:contactList)
		// 		{	if(name.equals(contact.getName()))
		// 			{
		//  				request.setAttribute("currentcontact",contact);
		// 				RequestDispatcher rd=request.getRequestDispatcher("jsp\\ContactSearch.jsp");
		// 				rd.forward(request,response);		
		//  			}
		// 		}
		// }catch(Exception e)
		// {
		// 	e.printStackTrace();
		// }
		
	}
}