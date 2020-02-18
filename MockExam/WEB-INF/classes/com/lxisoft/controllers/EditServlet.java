package com.lxisoft.controllers;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.models.*;

public class EditServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		Question q=new Question();
		SqlRepository repo=new SqlRepository();
		String question=request.getParameter("question");
		String option1=request.getParameter("option1");
		String option2=request.getParameter("option2");
		String option3=request.getParameter("option3");
		String option4=request.getParameter("option4");
		String answer=request.getParameter("answer");
		String qno=request.getParameter("qno");
		q.setQuestion(question);
		q.setOption1(option1);
		q.setOption2(option2);
		q.setOption3(option3);
		q.setOption4(option4);
		q.setAnswer(answer);
		Question qn=repo.updateQuestion(qno,q);
		request.setAttribute("questions",qn);
		HttpSession session=request.getSession();
		session.setAttribute("question",qn);
		RequestDispatcher rd=request.getRequestDispatcher("View.jsp");
		rd.forward(request,response);
	}
}