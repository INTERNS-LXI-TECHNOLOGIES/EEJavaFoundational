package com.lxisoft.servlet;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import com.lxisoft.repository.*;
import com.lxisoft.model.*;
import java.util.ArrayList;
public class ViewServletuser extends HttpServlet
{
		ContactRepository contactrepo = new ContactRepository();


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException
	{
		ArrayList<Contact> contactList = new ArrayList<Contact>();
		contactList = contactrepo.viewDatabase();
		request.setAttribute("list",contactList);
		RequestDispatcher rd = request.getRequestDispatcher("Viewuser.jsp");
		rd.forward(request,response);				
	}
} 