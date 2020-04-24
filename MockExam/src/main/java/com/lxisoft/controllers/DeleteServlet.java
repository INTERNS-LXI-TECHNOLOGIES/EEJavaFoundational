package com.lxisoft.controllers;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.models.*;
import com.lxisoft.controllers.*;
import com.lxisoft.repository.*;

public class DeleteServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		SqlRepository repository=new SqlRepository();
		String qno=request.getParameter("qno");
	    repository.deleteQuestion(qno);
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		rd.forward(request,response);
	}
}