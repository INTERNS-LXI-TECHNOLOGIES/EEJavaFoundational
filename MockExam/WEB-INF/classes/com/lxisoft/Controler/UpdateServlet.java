package com.lxisoft.Controler;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.ArrayList;
import com.lxisoft.Model.MockExamModel;
import com.lxisoft.Repository.SqlRepository;
public class UpdateServlet  extends HttpServlet
{
	SqlRepository sqlReppo = SqlRepository.getInstance();
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		MockExamModel model = new MockExamModel();
		PrintWriter out = response.getWriter();
		model.setId(Integer.parseInt(request.getParameter("Id")));
		model.getQuestion().setQuestion(request.getParameter("question"));
		model.getAnswer().setAnswer(request.getParameter("answer"));
		model.getOption1().setOption(request.getParameter("option1"));
		model.getOption2().setOption(request.getParameter("option2"));
		model.getOption3().setOption(request.getParameter("option3"));
		sqlReppo.update(model);
		request.getRequestDispatcher("Update.jsp").forward(request,response);


	}
}