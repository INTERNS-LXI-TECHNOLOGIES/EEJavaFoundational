package com.lxisoft.servlet;
import com.lxisoft.repositry.*;
import com.lxisoft.model.*;
import java.sql.*;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;


public class SearchContactServlet extends HttpServlet
{
	MysqlRepositry database = new MysqlRepositry();

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		String fname=request.getParameter("search");
		ArrayList<Contact> searchList =new ArrayList<Contact>();
		searchList=database.searchDatabase(fname);
		request.setAttribute("searchList",searchList);		
		RequestDispatcher rd= request.getRequestDispatcher("SearchContact.jsp");
		rd.forward(request,response);
	} 
}