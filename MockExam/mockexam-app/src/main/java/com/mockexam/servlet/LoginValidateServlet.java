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
	ArrayList<User> users = new ArrayList<User>();
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		String userRole =" ";
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		users = db.getUserRecord(users);
		for (int i=0;i<users.size();i++) 
		{
			if(users.get(i).getUserName().equals(username) && users.get(i).getPassword().equals(password))
			{
				userRole = db.getUserRole(username);
				{
					if(userRole.equals("admin"))
					{
						response.sendRedirect("adminLogin.jsp");
						return;
					}
					else if(userRole.equals("user")) 
					{
						response.sendRedirect("userLogin.jsp");
						return;			
					}	
				}
			return;	
			}
		}	
		response.sendRedirect("errorLogin.jsp");	
		return;		
	}
}