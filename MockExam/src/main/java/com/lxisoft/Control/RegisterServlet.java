package com.lxisoft.Control;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import com.lxisoft.Model.ExamModel;
import com.lxisoft.Repository.SqlRepository;

public class RegisterServlet extends HttpServlet
{
	private SqlRepository sqlrepo ;
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		sqlrepo= new SqlRepository();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		sqlrepo.userRoles(username,password);
		request.getRequestDispatcher("index.jsp").forward(request,response);

	}
}
