package com.lxisoft.control;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.lang.Math;
import java.util.*;
import com.lxisoft.sqlrepository.*;
import com.lxisoft.model.*;
public class Display extends HttpServlet
{

	ArrayList<Model> datas= new ArrayList<Model>();	
	 public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException  
    {  
    	HttpSession session=req.getSession(); 
        res.setContentType("text/html");

        req.setCharacterEncoding("UTF-8");
        res.setContentType("text/html; charset=utf-8");
        PrintWriter out=res.getWriter();
         ArrayList<Model> questions= new ArrayList<Model>();
     Sqlrepository sqlrep=new Sqlrepository();
     questions.clear();
     questions=sqlrep.readquestion(questions); 
     session.setAttribute("array",questions);
        req.getRequestDispatcher("display.jsp").forward(req,res);
        /*for (int i=0;i<datas.size();i++) 
        {
          out.println(datas.get(i).getQuestion());
          out.println(datas.get(i).getAnswer());
          out.println(datas.get(i).getOption1());
          out.println(datas.get(i).getOption2());
          out.println(datas.get(i).getOption3());
        }*/
	}
}