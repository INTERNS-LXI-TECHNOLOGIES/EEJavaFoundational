package com.lxisoft.Control;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
public class QuestionServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException  
    {
       // ArrayList<Question> questions=new ArrayList<Question>();
    	/*SqlRepository sqlrepo = new SqlRepository(); 
       	for(int i=0;i<questions.size();i++)
       	{
       		Question quest=new Question();
       	}		*/
        PrintWriter out=response.getWriter();
        out.println("deegghjj");
    }     
}


 
       