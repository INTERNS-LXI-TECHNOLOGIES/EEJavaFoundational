package com.lxisoft.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.lang.Math;
import java.util.*;
import com.lxisoft.sqlrepository.*;
import com.lxisoft.model.*;
public class Servlet extends HttpServlet
{
	ArrayList<String> questions = new ArrayList<String>(); 
	Model model=new Model();
	Sqlrepository sqlrep=new Sqlrepository();
	public void doGet(HttpServletRequest req,HttpServletResponse res)  
    throws ServletException,IOException  
    {  
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
       	readquestion();
        res.sendRedirect("introduction.jsp");
    }
    public int random()
	{
		int rand=(int)(Math.random()*2)+1;
		return rand;
	}
    public void readquestion()
    {
    	int rand1=random();
        ArrayList<Model> repo=sqlrep.readquestion(rand1);
            
    }
}

