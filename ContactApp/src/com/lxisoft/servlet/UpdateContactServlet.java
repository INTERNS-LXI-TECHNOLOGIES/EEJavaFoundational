package com.lxisoft.servlet;
import com.lxisoft.model.*;
import com.lxisoft.repository.*;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class UpdateContactServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		DataBase db = new DataBase();
		int id = Integer.parseInt(request.getParameter("id"));
		String fname = request.getParameter("firstname");
		String lname = request.getParameter("lastname");
		String phno = request.getParameter("phno");	
		PrintWriter out = response.getWriter();
		Contact contact = new Contact();
		contact.setId(id);
		contact.setFirstName(fname);
		contact.setLastName(lname);
		contact.setPhoneNum(phno);
		db.updateDb(contact);
		//response.sendRedirect("index.jsp");
		response.sendRedirect("updateMsg.jsp");
	}
}