package com.lxisoft.contact.servlets;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/SignUp")
public class SignUpServlet extends HttpServlet 
{
     public void doPost(HttpServletRequest request,HttpServletResponse response)
     {
    	 String u=request.getParameter("userName");
    	 String p=request.getParameter("password");
    	 System.out.println("qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
     }
}