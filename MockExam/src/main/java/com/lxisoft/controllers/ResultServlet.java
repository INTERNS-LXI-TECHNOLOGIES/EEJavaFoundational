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
        PrintWriter out = response.getWriter();
        SqlRepository repository=new SqlRepository();
        String option=request.getParameter("option");
        String i=request.getParameter("i");
        List<Question> questionList=repository.getAllQuestion();
        HttpSession session=request.getSession();
        int count = Integer.parseInt(request.getParameter("indexValue"));
        if((questionList.get(count-1).getAnswer()).equals(option))
        {
            mar++;
        }
        // if((questionList.get(k).getAnswer()).equals(option))
        // {
        //    mar++;
        // }
        //int x = questionList.size()-1;
       

        session.setAttribute("mark",mar);
        int qcount = count -1;
            if(qcount>=questionList.size())
            {
                mar=0;
            }
            out.println("condition:"+(qcount>=questionList.size()));
            out.println("count : "+qcount);
            out.println("question.size : "+questionList.size());
            out.println("Mark : "+mar);
            request.getRequestDispatcher("ViewAll.jsp").forward(request,response);
    }
}