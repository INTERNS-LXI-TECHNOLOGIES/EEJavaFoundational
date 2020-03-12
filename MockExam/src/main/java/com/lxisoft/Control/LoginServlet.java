package com.lxisoft.Control;
import com.lxisoft.SqlRepository.*;
import com.lxisoft.Model.*;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet 
{ 
	SqlRepository sqlrepo=new SqlRepository();
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  	{	 
	    HttpSession session=request.getSession(true);
	  	PrintWriter out = response.getWriter();
	    String username = (String)request.getRemoteUser();
	    String role=sql.select(username);
	    if(role.equals("admin"))
	    {
	         response.sendRedirect("Admin.jsp");
	    }
	    else if(role.equals("user"))
	    {
	        response.sendRedirect("Instruction.jsp");
	    }
  	}
}