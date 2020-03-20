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
		SqlRepository repository=new SqlRepository();
		List<Question> questionList=repository.getAllQuestion();
		HttpSession session=request.getSession();
		session.setAttribute("questionlist",questionList);
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		request.getRequestDispatcher("ViewAll.jsp").forward(request,response);
	}
}