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
	ArrayList<Contact> contactList=null;
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		// String name=(String)request.getParameter("user");
		HttpSession session=request.getSession(); 
		Contact contact= (Contact)session.getAttribute("currentcontact");
		 try{
			 // int i=getId(contact.getFullName());
			  // contact.setId(i);
              contact.setFirstName(request.getParameter("fname"));
              contact.setLastName(request.getParameter("lname"));
              contact.setNo(request.getParameter("num"));
              repo.updateRepo(contact);
		      response.sendRedirect("View?page=1");
          }catch(Exception e)
          {
          	e.printStackTrace();
          }
	}
			 
}
