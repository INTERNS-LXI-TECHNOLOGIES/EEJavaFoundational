package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import com.lxisoft.domain.*;
import com.lxisoft.repository.*;
public class SearchContactServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		DataRepository drr = new DataRepository();
		String name=request.getParameter("name");
        ArrayList <Contact> contact=drr.displayAll();
		if(name.contains(contact.getName()))
		{
			RequestDispatcher rs=request.getRequestDispatcher("search.jsp");
	 	    rs.forward(request,response);
		}
		
    }
}

