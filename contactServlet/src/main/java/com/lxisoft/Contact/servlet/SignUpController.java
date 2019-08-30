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

import com.lxisoft.Contact.model.SignupModel;
import com.lxisoft.Contact.repositoryImpl.RepoDataSource;
import com.lxisoft.Contact.repositoryImpl.LoginRepoImpl;


@WebServlet("/sign")
public class SignUpController extends HttpServlet {
	
	LoginRepoImpl lr= new LoginRepoImpl();
	
	int count = 0;
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException 
	{
		try {
			HttpSession session = req.getSession();
			SignupModel sml = new SignupModel();
    		String name=req.getParameter("name");
			String phone_number=req.getParameter("phone");
			String mail_id=req.getParameter("newemailmail");
			String user_name=req.getParameter("username");
			String pass_word=req.getParameter("Password");
			sml.setName(name);
			sml.setPhoneNumber(phone_number);
			sml.setMailId(mail_id);
			sml.setUserName(user_name);
			sml.setPassword(pass_word);
			String st=(String) session.getAttribute("uname");
			lr.setUser(sml);
			res.sendRedirect("Login.jsp");
//    		PrintWriter out = res.getWriter();
//      		out.println("<a href="+"Read.jsp"+">back to jsp</a>");
		}
		catch(Exception e) {
		}
		}
      	}
