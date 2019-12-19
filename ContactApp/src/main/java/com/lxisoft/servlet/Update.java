package com.lxisoft.servlet;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import com.lxisoft.repository.*;
import com.lxisoft.model.*;
import com.lxisoft.sqlrepository.*;

public class Update extends HttpServlet
{
	Repository rep = new Sqlrepository();
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException
	{
		Contact contact = new Contact();
		contact.setName(request.getParameter("name"));
		contact.setNumber(request.getParameter("number"));
		contact.setId(Integer.parseInt(request.getParameter("id")));

		rep.edit(contact);

		System.out.println("contact saved"+contact.getName());
		RequestDispatcher rd = request.getRequestDispatcher("/Display");
		rd.forward(request,response);

	}

}