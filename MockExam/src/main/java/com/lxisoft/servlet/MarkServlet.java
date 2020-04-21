package com.lxisoft.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.model.*;
public class MarkServlet extends HttpServlet
{
	ArrayList<String> answerList = new  ArrayList<String>();
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		try
		{
			HttpSession session = request.getSession();
					
			String ans = request.getParameter("scores");
			if(ans== null)
			{
				ans="0";
				answerList.add(ans);	
			}

			else
			{
				answerList.add(ans);
			}	
		session.setAttribute("answers",answerList);
		request.getRequestDispatcher("question.jsp").forward(request,response);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}


}	