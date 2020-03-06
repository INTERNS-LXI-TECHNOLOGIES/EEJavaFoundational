package com.lxisoft.control;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.lang.Math;
import java.util.*;
import com.lxisoft.sqlrepository.*;
import com.lxisoft.model.*;
public class Add extends HttpServlet
{    
    Sqlrepository sqlrep=new Sqlrepository();
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException  
    {  
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
      
        Model model=new Model();
        
       //out.println(req.getParameter("question"));
        HttpSession session=req.getSession(); 
    
        String question=req.getParameter("question");
        model.setQuestion(question);
        String answer=req.getParameter("Answer");
        model.setAnswer(answer);
        String option1=req.getParameter("option1");
        model.setOption1(option1);
        String option2=req.getParameter("option2");
        model.setOption2(option2);
        String option3=req.getParameter("option3");
        model.setOption3(option3);

        sqlrep.addQuestion(model);
        out.println("Question : "+model.getQuestion());
        res.sendRedirect("add.jsp");
    }
   
   
}

