package com.lxisoft.Control;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import com.lxisoft.Model.ExamModel;
import com.lxisoft.Repository.SqlRepository;

public class UpdateServlet  extends HttpServlet
{
	SqlRepository sqlrepo = new SqlRepository();
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{		
		ExamModel models = new ExamModel();
		PrintWriter out = response.getWriter();
		models.setId(Integer.parseInt(request.getParameter("qNo")));
		models.getQuestion().setQuestion(request.getParameter("question"));
		models.getAnswer().setAnswer(request.getParameter("answer"));
		models.getOption1().setOption(request.getParameter("option1"));
		models.getOption2().setOption(request.getParameter("option2"));
		models.getOption3().setOption(request.getParameter("option3"));
		models.getOption4().setOption(request.getParameter("option4"));
		sqlrepo.updateQuestion(models);
		request.getRequestDispatcher("Admin.jsp").forward(request,response);

	}
}