package com.lxisoft.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import com.lxisoft.repository.UsersList;

public class LoginServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response){
		String user = request.getParameter("name");
	    String pass = request.getParameter("password");
	    UsersList users = new UsersList();

	    users.checkUser(user,pass);

	    try{
	    	respose.sendRedirect("Home.jsp");
	    }
	    catch(Exception e){
	    	e.printStackTrace();
	    }
	}

}