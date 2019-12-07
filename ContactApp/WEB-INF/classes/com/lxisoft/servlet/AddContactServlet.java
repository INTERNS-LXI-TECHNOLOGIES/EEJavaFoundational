package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
public class AddContactServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		String name=request.getParameter("name");
		String number=request.getParameter("number");
	}
}