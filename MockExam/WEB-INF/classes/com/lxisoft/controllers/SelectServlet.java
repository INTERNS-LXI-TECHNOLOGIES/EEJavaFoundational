package com.lxisoft.controllers;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.models.*;

public class SelectServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{	
		String opt=request.getParameter("opt");
		String qno=request.getParameter("qno");
		SqlRepository repository=new SqlRepository();
		Question qn=repository.findQuestionByQno(qno);
		request.setAttribute("questions",qn);
		HttpSession session=request.getSession();
		session.setAttribute("question",qn);
		RequestDispatcher rd=null;
		switch(opt)
		{
			case "a":rd=request.getRequestDispatcher("Delete.jsp");break;
			case "b":rd=request.getRequestDispatcher("Edit.jsp");break;
		}
		rd.forward(request,response);
	}
}