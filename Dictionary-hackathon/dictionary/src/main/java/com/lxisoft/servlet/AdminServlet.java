
package com.lxisoft.servlet;
import java.util.*;
import java.io.*;
import com.lxisoft.repository.*;
import com.lxisoft.domain.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AdminServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		Mysql mysql=new Mysql();
		ArrayList<Word> wordList=mysql.readAll();
		request.setAttribute("wordList",wordList);
		// response.sendRedirect("jsp/View.jsp");

		RequestDispatcher rd=request.getRequestDispatcher("jsp/Admin.jsp");
		rd.forward(request,response);
	}
}