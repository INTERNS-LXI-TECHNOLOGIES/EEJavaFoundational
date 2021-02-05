package com.lxisoft.servlet;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import com.lxisoft.repository.*;
import com.lxisoft.model.*;

public class ViewServlet extends HttpServlet
{
		ContactRepository contactrepo = new ContactRepository();


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException
	{
		Contact contact = new Contact();
		contactrepo.viewDatabase(contact);
		request.setAttribute("contact",contact);
		RequestDispatcher rd = request.getRequestDispatcher("View.jsp");
		rd.forward(request,response);				
	}
} 