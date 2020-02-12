package com.lxisoft.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Servlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res)  
    throws ServletException,IOException  
    {  
        res.setContentType("text/html");
        PrintWriter pw=res.getWriter();
        System.out.println("hello");  
    }
}
