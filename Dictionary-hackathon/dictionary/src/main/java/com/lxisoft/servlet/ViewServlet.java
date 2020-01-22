package com.lxisoft.servlet;
import java.util.*;
import java.io.*;
import com.lxisoft.repository.*;
import com.lxisoft.domain.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ViewServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		Mysql mysql=new Mysql();
		ArrayList<Word> wordList=mysql.readAll();
		request.setAttribute("wordList",wordList);
		// RequestDispatcher rd=request.getRequestDispatcher("/jsp/ViewAll.jsp");
		// rd.forward(request,response);
		response.sendRedirect("jsp/View.jsp");
	}
}