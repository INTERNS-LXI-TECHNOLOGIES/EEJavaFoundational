package com.lxisoft.controllers;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.models.*;

public class ResultServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		SqlRepository repository=new SqlRepository();
		String option=request.getParameter("option");
		List<Question> questionList=repository.getAllQuestion();
    	List<Question> q=new ArrayList<Question>();
        for(int i=0;i<questionList.size();i++)
        {
        	
            if((questionList.get(i).getAnswer()).equals(option))
            {
            	
                q.add(questionList.get(i));
                
            }
        }
        request.setAttribute("questionlist",q);
    	RequestDispatcher rd=request.getRequestDispatcher("Result.jsp");
		rd.forward(request,response);
	}
}