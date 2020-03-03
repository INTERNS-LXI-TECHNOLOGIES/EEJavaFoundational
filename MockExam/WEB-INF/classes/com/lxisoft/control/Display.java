package com.lxisoft.Display;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.lang.Math;
import java.util.*;
import com.lxisoft.sqlrepository.*;
import com.lxisoft.model.*;
public class Display
{

	ArrayList<Model> datas= new ArrayList<Model>();

	  Sqlrepository sqlrep=new Sqlrepository();	
	  
	 public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException  
    {  
    	HttpSession session=req.getSession(); 
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
       datas=sqlrep.readquestion();
       session.setAttribute("data",datas);

	}
}