package com.lxisoft.controllers;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.models.*;

public class ReadServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		SqlRepository repo=new SqlRepository();
		List<Question>questionList=repo.getAllQuestion();
		for(int i=0;i<questionList.size();i++)
		{
			Question q=new Question();
			q.setQno(questionList.get(i).getQno());
			q.setQno(questionList.get(i).getQno());
			q.setQno(questionList.get(i).getQno());
			q.setQno(questionList.get(i).getQno());
			q.setQno(questionList.get(i).getQno());
			q.setQno(questionList.get(i).getQno());
			q.setQno(questionList.get(i).getQno());
			
		}
		request.setAttribute("questionlist",questionList);
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.forward(request,response);
	}
}