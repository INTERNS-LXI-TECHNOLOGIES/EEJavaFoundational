package com.lxisoft.Control;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.ArrayList;
import com.lxisoft.Model.ExamModel;
import com.lxisoft.Repository.SqlRepository;
public class UpdateServlet  extends HttpServlet
{
	SqlRepository sqlrepo =new SqlRepository();
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		ExamModel models = new ExamModel();
		PrintWriter out = response.getWriter();
		models.setId(Integer.parseInt(request.getParameter("Id")));
		models.setQuestion(request.getParameter("question"));
		models.setOpt1(request.getParameter("option1"));
		models.setOpt2(request.getParameter("option2"));
		models.setOpt3(request.getParameter("option3"));
		models.setOpt4(request.getParameter("option4"));
		models.setAnswer(request.getParameter("answer"));
		sqlrepo.updateQuestion(models);
		request.getRequestDispatcher("Update.jsp").forward(request,response);


	}
}