package com.mockexam.servlet;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.mockexam.model.*;
import com.mockexam.repository.*;
public class GetAnswerServlet extends HttpServlet
{
	ArrayList<String> answerList = new  ArrayList<String>();
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		HttpSession session = request.getSession();
		String ans = request.getParameter("ans");
		// answerList = (ArrayList<String>)session.getAttribute("answers");
		answerList.add(ans);
		session.setAttribute("answers",answerList);
		request.getRequestDispatcher("questions.jsp").forward(request,response);
	}
}