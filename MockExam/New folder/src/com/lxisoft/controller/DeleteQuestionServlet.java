package com.lxisoft.controller;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.model.*;
public class DeleteServlet extends HttpServlet
{
	private Question question=new Question();
	private DatabaseRepo db = new DatabaseRepo();
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		try
		{
			QuestionDatabase db = new QuestionDatabase();
			int id = Integer.parseInt(request.getParameter("id"));
			PrintWriter out = response.getWriter();
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}	