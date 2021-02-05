package com.lxisoft.servlet;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import com.lxisoft.repositry.*;
import com.lxisoft.model.*;

public class LoginServlet extends HttpServlet
{
	MysqlRepositry database = new MysqlRepositry();

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		String uname=request.getParameter("username");
		String pword=request.getParameter("password");
		String username="Faris";
		String password="0987654321";

		if(uname.equals(username) && pword.equals(password) )
		{

			RequestDispatcher req=request.getRequestDispatcher("Index.jsp"); 
			req.forward(request,response);
		}
		else
		{
			RequestDispatcher req=request.getRequestDispatcher("ErrorLogin.jsp");
		}
	}
}