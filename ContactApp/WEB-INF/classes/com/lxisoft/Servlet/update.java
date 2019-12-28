package com.lxisoft.Servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.lxisoft.Domain.*;
import com.lxisoft.Repository.*;
import javax.servlet.annotation.*;
@WebServlet("/update")

public class update extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String number = request.getParameter("number");
		DataRepository drr = new DataRepository();
		drr.edit(id,name,number);
		RequestDispatcher rs=request.getRequestDispatcher("start");
		rs.forward(request,response);
    }
}