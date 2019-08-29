package com.lxisoft.Contact.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lxisoft.Contact.repositoryImpl.RepositoryImpl;

@WebServlet("/email")
public class UpEmailidController extends HttpServlet {
	
	RepositoryImpl ri = new RepositoryImpl();
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		try {
			String b=req.getParameter("Email");
			String d=req.getParameter("Updated Mail");
			String c="email";
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