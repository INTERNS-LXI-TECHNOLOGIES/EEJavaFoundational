package com.mockexam.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.mockexam.repository.*;
import com.mockexam.model.*;
public class DeleteQuestionServlet extends HttpServlet
{
	Database db = new Database();
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		try
		{
			PrintWriter pz = response.getWriter();
			int id = Integer.parseInt(request.getParameter("id"));
			pz.println(id);
			db.deleteQuestionRecord(id);
			response.sendRedirect("delete.jsp");		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}	