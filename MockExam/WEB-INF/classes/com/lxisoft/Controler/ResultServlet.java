package com.lxisoft.Controler;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.ArrayList;
import com.lxisoft.Model.MockExamModel;
import com.lxisoft.Repository.SqlRepository;
public class ResultServlet extends HttpServlet
{
	private int count;
	private int totalMark;
	private ArrayList<MockExamModel> model;
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession();
		model = (ArrayList<MockExamModel>)session.getAttribute("Array");
		for(int i=0;i<model.size();i++)
		{
			out.println("OutForCompare 1 : "+model.get(i).getAnswer().getAnswer());
				out.println("OutForCompare 2 :"+model.get(i).getSelectedOption().getOption());
			if(model.get(i).getAnswer().getAnswer().equals(model.get(i).getSelectedOption().getOption()))
			{
				out.println("Compare 1 : "+model.get(i).getAnswer().getAnswer());
				out.println("Compare 2 :"+model.get(i).getSelectedOption().getOption());
				count++;
			}
		}
		out.println("Mark : "+count);

		out.println("Size : "+model.size());
		for(int i=0;i<model.size();i++)
		{
			out.println("Question : "+model.get(i).getQuestion().getQuestion());
			out.println("Answer : "+model.get(i).getAnswer().getAnswer());
			out.println("Selected Option : "+model.get(i).getSelectedOption().getOption());
			out.println("***");
		}
		totalMark = count;
		count = 0;
		request.setAttribute("totalMark",totalMark);
		//HttpSession session1 = request.getSession();
		//session1.setAttribute("totalMark",totalMark);
		request.getRequestDispatcher("Result.jsp").forward(request,response);
		// //out.println("Helloo");
	}
}