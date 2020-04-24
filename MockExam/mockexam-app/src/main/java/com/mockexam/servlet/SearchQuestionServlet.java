package com.mockexam.servlet;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.mockexam.model.*;
import com.mockexam.repository.*;
public class SearchQuestionServlet extends HttpServlet
{
	Database db = new Database();
	ArrayList<Model> questionData = new ArrayList<Model>();
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		
		String qSearch = request.getParameter("question");
		questionData = db.searchQuestion(questionData,qSearch);
		if(questionData.size() == 0)
		{
			response.sendRedirect("searchError.jsp");
			return;
		}
		else
		{
			request.setAttribute("searchList",questionData);
			request.getRequestDispatcher("SearchResults.jsp").forward(request,response);	
		}
	}
}