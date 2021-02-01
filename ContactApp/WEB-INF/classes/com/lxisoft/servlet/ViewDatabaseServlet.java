package com.lxisoft.servlet;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import com.lxisoft.repositry.*;
import com.lxisoft.model.*;

public class ViewDatabaseServlet extends HttpServlet
{
	MysqlRepositry database = new MysqlRepositry();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		ArrayList <Contact> contactList = new ArrayList<Contact>();

		contactList=database.printDatabase(contactList);
		request.setAttribute("contactList", contactList);
		RequestDispatcher rd= request.getRequestDispatcher("ViewDatabase.jsp");
		rd.forward(request,response);
	} 
}