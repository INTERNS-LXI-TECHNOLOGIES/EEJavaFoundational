package com.lxisoft.Controler;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.ArrayList;
import com.lxisoft.Model.MockExamModel;
import com.lxisoft.Repository.SqlRepository;
public class AddServlet  extends HttpServlet
{
	private MockExamModel model ;
	private SqlRepository sqlReppo ;
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		sqlReppo = SqlRepository.getInstance();
		model = new MockExamModel();
		model.getQuestion().setQuestion(request.getParameter("question"));
		model.getAnswer().setAnswer(request.getParameter("answer"));
		model.getOption1().setOption(request.getParameter("option1"));
		model.getOption2().setOption(request.getParameter("option2"));
		model.getOption3().setOption(request.getParameter("option3"));
		sqlReppo.insertDataToDatabase(model);
		
		request.getRequestDispatcher("Admin.jsp").forward(request,response);
	}
	
}