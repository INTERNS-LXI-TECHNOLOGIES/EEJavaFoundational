package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class LanguageSelectServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		String v=request.getParameter("language");
		HttpSession session=request.getSession(); 
		String lang=null;
		String con=null;
		switch(v)
		{
			case "1":lang="en";
					con="US";
					session.setAttribute("la",lang);
					session.setAttribute("co",con);
			case "2":lang="ml";
					con="KL";
					session.setAttribute("la",lang);
					session.setAttribute("co",con);
		}
		// response.sendRedirect("index.jsp");
		RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
		rd.forward(request,response);
	}

}