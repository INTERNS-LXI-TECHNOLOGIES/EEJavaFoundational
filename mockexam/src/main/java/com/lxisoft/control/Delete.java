package com.lxisoft.control;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.lang.Math;
import java.util.*;
import com.lxisoft.sqlrepository.*;
import com.lxisoft.model.*;
public class Delete extends HttpServlet
{    
    Sqlrepository sqlrep=new Sqlrepository();
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException  
    {  
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        //out.println(req.getParameter("question"));
        int id=Integer.parseInt(req.getParameter("Delete"));
        HttpSession session=req.getSession();

        

        sqlrep.deleteQuestion(id);

        ArrayList<Model> questions= new ArrayList<Model>();
        Sqlrepository sqlrep=new Sqlrepository();
        questions.clear();
        questions=sqlrep.readquestion(questions); 
        session.setAttribute("array",questions);
        req.getRequestDispatcher("delete.jsp").forward(req,res);

    }
   
   
}

