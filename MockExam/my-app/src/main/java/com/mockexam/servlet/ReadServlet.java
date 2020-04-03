package com.mockexam.servlet;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.mockexam.model.*;
import com.mockexam.repository.*;
public class ReadServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		try
		{
			ArrayList<Model> examQA = new  ArrayList<Model>();
			Database db = new Database();
			examQA = db.getMockExamData(examQA);
			HttpSession session = request.getSession();
			session.setAttribute("examdata",examQA);
			request.getRequestDispatcher("questions.jsp").forward(request,response);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
}