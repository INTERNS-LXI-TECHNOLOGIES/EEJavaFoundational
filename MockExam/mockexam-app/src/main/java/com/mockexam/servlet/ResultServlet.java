package com.mockexam.servlet;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.mockexam.model.*;
import com.mockexam.repository.*;
public class ResultServlet extends HttpServlet
{
	ArrayList<String> anslist = new  ArrayList<String>();
	ArrayList<Model> data = new  ArrayList<Model>();
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession();
		data = (ArrayList<Model>)session.getAttribute("examdatas");
		anslist = (ArrayList<String>)session.getAttribute("answers");
		int mark = 0;
		pw.println("exatas="+data.size());
		pw.println("mark="+mark);
		int size = data.size();
		
		for (int i=0;i<size;i++) 
		{
			if(anslist.get(i).equals(data.get(i).getAnswer()))
			{
				mark ++;
			}	
		}
		pw.println("mark="+mark);
		request.setAttribute("totalScore",mark);
		mark=0;
		request.getRequestDispatcher("result.jsp").forward(request,response);
	}
}