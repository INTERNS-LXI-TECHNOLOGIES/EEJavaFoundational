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
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String role = db.getUserRole(username);
		if(role.equals("admin"))
		{
			response.sendRedirect("adminLoginSuccess.jsp");
		}
		else if(role.equals("user"))
		{
			response.sendRedirect("userLoginSuccess.jsp");
		}
		else 
		{
			response.sendRedirect("errorLogin.jsp");			
		}
	}
}