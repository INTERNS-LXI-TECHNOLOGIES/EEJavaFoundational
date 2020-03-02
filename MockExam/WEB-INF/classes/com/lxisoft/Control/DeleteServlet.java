package com.lxisoft.Control;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import com.lxisoft.Model.ExamModel;
import com.lxisoft.Repository.SqlRepository;
public class DeleteServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		SqlRepository sqlrepo = new SqlRepository();
		PrintWriter out = response.getWriter();
		int d = Integer.parseInt(request.getParameter("Delete"));
		sqlrepo.deleteQuestion(d);
		request.getRequestDispatcher("Delete.jsp").forward(request,response);
	}
}