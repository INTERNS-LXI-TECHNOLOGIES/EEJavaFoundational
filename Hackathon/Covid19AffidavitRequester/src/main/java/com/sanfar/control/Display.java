package com.sanfar.control;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.lang.Math;
import java.util.*;
import com.sanfar.sqlrepository.*;
import com.sanfar.model.*;
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
         ArrayList<Model> requests= new ArrayList<Model>();
     Sqlrepository sqlrep=new Sqlrepository();
     requests.clear();
     requests=sqlrep.readRequests(requests); 
     session.setAttribute("array",requests);
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