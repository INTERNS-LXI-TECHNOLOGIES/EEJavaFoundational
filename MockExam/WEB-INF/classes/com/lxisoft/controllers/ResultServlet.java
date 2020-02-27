package com.lxisoft.controllers;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.models.*;

public class ResultServlet extends HttpServlet
{
    int mar=0;
    int k=0;
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{

        String[] option = request.getParameterValues("option");
		SqlRepository repository=new SqlRepository();
		// String option=request.getParameter("option");
        String i=request.getParameter("i");
        
		List<Question> questionList=repository.getAllQuestion();
        HttpSession session=request.getSession();
        for(String o:option)
        {
            System.out.println(o);
        }
        session.setAttribute("mark",mar);
        response.sendRedirect("admin");
	}
}