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

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
 
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
		
				Repo repo = new Repo();
				UserDetails user = new UserDetails();
				user.setName(req.getParameter("name"));
			    user.setEmail(req.getParameter("email"));
			    user.setBio(req.getParameter("bio"));
				HttpSession ses = req.getSession();
				UserDetails u = (UserDetails)ses.getAttribute("userName");
				try {
				    repo.updateName(u.getName(),user);
				
					res.sendRedirect("index.jsp");
				} catch (Exception e) {
					
					e.printStackTrace();
				};
			}
	}

