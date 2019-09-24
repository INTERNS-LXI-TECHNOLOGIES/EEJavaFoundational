package com.lxisoft.contact.controller;
import com.lxisoft.contact.model.*;
import com.lxisoft.contact.repository.*;
import javax.servlet.http.*;  
import javax.servlet.*;  
import java.io.*; 
import java.util.*; 
public class LogoutServlet extends HttpServlet{ 

public void doPost(HttpServletRequest req,HttpServletResponse res)  throws ServletException,IOException,IndexOutOfBoundsException
{ 
	try{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		HttpSession session=req.getSession();  
        session.invalidate();  
        res.sendRedirect("home.jsp");
        out.close();
    }
    catch(Exception e)
    {
    	e.printStackTrace();
    }
}
}