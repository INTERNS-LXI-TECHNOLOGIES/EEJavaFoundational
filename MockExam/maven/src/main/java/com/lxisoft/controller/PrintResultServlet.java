package com.lxisoft.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lxisoft.repository.DatabaseRepo;

public class PrintResultServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	private DatabaseRepo db = new DatabaseRepo();
	public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException
	{
		PrintWriter pw = response.getWriter();
		HttpSession sessions = request.getSession(false);
		String userId =(String) sessions.getAttribute("userId");
		int userMark = (Integer) sessions.getAttribute("userMark");
		//pw.println("mark = "+userMark);
		db.addResult(userId , userMark);
		request.getRequestDispatcher("Result.jsp").forward(request,response);
	}

}
