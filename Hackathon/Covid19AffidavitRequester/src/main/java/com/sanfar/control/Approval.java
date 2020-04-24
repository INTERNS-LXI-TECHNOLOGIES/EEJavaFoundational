package com.sanfar.control;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.lang.Math;
import java.util.*;
import com.sanfar.sqlrepository.*;
import com.sanfar.model.*;
import com.sanfar.control.*;
public class Approval extends HttpServlet
{
	Sqlrepository sqlrep=new Sqlrepository();
	Sqlrepository sql=new Sqlrepository();
	int count=0;
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException  
	{
		HttpSession session=req.getSession();
	
		//model=sql.readquestion();
		
		
		PrintWriter out = res.getWriter();
		String app=req.getParameter("app");
		//out.println("quest : "+quest);
		
		sql.approval(app);

		res.sendRedirect("get");
		//out.println("count"+count)
	}
}