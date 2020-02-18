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
       /* String i=request.getParameter("i");
        // int i = Integer.parseInt(g);
        System.out.println(option);
		List<Question> questionList=repository.getAllQuestion();
        HttpSession session=request.getSession();
        for(int j=0;j<questionList.size();j++)
        {
            if((questionList.get(j).getQno()).equals(i))
            {
                k=j;
            } 
        }
        if((questionList.get(k).getAnswer()).equals(option))
        {
           mar++;
        }
        session.setAttribute("mark",mar);
        response.sendRedirect("admin");
  //   	RequestDispatcher rd=request.getRequestDispatcher("Result.jsp");
		// rd.forward(request,response);*/
	}
}