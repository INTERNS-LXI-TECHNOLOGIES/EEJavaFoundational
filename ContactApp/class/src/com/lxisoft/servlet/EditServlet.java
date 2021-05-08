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
		ContactDatabase database = new ContactDatabase();
		int id = Integer.parseInt(request.getParameter("id"));
		String cname = request.getParameter("name");
		String cname = request.getParameter("number");
		String mail = request.getParameter("email");	
		PrintWriter out = response.getWriter();
		Contact contact = new Contact();
		contact.setId(id);
		contact.setName(name);
		contact.setNumber(number);
		contact.setEmail(email);
		database.editList(contact);
		response.sendRedirect("view.jsp");
	}
}