package com.lxisoft.servlet;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import com.lxisoft.repositry.*;
import com.lxisoft.model.*;

public class AddContactServlet extends HttpServlet
{
	MysqlRepositry database = new MysqlRepositry();

	protected void doget(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		Contact contact= new Contact(); 
    	String fname=request.getParameter("firstname");
    	String lname=request.getParameter("lastname");
    	String email=request.getParameter("email");
    	String phno=request.getParameter("contactnumber");
    	contact.setFirstName(fname);
    	contact.setLastName(lname);
    	contact.setEmail(email);
    	contact.setContactNumber(phno);
    	database.addtoDatabase();
    	if(fname.isEmpty() || lname.isEmpty() || email.isEmpty() || 
		phno.isEmpty())
		{
			RequestDispatcher req = request.getRequestDispatcher("AddContact.jsp");
			req.include(request, response);
		}
		else
		{
			RequestDispatcher req = request.getRequestDispatcher("AddContactMessage.jsp");
			req.forward(request, response);
		}
    	
	}
}