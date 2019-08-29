package com.lxisoft.Contact.servlet;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/logout")
public class LogoutController extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	{
		HttpSession session=req.getSession();
		
		try {
			session. removeAttribute("uname");
			session.invalidate();
			res.sendRedirect("Login.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
