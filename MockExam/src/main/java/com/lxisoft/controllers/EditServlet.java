package com.lxisoft.controllers;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.models.*;

public class EditServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		Question q=new Question();
		SqlRepository repository=new SqlRepository();
		String qno=request.getParameter("qno");
		q.setQuestion(request.getParameter("question"));
		q.setOption1(request.getParameter("option1"));
		q.setOption2(request.getParameter("option2"));
		q.setOption3(request.getParameter("option3"));
		q.setOption4(request.getParameter("option4"));
		q.setAnswer(request.getParameter("answer"));
		Question qn=repository.updateQuestions(q,qno);
		request.setAttribute("questions",qn);
		HttpSession session=request.getSession();
		session.setAttribute("question",qn);
		RequestDispatcher rd=request.getRequestDispatcher("View.jsp");
		response.sendRedirect("index.jsp");
	}
}