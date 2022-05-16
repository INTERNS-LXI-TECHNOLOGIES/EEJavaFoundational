package com.lxisoft.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;


public class VegetableServlet extends HttpServlet {

 public void doGet(HttpServletRequest request,
 HttpServletResponse response)
throws IOException, ServletException
{
	try {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("jsp/vegetable.jsp");
        requestDispatcher.forward(request, response);
       } catch (Exception ex) {
           ex.printStackTrace ();
       }
	
}
	
}