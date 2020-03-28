package com.lxisoft.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
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
			response.sendRedirect("view.jsp");		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}	