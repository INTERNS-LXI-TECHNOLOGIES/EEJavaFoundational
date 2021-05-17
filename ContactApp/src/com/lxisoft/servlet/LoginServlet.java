package com.lxisoft.servlet;
import com.lxisoft.model.*;
import com.lxisoft.repository.*;
import java.io.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class LoginServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		PrintWriter out = response.getWriter();
		String name = request.getParameter("userName");
		String password = request.getParameter("password");

		UsersDatabase users = new UsersDatabase();

		boolean check = users.checkUser(name,password);
		if(check != false){
			response.sendRedirect("view.jsp");
		}
		else{
			out.println("Wrong Password");
			response.sendRedirect("login.html");
		}
	}
}