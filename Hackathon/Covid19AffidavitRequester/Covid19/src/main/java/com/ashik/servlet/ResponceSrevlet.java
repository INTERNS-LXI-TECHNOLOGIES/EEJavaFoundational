package com.ashik.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.ashik.repository.*;
import com.ashik.model.*;
public class responceSrevlet extends HttpServlet
{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		try
		{
			UserDatabase db = new UserDatabase();
			String id=(request.getParameter("id"));
			String flag=(request.getParameter("flag"))	;
			db.setResponce(id,flag)	;	
			response.sendRedirect("admin.jsp");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}	