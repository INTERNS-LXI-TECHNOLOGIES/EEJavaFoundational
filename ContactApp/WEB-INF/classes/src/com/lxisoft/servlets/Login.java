package com.lxisoft.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class Login{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response){
		String user = request.getParameter("name");
	    String pass = request.getParameter("password");
	    UsersList users = new UsersList();

	    users.checkUser(user,pass);

	    try{
	    	respose.sendRedirect("Home.jsp");
	    }
	}

}