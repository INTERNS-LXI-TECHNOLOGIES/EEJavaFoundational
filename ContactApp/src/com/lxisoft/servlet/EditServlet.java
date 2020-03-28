package com.lxisoft.servlet;
import com.lxisoft.model.*;
import com.lxisoft.repository.*;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class EditServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		DataBase db = new DataBase();
		int id = Integer.parseInt(request.getParameter("id"));
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String number = request.getParameter("number");	
		PrintWriter out = response.getWriter();
		Contact contact = new Contact();
		contact.setId(id);
		contact.setFirstname(fname);
		contact.setLastname(lname);
		contact.setNumber(number);
		db.editList(contact);
		response.sendRedirect("View.jsp");
	}
}