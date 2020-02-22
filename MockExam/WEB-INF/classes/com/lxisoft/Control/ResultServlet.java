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
    int c;
    int totalMark;
    ArrayList<ExamModel> models;
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        models = (ArrayList<ExamModel>)session.getAttribute("qstn");          
        String option=request.getParameter("option");
        //String i=request.getParameter("qstNo");        
        //models=sqlrepo.readFromDatabase(models);
        System.out.println("jjggh"+models.size());
        System.out.println("optionsss"+option);     
       
       /* for(int j=0;j<models.size();j++)
        {
           
           /* if((models.get(j).getQuestion()).equals(i))
            {
                c=j;
            } */
           /*  if(option.equals(models.get(j).getAnswer()))
             {
                System.out.println("sssssss");
                    totalMark++;
             }
        }       */
      /*  session.setAttribute("mark",totalMark);
        response.sendRedirect("QuestionServlet");             
*/

	}
}

    
        