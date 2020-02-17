package com.lxisoft.controllers;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.models.*;

public class ReadServlet extends HttpServlet
{
	int c=0;
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		SqlRepository repository=new SqlRepository();
		List<Question> questionList=repository.getAllQuestion();
		for(int i=0;i<questionList.size();i++)
		{
			Question q=new Question();
			q.setQno(questionList.get(i).getQno());
			q.setQuestion(questionList.get(i).getQuestion());
			q.setOption1(questionList.get(i).getOption1());
			q.setOption2(questionList.get(i).getOption2());
			q.setOption3(questionList.get(i).getOption3());
			q.setOption4(questionList.get(i).getOption4());
		}
		c++;
		HttpSession session=request.getSession();
		session.setAttribute("int",c);
		request.setAttribute("questionlist",questionList);	
		RequestDispatcher rd=request.getRequestDispatcher("ViewAll.jsp");
		rd.forward(request,response);
	}
}