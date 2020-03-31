package com.lxisoft.servlet;
import com.lxisoft.model.*;
import com.lxisoft.repository.*;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class SearchContactServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		DataBase db = new DataBase();
		ArrayList<Contact> contactList = new ArrayList<Contact>();
		String name = (String)request.getParameter("searchname");
		PrintWriter writer = response.getWriter();
		//writer.println(name);
		contactList = db.searchDbByName(contactList,name);
		writer.println(contactList.size());
		
		if(contactList.size() == 0)
		{
			response.sendRedirect("searchError.jsp");
		}
		else
		{
			request.setAttribute("searchList",contactList);
			request.getRequestDispatcher("SearchResults.jsp").forward(request,response);	
		}
	}
}