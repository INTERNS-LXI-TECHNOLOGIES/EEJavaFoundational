package com.lxisoft.servlet;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import com.lxisoft.repository.*;
import com.lxisoft.model.*;
import com.lxisoft.sqlrepository.*;

public class Search extends HttpServlet
{
	Repository rep = new Sqlrepository();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException
	{
		String name = request.getParameter("searchname");
	   //System.out.println(name);
		Contact contact= new Contact();
		ArrayList <Contact> searchList = new ArrayList<Contact>();
		searchList=rep.search(name);
	   
	   	PrintWriter out=response.getWriter();
	   	//System.out.println(searchList);
	   
	 	request.setAttribute("searchList",searchList);
		RequestDispatcher rd = request.getRequestDispatcher("Search.jsp");
		rd.forward(request,response);
	   
		
	}

}