package com.lxisoft.facegram.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import com.lxisoft.facegram.repo.*;
import com.lxisoft.facegram.Model.UserDetails;
@WebServlet("/adduser")
public class createServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		Repo repo = new Repo();
		UserDetails user = new UserDetails();
		user.setName(req.getParameter("name"));
	    user.setAddress(req.getParameter("address"));
		HttpSession ses = req.getSession();
		
		try {
			repo.addUser(user);
			//res.sendRedirect("user");
		} catch (Exception e) {
			
			e.printStackTrace();
		};
	}
	
}