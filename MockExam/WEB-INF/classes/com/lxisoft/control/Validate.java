package com.lxisoft.control;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.lang.Math;
import java.util.*;
import com.lxisoft.sqlrepository.*;
import com.lxisoft.model.*;
import com.lxisoft.control.*;
public class Validate extends HttpServlet
{
	Sqlrepository sqlrep=new Sqlrepository();
	Sqlrepository sql=new Sqlrepository();
	int count;
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException  
	{
		ArrayList<Model>model=new ArrayList<Model>();
		model=sql.readquestion();
		PrintWriter out = res.getWriter();
		String quest=req.getParameter("option");
		//out.println("quest : "+quest);
		HttpSession session=req.getSession();
		for (int i=0;i<model.size();i++) 
		{
			if(quest.equals(model.get(i).getAnswer()))
			{
				count=count+1;
				
			}
		}	
		res.sendRedirect("get");
		//out.println("count"+count);
		session.setAttribute("count",count);
	}
}