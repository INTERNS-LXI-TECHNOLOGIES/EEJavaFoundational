package com.lxisoft.Control;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.ArrayList;
import com.lxisoft.Model.ExamModel;
import com.lxisoft.Repository.SqlRepository;
public class UpdateServlet  extends HttpServlet
{	
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		//SqlRepository sqlrepo =new SqlRepository();
		//ExamModel models = new ExamModel();
		PrintWriter out = response.getWriter();
		/*models.setId(Integer.parseInt(request.getParameter("id")));
		models.setQuestion(request.getParameter("question"));
		models.setOpt1(request.getParameter("option1"));
		models.setOpt2(request.getParameter("option2"));
		models.setOpt3(request.getParameter("option3"));
		models.setOpt4(request.getParameter("option4"));
		models.setAnswer(request.getParameter("answer"));
		sqlrepo.updateQuestion(models);*/
		String qry="update mockexam set question=models.getQuestion()+Option1=models.getOpt1()+Option2=models.getOpt2()+Option3=models.getOpt3()+Option4=models.getOpt4()+Answer=models.getAnswer() where id=models.getId()";
		out.println("query"+qry);
		out.println("q"+request.getParameter("question"));
		out.println()
		
		//request.getRequestDispatcher("Update.jsp").forward(request,response);
		
	}
}