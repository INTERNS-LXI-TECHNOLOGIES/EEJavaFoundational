package com.lxisoft.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SetAnswereServlet extends HttpServlet
{
	ArrayList<String> userAnsweres = new ArrayList<String>();
	public  void doGet(HttpServletRequest request , HttpServletResponse response) 
	{
		HttpSession session = request.getSession();
		
		
	}

}
