package com.lxisoft.servlet;
import com.lxisoft.model.*;
import com.lxisoft.repository.*;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class SignupServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) extends ServletException,IOException{
    	UsersList users = new UsersList();

		String name = request.getParameter("name");
		String pass = request.getParameter("password");
		
		users.addToUserDatabase(name,pass);

	}
}