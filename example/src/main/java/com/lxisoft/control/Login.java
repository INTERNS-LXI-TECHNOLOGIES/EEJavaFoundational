package com.lxisoft.control;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.lang.Math;
import java.util.*;
import com.lxisoft.sqlrepository.*;
import com.lxisoft.model.*;
import com.lxisoft.control.*;
public class Login extends HttpServlet
{
	Sqlrepository sqlrep=new Sqlrepository();
	Sqlrepository sql=new Sqlrepository();
	int count=0;
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException  
	{
		HttpSession session=req.getSession();
		ArrayList<Model>model=new ArrayList<Model>();
		model=(ArrayList<Model>)session.getAttribute("array");
		PrintWriter out = res.getWriter();
		String quest=req.getParameter("UserId");
		String quest=req.getParameter("Password");
		for (int i=0;i<model.size();i++) 
		{
			if(quest.equals(model.get(i).getAnswer()))
			{
				count=count+1;
				
			}
		}	
		res.sendRedirect("get");
		session.setAttribute("count",count);
	}
}