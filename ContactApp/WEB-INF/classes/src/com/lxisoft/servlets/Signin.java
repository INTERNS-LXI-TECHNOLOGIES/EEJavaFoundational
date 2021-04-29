package com.lxisoft.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import com.lxisoft.repository.UsersList;

public class Signin extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response){
		UsersList users = new UsersList();

		String name = request.getParameter("name");
		String pass = request.getParameter("password");
		
		users.addToUserDatabase(name,pass);

		try{
			response.sendRedirect("Home.jsp");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}