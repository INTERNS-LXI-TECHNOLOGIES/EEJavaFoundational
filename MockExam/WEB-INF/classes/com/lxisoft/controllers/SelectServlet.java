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
		SqlRepository repo=new SqlRepository();
		String qno=request.getParameter("qno");
		String operation=request.getParameter("operation");
		Question q=repo.findQuestionByQno(qno);
		request.setAttribute("questions",q);
		HttpSession session=request.getSession();
		session.setAttribute("question",q);
		RequestDispatcher rd=null;

		switch(operation)
		{
			case "1":rd=request.getRequestDispatcher("Delete.jsp");break;
			case "2":rd=request.getRequestDispatcher("Edit.jsp");break;
		}
		rd.forward(request,response);
	}
}