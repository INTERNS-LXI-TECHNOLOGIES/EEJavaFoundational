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
    int count=0;
    int totalMark=0;
    ArrayList<ExamModel> models;
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        String answer;
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        models= (ArrayList<ExamModel>) session.getAttribute("qstn");    
        int option =Integer.parseInt(request.getParameter("option"));
        String questionNo = request.getParameter("value");
        if(option == 1)
        {
            if((models.get(count).getAnswer()).equals(models.get(count).getOpt1()))
            {
                totalMark++;
            }              
        }
        else if(option ==2)
        {
           if((models.get(count).getAnswer()).equals(models.get(count).getOpt2()))
           {
             totalMark++;
           }
        }
        else if(option ==3)
        {
           if((models.get(count).getAnswer()).equals(models.get(count).getOpt3()))
            {
               
               totalMark++;
            }
        }   
        else if(option ==4)
        {
            if((models.get(count).getAnswer()).equals(models.get(count).getOpt4()))
            {
                totalMark++;
            }
        }     
        HttpSession session1 = request.getSession(true);
        session1.setAttribute("Mark",totalMark);
        
        request.getRequestDispatcher("Questionview.jsp").forward(request,response);                 

	}
}

  
