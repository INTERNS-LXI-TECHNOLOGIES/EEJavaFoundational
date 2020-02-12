package com.lxisoft.Control;
import com.lxisoft.Control.Servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.*;
import com.lxisoft.Repository.*;
import com.lxisoft.Model.*;
public class QuestionServlet extends HttpServlet
{
    public  void doPost(ServletRequest request, ServletResponse response)throws ServletException, IOException
    {
    	try
        {
           
            RequestDispatcher rd=request.getRequestDispatcher("Question.jsp");
            rd.forward(request,response);
                       
        }
        catch(Exception e)
        {
            System.out.println(e);
        }        
                      
    }     
    
}
