package com.lxisoft.servlet;
import com.lxisoft.repositry.*;
import com.lxisoft.model.*;
import java.sql.*;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;


public class ViewApplicationServlet extends HttpServlet
{
	CovidDatabase database = new CovidDatabase();

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		ArrayList<CovidForm> covidFormList =new ArrayList<CovidForm>();
		covidFormList=database.printDatabase();
		request.setAttribute("covidFormList",covidFormList);		
		RequestDispatcher rd= request.getRequestDispatcher("ViewApplication.jsp");
		rd.forward(request,response);
	} 
}