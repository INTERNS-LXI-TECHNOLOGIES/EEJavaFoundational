package com.lxisoft.Contact.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lxisoft.Contact.model.SignupModel;
import com.lxisoft.Contact.repositoryImpl.LoginRepoImpl;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {

	
		LoginRepoImpl loginRepo = new LoginRepoImpl();
		HttpSession ses = req.getSession();
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			try {
				SignupModel sml = new SignupModel();
				sml.setUserName(username);
				sml.setPassword(password);
				loginRepo.setUser(sml);
				ses.invalidate();
				res.sendRedirect("/contact");
			} catch (ClassNotFoundException e) {
			
				e.printStackTrace();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		}
	}