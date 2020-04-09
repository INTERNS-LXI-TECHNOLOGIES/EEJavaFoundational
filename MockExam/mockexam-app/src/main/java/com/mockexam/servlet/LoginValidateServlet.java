package com.mockexam.servlet;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.mockexam.model.*;
import com.mockexam.repository.*;
public class LoginValidateServlet extends HttpServlet
{
	Database db = new Database();
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{

		String username = request.getRemoteUser();
		String userRole = db.getUserRole(username);
		PrintWriter pw = response.getWriter();
		if(userRole.equals("admin"))
		{
			pw.println(userRole);
			response.sendRedirect("admin.jsp");
		}
		else 
		{
			pw.println(userRole);
			response.sendRedirect("introduction.jsp");
		}	
	}
}