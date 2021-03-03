package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
import java.io.*;
import javax.servlet.http.HttpServlet;
import com.lxisoft.model.*;
import com.lxisoft.repository.*;



public class AddServlet extends HttpServlet
{
	public AddServlet(){
		super();
	}

	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException , IOException
	{
		
	   UserRepository userrepo = new UserRepository();
	   String name= request.getParameter("name");
	   String age= request.getParameter("age");
	   String address= request.getParameter("address");
	   String email= request.getParameter("email");
	   String number= request.getParameter("number");
	   String blood= request.getParameter("blood");
	   Userdetails userdetails = new Userdetails();
	   userdetails.setName(name);
	   userdetails.setAge(age);
	   userdetails.setAddress(address);
	   userdetails.setMailId(email); 
	   userdetails.setNumber(number);
	   userdetails.setBloodGroup(blood);
	   userrepo.addToDatabase(name,age,address,email,number,blood);

	   RequestDispatcher rd = request.getRequestDispatcher("/ViewServlet");
		rd.forward(request,response);
	}
	
}