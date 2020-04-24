package com.megha.controllers;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.megha.repository.*;
import com.megha.models.*;

public class ReadServletMvt extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		SqlRepositoryMVT repository=new SqlRepositoryMVT();
		List<RequestMVT> requestList=repository.getAllRequests();
		HttpSession session=request.getSession();
		session.setAttribute("requestlist",requestList);
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		request.getRequestDispatcher("ViewAll.jsp").forward(request,response);
	}
}