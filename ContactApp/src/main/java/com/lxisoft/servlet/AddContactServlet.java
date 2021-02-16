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

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
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
    	database.addtoDatabase(contact);


			RequestDispatcher req = request.getRequestDispatcher("AddContactsMessage.jsp");
			req.forward(request, response);
		}
    	
	}
