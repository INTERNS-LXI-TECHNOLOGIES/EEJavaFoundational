package com.lxisoft.Contact.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lxisoft.Contact.model.ContactModel;
import com.lxisoft.Contact.repositoryImpl.RepositoryImpl;


@WebServlet("/create")
public class CreateContactController extends HttpServlet {
	ArrayList<ContactModel> contacts = new ArrayList <ContactModel>();
	ArrayList<String> phno = new ArrayList<String>();
	RepositoryImpl ri = new RepositoryImpl();
	RepositoryImpl si = new RepositoryImpl();
	int count = 0;
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException 
	{
		HttpSession session = req.getSession();
		try {
			ContactModel cm = new ContactModel();
    		String username=req.getParameter("username");
			String phone_number=req.getParameter("userphonenumber");
			String mail_id=req.getParameter("usermailid");
			cm.setName(username);
			//phno.add(phone_number);
			cm.setPhoneNumber(phone_number);
			cm.setMailId(mail_id);
			String username1=(String) session.getAttribute("uname");
			ri.createContact(cm,username1);
			res.sendRedirect("Read.jsp");
//    		PrintWriter out = res.getWriter();
//      		out.println("<a href="+"Read.jsp"+">back to jsp</a>");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		}
      	}
