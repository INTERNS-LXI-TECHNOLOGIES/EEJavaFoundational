package com.lxisoft.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ViewAllContacts extends HttpServlet 
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
      response.setContentType("text");
      PrintWriter out = response.getWriter();
      out.println("<h1>" + "HELLOOOOO" + "</h1>");
    }
}