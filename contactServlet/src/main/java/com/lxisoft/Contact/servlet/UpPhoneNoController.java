package com.lxisoft.Contact.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lxisoft.Contact.model.ContactModel;
import com.lxisoft.Contact.repositoryImpl.RepositoryImpl;

@WebServlet("/phone")
public class UpPhoneNoController extends HttpServlet {
	
	RepositoryImpl ri = new RepositoryImpl();
	
	int count = 0;
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		try {
			String b=req.getParameter("Phone Number");
			String d=req.getParameter("Updated Number");
			String c="phoneNumber";
			ri.updateContact(c,b,d);
			res.setContentType("text/html");
    		PrintWriter out = res.getWriter();
    		res.sendRedirect("View.jsp");
		}
			
			
		catch(Exception e)
		{
			
		}
	}
}