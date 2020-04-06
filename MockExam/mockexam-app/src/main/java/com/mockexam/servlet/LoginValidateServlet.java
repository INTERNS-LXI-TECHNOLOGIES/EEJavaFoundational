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
	ArrayList<User> userRecord = new ArrayList<User>();
	public void doGet(HttpServletRequest request,HttpServletResponse reaponse) throws IOException,ServletException
	{
		String username = request.getPsrameter("username");
		String password = request.getPsrameter("password");
		String role = db.getRole(username);
		if(role.equals("admin"))
		{
			request.getRequestDispatcher("admin.jsp").forward(request,response);
		}
		else if(role.equals("user"))
		{
			request.getRequestDispatcher("admin.jsp").forward(request,response);
		}
		else 
		{
			response.sendRedirect("errorLogin.jsp");			
		}
	}
}