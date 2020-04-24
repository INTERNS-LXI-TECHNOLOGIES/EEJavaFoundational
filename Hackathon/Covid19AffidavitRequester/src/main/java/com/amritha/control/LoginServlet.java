package com.amritha.control;
import javax.servlet.*;
import javax.servlet.http.*;

import com.amritha.repository.SqlRepositoryAmr;

import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet
{
	SqlRepositoryAmr sqlrepo=new SqlRepositoryAmr();
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  	{	 
	    HttpSession session=request.getSession(true);
	  	PrintWriter out = response.getWriter();
	    String username = request.getRemoteUser();
	    String role=sqlrepo.selectUser(username);
	    response.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html: charset=utf-8");
	    if(role.equals("admin"))
	    {
	         response.sendRedirect("Admin.jsp");
	    }
	    else if(role.equals("user"))
	    {
	        response.sendRedirect("User.jsp");
	    }
  	}
}


