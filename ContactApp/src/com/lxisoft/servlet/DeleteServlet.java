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
			int id = Integer.parseInt(request.getParameter("id"));
			PrintWriter out = response.getWriter();
			out.println(id);
			db.deletRecord(id);
			response.sendRedirect("delete.jsp");		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}	