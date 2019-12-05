package com.lxisoft;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ViewServlet extends HttpServlet
{
	// public void init()throws ServletExecption
	// {
	// }
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
   		response.setContentType("text");
   		PrintWriter out = response.getWriter();
      	out.println("<h1>" + "welcome..." + "</h1>");
	}
}