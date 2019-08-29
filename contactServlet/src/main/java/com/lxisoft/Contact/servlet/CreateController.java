package com.lxisoft.Contact.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.lxisoft.Contact.repositoryImpl.RepositoryImpl;
import com.lxisoft.Contact.model.*;


@WebServlet("/create")
public class CreateController extends HttpServlet {
	ArrayList<ContactModel> contacts = new ArrayList <ContactModel>();
	RepositoryImpl ri = new RepositoryImpl();
	
	int count = 0;
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		try {
			ContactModel c=new ContactModel();
			HttpSession session= req.getSession();
			String firstName=req.getParameter("Your First Name");
			String lastName=req.getParameter("Your Last Name");
			String phone=req.getParameter("Phone Number");
			String mobNumber=req.getParameter("Mobile Number");
			String email=req.getParameter("Your email");
			c.setFirstName(firstName);
			c.setLastName(lastName);
			c.setPhone(phone);
			c.setMobNumber(mobNumber);
			c.setEmail(email);
			 String username=(String) session.getAttribute("uname");
			ri.addContact(c,username);
    		PrintWriter out = res.getWriter();
    		res.sendRedirect("View.jsp");
		}
		catch(Exception e) {
		}
		}
      	}
