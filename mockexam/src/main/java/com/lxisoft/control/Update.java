package com.lxisoft.control;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.lang.Math;
import java.util.*;
import com.lxisoft.sqlrepository.*;
import com.lxisoft.model.*;
public class Update extends HttpServlet
{    
    Sqlrepository sqlrep=new Sqlrepository();
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException  
    {  
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
      
         Model model=new Model();
        
       //out.println(req.getParameter("question"));
          HttpSession session=req.getSession(); 
        int id=Integer.parseInt(req.getParameter("Id"));
        model.setId(id);
        String question=req.getParameter("question1");
        model.setQuestion(question);
        String answer=req.getParameter("Answer1");
        model.setAnswer(answer);
        String option1=req.getParameter("option11");
        model.setOption1(option1);
        String option2=req.getParameter("option21");
        model.setOption2(option2);
        String option3=req.getParameter("option31");
        model.setOption3(option3);

        sqlrep.editQuestion(model);
     ArrayList<Model> questions= new ArrayList<Model>();
     Sqlrepository sqlrep=new Sqlrepository();
     questions.clear();
     questions=sqlrep.readquestion(questions); 
     session.setAttribute("array",questions);
      req.getRequestDispatcher("table.jsp").forward(req,res);
        
    }
   
   
}

