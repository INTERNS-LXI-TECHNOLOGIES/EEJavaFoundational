package com.lxisoft.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;


public class WelcomeServlet extends HttpServlet {

 public void doGet(HttpServletRequest request,
 HttpServletResponse response)
throws IOException, ServletException
{
	
	
	try {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("jsp/welcome.jsp");
        requestDispatcher.forward(request, response);
       } catch (Exception ex) {
           ex.printStackTrace ();
       }
	
}
	
}