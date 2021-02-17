package com.lxisoft.servlet;
import com.lxisoft.repositry.*;
import com.lxisoft.model.*;
import java.sql.*;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;


public class ContactDetailsServlet extends HttpServlet
{
	MysqlRepositry database = new MysqlRepositry();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		//String id=request.getAttribute("id");
   		String fname=request.getParameter("fname");
    	String lname=request.getParameter("lname");
    	String email=request.getParameter("email");
    	String phno=request.getParameter("contactNumber");
    	database.deleteContacts(fname);
    	RequestDispatcher rd= request.getRequestDispatcher("ContactDetails.jsp?id=id&fname=fname&lname=lname&email=email&contactNumber=phno");
		rd.forward(request,response);
	}
}    	