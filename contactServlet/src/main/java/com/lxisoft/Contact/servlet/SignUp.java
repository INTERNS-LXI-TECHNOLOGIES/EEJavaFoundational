package com.lxisoft.Contact.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lxisoft.Contact.model.ContactModel;
import com.lxisoft.Contact.model.User;
import com.lxisoft.Contact.repositoryImpl.LoginRepoImpl;


@WebServlet("/SignUp")
public class SignUp extends HttpServlet
{
	LoginRepoImpl lg= new LoginRepoImpl();
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		try {
			User user =new User();
			HttpSession session = req.getSession();
			String fullName=req.getParameter("name");
			String email=req.getParameter("email");
			String userName= req.getParameter("username");
			String phoneNumber=req.getParameter("PhoneNumber");
			String password=req.getParameter("pass");
			user.setName(fullName);
			user.setEmail(email);
			user.setUsername(userName);
			user.setPhonenumber(phoneNumber);
			user.setPassword(password);
			lg.setUser(user);
    		PrintWriter out = res.getWriter();
    		res.sendRedirect("Login.jsp");
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
		}

}
