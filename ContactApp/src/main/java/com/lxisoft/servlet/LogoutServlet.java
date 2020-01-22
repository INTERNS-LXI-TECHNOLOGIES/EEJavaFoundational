package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import com.lxisoft.domain.*;
import com.lxisoft.repository.*;
public class LogoutServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		HttpSession session=request.getSession(); 
		session.invalidate();
		RequestDispatcher rd=request.getRequestDispatcher("Index.jsp");
		rd.forward(request,response);
	}
}