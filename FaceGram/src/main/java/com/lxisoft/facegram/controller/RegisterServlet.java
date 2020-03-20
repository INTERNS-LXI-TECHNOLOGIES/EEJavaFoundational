package com.lxisoft.facegram.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lxisoft.facegram.Model.UserDetails;
import com.lxisoft.facegram.repo.Repo;
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		Repo repo = new Repo();
		UserDetails user = new UserDetails();
		user.setName(req.getParameter("name"));
	    user.setEmail(req.getParameter("email"));
	    user.setBio(req.getParameter("bio"));
	    user.setPassword(req.getParameter("password"));
		HttpSession ses = req.getSession();
		
		try {
			repo.addUser(user);
			res.sendRedirect("index.jsp");
		} catch (Exception e) {
			
			e.printStackTrace();
		};
	}
}
