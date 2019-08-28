package com.lxisoft.Contact.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lxisoft.Contact.model.User;
import com.lxisoft.Contact.repositoryImpl.LoginRepoImpl;


@WebServlet("/Login")
public class Login extends HttpServlet
{
public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {


		res.setContentType("text/html");
		PrintWriter pw= res.getWriter();
		
		
		LoginRepoImpl lg = new LoginRepoImpl();
		HttpSession session = req.getSession();
			String name = req.getParameter("Username");
			String pass = req.getParameter("pass");
			try {
			int status=lg.getDetails(name, pass);
				if(status!=0)
				{
					session.setAttribute("uname", name);
					res.sendRedirect("index.jsp");
				
				}
				else {
					
					res.sendRedirect("SignUp.jsp");		
				}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
	}

}
