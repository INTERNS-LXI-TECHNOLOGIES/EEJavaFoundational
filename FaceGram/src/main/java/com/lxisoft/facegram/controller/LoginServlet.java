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


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		Repo r  = new Repo();
		
	 
	    
	    UserDetails u = r.read(req.getParameter("username"));
	    System.out.println(u);
	    System.out.println(req.getParameter("pass"));
	    if(u == null || !u.getPassword().equals(req.getParameter("pass")))  {
	    	res.sendRedirect("index.jsp");
	    } else if(u.getPassword().equals(req.getParameter("pass"))) {
	    	res.sendRedirect("homePage.jsp");
	    }
	    HttpSession session = req.getSession();
	    session.setAttribute("userName", u);
	    		
	}
	
}
