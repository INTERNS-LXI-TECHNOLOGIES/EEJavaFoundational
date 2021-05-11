package com.lxisoft.servlet;
import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.model.*;
public class DeleteServlet extends HttpServlet
{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		try
		{
			ContactDatabase db = new ContactDatabase();
			String name = request.getParameter("name");
			PrintWriter out = response.getWriter();
			out.println(name);
			db.deletRecord(name);
			response.sendRedirect("delete.jsp");		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}	