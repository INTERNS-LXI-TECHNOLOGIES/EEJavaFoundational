package com.lxisoft.controllers;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.models.*;

public class SearchServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        String l=request.getParameter("letter");
    	SqlRepository repository=new SqlRepository();
    	List<Question> questionList=repository.getAllQuestion();
    	List<Question> q=new ArrayList<Question>();
        for(int i=0;i<questionList.size();i++)
        {
            if((questionList.get(i).getQuestion()).contains(l))
            {
                q.add(questionList.get(i));
            }
        }
        request.setAttribute("question",q);
    	RequestDispatcher rd=request.getRequestDispatcher("Search.jsp");
		rd.forward(request,response);
    }
}
