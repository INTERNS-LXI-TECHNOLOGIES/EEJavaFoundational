package com.lxisoft.Contact.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lxisoft.Contact.repositoryImpl.LoginRepoImpl;



@WebServlet("/logen")
public class LoginValidate extends HttpServlet {

	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException 
	{
			res.setContentType("text/html");
			PrintWriter pw=res.getWriter();
			LoginRepoImpl lr= new LoginRepoImpl();
			
			HttpSession session = req.getSession();
			
			String name= req.getParameter("name");
			String password= req.getParameter("password");
			System.out.println(name);
			System.out.println(password);
			try {
				
			int status=lr.getUser(name,password);
			System.out.println(status+"???????");
			if(status!=0) {
				session.setAttribute("uname", name);
				res.sendRedirect("home.jsp");
			}
			else {
				res.sendRedirect("Signup.jsp");
			}
    		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		}
      	}
