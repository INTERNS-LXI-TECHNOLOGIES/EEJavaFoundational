package com.lxisoft.Servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import com.lxisoft.Repository.*;
import com.lxisoft.Domain.*;
public class ViewAll extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		DataRepository drr = new DataRepository(); 
		List<Dictionary>wordList=drr.displayAll();
		request.setAttribute("dictionary ",wordList);
		RequestDispatcher rd = request.getRequestDispatcher("ViewAll.jsp");
		rd.forward(request,response);
	}
}