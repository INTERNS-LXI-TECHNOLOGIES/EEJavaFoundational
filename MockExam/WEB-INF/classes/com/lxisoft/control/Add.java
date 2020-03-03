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
        ArrayList<String> datas=new ArrayList<String>();
        datas.clear();
        
       // out.println(repo);
        HttpSession session=req.getSession(); 
    
        String question=req.getParameter("question");
        datas.add(question);
        String answer=req.getParameter("Answer");
        datas.add(answer);
        String option1=req.getParameter("option1");
        datas.add(option1);
        String option2=req.getParameter("option2");
        datas.add(option2);
        String option3=req.getParameter("option3");
        datas.add(option3);

        sqlrep.addquestion(datas);
    }
   
   
}

