package com.ashik.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.ashik.repository.*;
import com.ashik.model.*;
public class ResponceServlet extends HttpServlet
{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		try
		{
			UserDatabase db = new UserDatabase();
			int id=(request.getParameter("id"));
			int flag=(request.getParameter("flag"))	
			db.setResponce(id,flag)		
			response.sendRedirect("admin.jsp");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}	