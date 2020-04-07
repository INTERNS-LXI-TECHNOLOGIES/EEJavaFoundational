package com.mockexam.servlet;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.mockexam.model.*;
import com.mockexam.repository.*;
public class RegisterUserServlet extends HttpServlet
{
	Database db = new Database();
	User user = new User();
	private String role="user";
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		String username = request.getParameter("uname");
		String password = request.getParameter("pass");
		user.setUserName(username);
		user.setPassword(password);
		user.setRole(role);
		db.insertUserRecord(user);
		response.sendRedirect("registerSuccess.jsp");
		
	}
}