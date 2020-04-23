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
	int mark;
	int totalScore;
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		PrintWriter pw = response.getWriter();
		HttpSession session = request.getSession();
		data = (ArrayList<Model>)session.getAttribute("examdatas");
		anslist = (ArrayList<String>)session.getAttribute("answers");
		for (int j=0;j<anslist.size();j++) 
		{
			anslist.remove(null);	
		}
		for (int x=0;x<data.size();x++) 
		{
			for (int y=0;y<anslist.size();y++) 
			{
				if(data.get(x).getAnswer().equals(anslist.get(y)))
				{
					mark ++;
				}				
			}
				
		}
		request.setAttribute("totalScore",mark);
		mark=0;
		request.getRequestDispatcher("secured/result.jsp").forward(request,response);
		
	}
}