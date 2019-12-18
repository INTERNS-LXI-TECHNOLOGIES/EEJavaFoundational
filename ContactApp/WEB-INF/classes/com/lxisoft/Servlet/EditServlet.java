package com.lxisoft.servlet;
import javax.Servlet.*;
import javax.Servlet.http.*;
import java.io.*;
import com.lxisoft.Domain.*;
import com.lxisoft.Repository.*;
import com.lxisoft.Servlet.*;
public class EditServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		String id=request.getParameter("id");
		DataRepository drr = new DataRepository();
		drr.findById(id);
        
	}
}