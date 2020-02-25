package com.lxisoft.Control;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Repository.*;
import com.lxisoft.Control.*;
import com.lxisoft.Model.*;

public class ResultServlet extends HttpServlet
{
    int c,b;
    int totalMark;
    ArrayList<ExamModel> models;
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        String answer;
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        models= (ArrayList<ExamModel>) session.getAttribute("qstn");    
        int option =Integer.parseInt(request.getParameter("option"));
        String questionNo = (String)request.getAttribute("questionNo");
        //String abc = request.getParameter("value");
        
        /*out.println("jjggh : "+models.size());
        out.println("optionsss : "+option);  
        out.println("Question No : "+abc);*/
        if(option == 1)
        {
            b=option;    
            for(int j=0;j<models.size();j++)
            {
               
               /*if((models.get(j).getQuestion()).equals(b))
                {
                    c=j;
                } */
                if((models.get(j).getAnswer()).equals(option))
                {
                   
                        totalMark++;
                }
            }  
        }
        else
        {

        }    
       ession.setAttribute("mark",totalMark);
       response.sendRedirect("Result.jsp");             


	}
}

    
        