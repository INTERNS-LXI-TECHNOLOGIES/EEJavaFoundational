package com.lxisoft.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.io.IOException;


public class Contacts extends HttpServlet  {

	public Contacts(){
	super();
	}

	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		if(request.getParameter("view") != null)
System.out.println(" <he> test1 selected");

if(request.getParameter("update") != null)
System.out.println(" <he>test2 selected");
	}
}

