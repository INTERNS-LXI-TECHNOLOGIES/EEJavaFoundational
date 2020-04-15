package com.mockexam.servlet;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.mockexam.model.*;
import com.mockexam.repository.*;
public class UpdateQuestionServlet extends HttpServlet
{
	Model updateModel = new Model();
	Database db = new Database();
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
	{
		String qid = request.getParameter("id");
		String question = request.getParameter("ques");
		String op1 = request.getParameter("op1");
		String op2 = request.getParameter("op2");
		String op3 = request.getParameter("op3");
		String op4 = request.getParameter("op4");
		String ans = request.getParameter("ans");
		
		int id = Integer.parseInt(qid);
		updateModel.setId(id);
		updateModel.setQuestion(question);
		updateModel.setOpt1(op1);
		updateModel.setOpt2(op2);
		updateModel.setOpt3(op3);
		updateModel.setOpt4(op4);
		updateModel.setAnswer(ans);
		db.updateMockExamData(updateModel);
		response.sendRedirect("updateMsg.jsp");

	}
}