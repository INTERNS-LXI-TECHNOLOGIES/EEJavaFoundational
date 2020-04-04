package com.mockexam.servlet;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.mockexam.model.*;
import com.mockexam.repository.*;
public class ReadServlet extends HttpServlet
{
	private int count=0;
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		try
		{
			// response.sendRedirect("questions.jsp");
			request.getRequestDispatcher("questions.jsp").forward(request,response);	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
}