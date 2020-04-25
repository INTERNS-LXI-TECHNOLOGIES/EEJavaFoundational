package com.ashik.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.ashik.repository.*;
import com.ashik.model.*;
public class checkServlet extends HttpServlet
{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		try
		{
			UserDatabase db = new UserDatabase();
			String phAFS=(request.getParameter("phnumber"));
			 response.setCharacterEncoding("UTF-8");
			response.setContentType("text/html; charset=utf-8");
			String flagAFS = db.checkRequestAFS(phAFS);

			if(flagAFS.equals("0"))
			{
				response.sendRedirect("notChecked.jsp");
			}
			else if(flagAFS.equals("1"))
			{
				
				response.sendRedirect("approved.jsp");	
			}
			else if(flagAFS.equals("2"))
			{
				response.sendRedirect("cancel.jsp");		
			}	
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}	