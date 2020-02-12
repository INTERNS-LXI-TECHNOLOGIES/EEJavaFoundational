package com.lxisoft.Control;
import com.lxisoft.Control.Servlet;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import com.lxisoft.Repository.*;
import com.lxisoft.Model.*;
public class QuestionServlet extends HttpServlet
{
    ArrayList<Question> questions=new ArrayList<Question>
    public  void doPost(ServletRequest request, ServletResponse response)throws ServletException, IOException
    {
    	   SqlRepository sqlrepo = new SqlRepository(); 
           Question q=new Question();
           request.setAttribute(questions);
           RequestDispatcher rd=request.getRequestDispatcher();
           rd.forward(request,response);

                      
    }     
    
}
       