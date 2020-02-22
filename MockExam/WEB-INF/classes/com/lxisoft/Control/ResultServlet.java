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
    int c=0;
    int totalMark=0;
    ArrayList<ExamModel> emodels;
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
          
        String option=request.getParameter("option");
        String i=request.getParameter("qstNo");
        SqlRepository sqlrepo=new SqlRepository();
        emodels=sqlrepo.readFromDatabase(emodels);
        HttpSession session=request.getSession();

        System.out.println("check"+emodels.size());

        System.out.println(option);
       /* for(int j=0;j<emodels.size();j++)
        {
           
           /* if((emodels.get(j).getQuestion()).equals(i))
            {
                c=j;
            } */
           /*  if(option.equals(emodels.get(j).getAnswer()))
             {
                System.out.println("sssssss");
                    totalMark++;
             }
        }       */
        session.setAttribute("mark",totalMark);
        response.sendRedirect("QuestionServlet");  

	}
}

    
        