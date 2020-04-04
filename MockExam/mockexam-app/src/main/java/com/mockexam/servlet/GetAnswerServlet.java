package com.mockexam.servlet;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.mockexam.model.*;
import com.mockexam.repository.*;
public class GetAnswerServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		try
		{
			ArrayList<String> ans = new ArrayList<String>();
			PrintWriter writer = response.getWriter();
			String answer = request.getParameter("ans");
			String count = request.getParameter("ques");
			// writer.println(answer);
			// writer.println(count);
			ans.add(answer);
			// writer.println(ans.size());
			request.getRequestDispatcher("questions.jsp").forward(request,response);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
}