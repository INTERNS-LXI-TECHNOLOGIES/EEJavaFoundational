package com.lxisoft.Servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Repository.*;
import com.lxisoft.Domain.*;

public class AddServlet extends HttpServlet
{
	MysqlRepo repo=new MysqlRepo();
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		HttpSession session=request.getSession();
		String word=(String) request.getParameter("word");
		String meaning=(String) request.getParameter("meaning");
		repo.addWord(word,meaning);
		response.sendRedirect("viewall");
	// PrintWriter out=response.getWriter();
 //        		out.println(words.size()+"...");
	}
        	
}