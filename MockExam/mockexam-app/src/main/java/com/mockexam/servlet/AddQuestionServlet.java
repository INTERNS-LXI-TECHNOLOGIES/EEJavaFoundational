package com.mockexam.servlet;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.mockexam.model.*;
import com.mockexam.repository.*;
public class AddQuestionServlet extends HttpServlet
{
	Model examModel = new Model();
	Database db = new Database();
	public void doGet(HttpServletRequest request ,HttpServletResponse response)throws IOException,ServletException
	{
		String q = request.getParameter("question");
		String op1 = request.getParameter("opt1");
		String op2 = request.getParameter("opt2");
		String op3 = request.getParameter("opt3");
		String op4 = request.getParameter("opt4");
		String ans = request.getParameter("answer");
		examModel.setQuestion(q);
		examModel.setOpt1(op1);
		examModel.setOpt2(op2);
		examModel.setOpt3(op3);
		examModel.setOpt4(op4);
		examModel.setAnswer(ans);
		db.insertMockExamData(examModel);
		response.sendRedirect("../addMsg.jsp");


	}
}
