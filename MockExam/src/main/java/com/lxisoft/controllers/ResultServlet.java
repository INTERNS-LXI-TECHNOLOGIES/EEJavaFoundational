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
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        PrintWriter out = response.getWriter();
        SqlRepository repository=new SqlRepository();
        String option=request.getParameter("option");
        String i=request.getParameter("i");
        List<Question> questionList=repository.getAllQuestion();
        HttpSession session=request.getSession(true);
        int count = Integer.parseInt(request.getParameter("indexValue"));
        if((questionList.get(count-1).getAnswer()).equals(option))
        {
            mar++;
        }
        session.setAttribute("mark",mar);
        if(count==questionList.size())
        {
            out.println("Inside Loop");
            mar=0;
        }
        request.getRequestDispatcher("ViewAll.jsp").forward(request,response);
    }
}