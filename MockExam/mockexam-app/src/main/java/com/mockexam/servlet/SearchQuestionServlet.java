package com.mockexam.servlet;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.mockexam.model.*;
import com.mockexam.repository.*;
public class SearchQuestionServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		Database db = new Database();
		ArrayList<Model> questionData = new ArrayList<Model>();
		String id = (String)request.getParameter("searchname");
		int searchId = Integer.parseInt(id);
		questionData = db.searchQuestion(questionData,searchId);
		if(questionData.size() == 0)
		{
			response.sendRedirect("searchError.jsp");
		}
		else
		{
			request.setAttribute("searchList",questionData);
			request.getRequestDispatcher("SearchResults.jsp").forward(request,response);	
		}
	}
}