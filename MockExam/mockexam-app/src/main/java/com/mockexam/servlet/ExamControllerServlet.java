package com.mockexam.servlet;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.mockexam.model.*;
import com.mockexam.repository.*;
public class ExamControllerServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			String count = request.getParameter("count");
			ArrayList<Model> examQA = new  ArrayList<Model>();
			Database db = new Database();
			examQA = db.getMockExamData(examQA);
			out.println(examQA.size());
			request.setAttribute("count",0);
			HttpSession session = request.getSession();
			session.setAttribute("examdatas",examQA);
			request.getRequestDispatcher("questions.jsp").forward(request,response);
		
	}
}