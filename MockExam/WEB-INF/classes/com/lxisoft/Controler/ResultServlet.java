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
		HttpSession session = request.getSession(true);
		model = (ArrayList<MockExamModel>)session.getAttribute("Array");
		for(int i=0;i<model.size();i++)
		{
			if(model.get(i).getAnswer().getAnswer().equals(model.get(i).getSelectedOption().getOption()))
			{
				count++;
			}
		}
		request.setAttribute("totalMark",count);
		count =0;
		request.getRequestDispatcher("Result.jsp").forward(request,response);
	}
}