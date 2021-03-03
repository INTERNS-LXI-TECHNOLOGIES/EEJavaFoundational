package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.io.*;
import javax.servlet.http.HttpServlet;
import com.lxisoft.model.*;
import com.lxisoft.repository.*;



public class SearchServlet extends HttpServlet
{
	public SearchServlet(){
		super();
	}

	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException , IOException
	{
		UserRepository userrepo = new UserRepository();
		String name = request.getParameter("name");
		userrepo.searchDatabase(name);

		RequestDispatcher rd = request.getRequestDispatcher("/ViewServlet");
		rd.forward(request,response);
	 try{
	 	
	response.sendRedirect("Search1.jsp");

	   }
	 catch(Exception e){}

}
}