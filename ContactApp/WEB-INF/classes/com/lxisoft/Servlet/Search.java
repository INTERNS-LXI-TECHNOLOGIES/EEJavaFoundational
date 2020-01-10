package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import com.lxisoft.Domain.*;
import com.lxisoft.Repository.*;
import javax.servlet.annotation.*;
@WebServlet("/Search")
public class Search extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		DataRepository drr = new DataRepository();
		String name=request.getParameter("name");
         Contact c = drr.findByName(name);
         request.setAttribute("search",c);
		 RequestDispatcher rs=request.getRequestDispatcher("search.jsp");
	 	 rs.forward(request,response);
    }
}

