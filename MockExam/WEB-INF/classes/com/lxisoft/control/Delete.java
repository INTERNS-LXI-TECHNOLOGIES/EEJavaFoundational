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
      
         Model model=new Model();
        
       //out.println(req.getParameter("question"));
       int id=Integer.parseInt(req.getParameter("Id"));
        HttpSession session=req.getSession(); 
        model.setId(id);
        sqlrep.editQuestion(model);
        req.getRequestDispatcher("delete.jsp").forward(req,res);
        
    }
   
   
}

