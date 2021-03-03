package com.lxisoft.servlet;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import com.lxisoft.repository.*;
import com.lxisoft.model.*;
import java.util.ArrayList;
public class ViewServlet extends HttpServlet
{
		UserRepository userrepo = new UserRepository();


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException
	{
		ArrayList<Userdetails> user = new ArrayList<Userdetails>();
		user = userrepo.viewDatabase();
		request.setAttribute("list",user);
		RequestDispatcher rd = request.getRequestDispatcher("View.jsp");
		rd.forward(request,response);				
	}
} 