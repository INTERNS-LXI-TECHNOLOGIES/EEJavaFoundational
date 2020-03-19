package com.lxisoft.control;
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
	ArrayList<Model> questions= new ArrayList<Model>();
	Sqlrepository sqlrep=new Sqlrepository();
	public void doGet(HttpServletRequest req,HttpServletResponse res)  
    throws ServletException,IOException  
    {  
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        questions.clear();
        questions=sqlrep.readquestion(questions);
       // out.println(questions);
        HttpSession session2=req.getSession(); 
        out.println("haiiii");
      /*  if(num<questions.size())
        {
            session2.setAttribute("num",num); 
            req.getRequestDispatcher("view1.jsp").forward(req,res);

        }
        else
        {
            res.sendRedirect("result.jsp");
            //num=0;
        }
        num++;
        */
    }
   
   
}