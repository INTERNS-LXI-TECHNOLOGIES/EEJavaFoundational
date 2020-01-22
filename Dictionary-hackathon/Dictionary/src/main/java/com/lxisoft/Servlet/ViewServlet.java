package com.lxisoft.Servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Repository.*;
import com.lxisoft.Domain.*;

public class ViewServlet extends HttpServlet
{
	MysqlRepo repo=new MysqlRepo();
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		ArrayList<Word> words=repo.getWords();
		repo.addWord("e","e for empty");
		HttpSession session=request.getSession();
		session.setAttribute("words",words);

		response.sendRedirect("dictionary.jsp");
	PrintWriter out=response.getWriter();
        		out.println("name type");
	}
        	
}