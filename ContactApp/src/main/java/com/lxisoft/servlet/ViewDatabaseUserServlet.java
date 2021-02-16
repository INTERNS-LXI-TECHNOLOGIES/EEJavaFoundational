package com.lxisoft.servlet;
import com.lxisoft.repositry.*;
import com.lxisoft.model.*;
import java.sql.*;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;


public class ViewDatabaseUserServlet extends HttpServlet
{
	MysqlRepositry database = new MysqlRepositry();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		ArrayList<Contact> contactList =new ArrayList<Contact>();
		contactList=database.printDatabase();
		request.setAttribute("contactList",contactList);		
		RequestDispatcher rd= request.getRequestDispatcher("ViewDatabaseUser.jsp");
		rd.forward(request,response);
	} 
}