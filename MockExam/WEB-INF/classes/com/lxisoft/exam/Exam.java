package com.lxisoft.exam;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.lang.Math;
import java.util.*;
import com.lxisoft.sqlrepository.*;
import com.lxisoft.model.*;
public class Exam extends HttpServlet
{
    int num=0;
	
	Sqlrepository sqlrep=new Sqlrepository();
	public void doGet(HttpServletRequest req,HttpServletResponse res)  
    throws ServletException,IOException  
    {  
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        
        ArrayList<Model> repo=new ArrayList<Model>();
        repo.clear();
        repo=sqlrep.readquestion();

        
       // out.println(repo);

        HttpSession session=req.getSession(); 
        if(num<repo.size())
        {

            session.setAttribute("array",repo);
            session.setAttribute("num",num);
            res.sendRedirect("view1.jsp"); 


        }
        else
        {
            res.sendRedirect("result.jsp");
        }
        num++;
        
    }
   
   
}

