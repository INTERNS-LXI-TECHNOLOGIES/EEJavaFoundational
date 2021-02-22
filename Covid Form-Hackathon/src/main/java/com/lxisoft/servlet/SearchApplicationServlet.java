package com.lxisoft.servlet;
import com.lxisoft.repositry.*;
import com.lxisoft.model.*;
import java.sql.*;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;


public class SearchApplicationServlet extends HttpServlet
{
CovidDatabase database = new CovidDatabase();

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		String fname=request.getParameter("search");
		ArrayList<CovidForm> searchList =new ArrayList<CovidForm>();
		searchList=database.searchDatabase(fname);
		request.setAttribute("searchList",searchList);		
		RequestDispatcher rd= request.getRequestDispatcher("SearchApplicationResult.jsp");
		rd.forward(request,response);
	} 
}