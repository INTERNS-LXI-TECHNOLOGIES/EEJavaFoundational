package com.lxisoft.servlet;
import java.util.*;
import java.io.*;
import com.lxisoft.repository.*;
import com.lxisoft.domain.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class SaveServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		Mysql mysql=new Mysql();
		Word word=new Word();
		word.setElement(request.getParameter("word"));
		word.setMeaning(request.getParameter("meaning"));
		mysql.add(word);
		//response.sendRedirect("jsp/View.jsp");
		RequestDispatcher rd=request.getRequestDispatcher("admin");
		rd.forward(request,response);
	}
}