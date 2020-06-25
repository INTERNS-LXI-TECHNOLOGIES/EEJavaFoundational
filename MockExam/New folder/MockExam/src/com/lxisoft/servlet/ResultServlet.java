package com.lxisoft.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.model.*;
public class ResultServlet extends HttpServlet
{
	ArrayList<String> anslist = new ArrayList<String>();
	ArrayList<Question> options = new ArrayList<Question>();
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		PrintWriter pw = response.getWriter();
		int mark=0;
		HttpSession session = request.getSession();
		options = (ArrayList<Question>)session.getAttribute("examqus");
		anslist = (ArrayList<String>)session.getAttribute("answers");
		int size = options.size();
		
		for (int i=0;i<size;i++) 
		{
			if(anslist.get(i).equals(options.get(i).getAnswer()))
			{
				mark +=1;
			}
		
		}
		pw.println("mark = "+mark);
		request.setAttribute("score",mark);	
		mark=0;
		request.getRequestDispatcher("result.jsp").forward(request,response);		
	}
}