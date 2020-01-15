package com.lxisoft.Servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Repository.*;
import com.lxisoft.Models.*;

import com.lxisoft.Domain.*;


public class LangServlet extends HttpServlet
{
	static MysqlRepository repo=new MysqlRepository();
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		String name=request.getParameter("lang");
		HttpSession session=request.getSession();
		try
		{
			if (name=="en") 
			{
				session.setAttribute("lang","en");	
			}
			else
			{
				session.setAttribute("lang","ml");	

			}
			response.sendRedirect("viewall?lang=name");	
          	
        }catch(Exception e)
		{

		}
	}
}
