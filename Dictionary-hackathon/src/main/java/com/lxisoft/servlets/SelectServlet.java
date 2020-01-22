package com.lxisoft.servlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.Domain.*;
import com.lxisoft.model.*;
import com.lxisoft.Repository.*;
import java.util.*;
import java.sql.*;
public class SelectServlet extends HttpServlet
{
	private MySqlRepository repo=new MySqlRepository();
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
	{
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession(); 
		try
		{
		String select=(String)(request.getParameter("user"));
		// out.println(select);
		ArrayList<W_Dictionary> dictionary=repo.getAllWords();
				for(W_Dictionary dict:dictionary)
				{	
					if(select.equalsIgnoreCase(dict.getWord()))
							{
				 				session.setAttribute("word1",dict);
				 				response.sendRedirect("display.jsp");	
				 			}
				}
			}catch(Exception excep)
			{
				excep.printStackTrace();
			}
		}
	
	}