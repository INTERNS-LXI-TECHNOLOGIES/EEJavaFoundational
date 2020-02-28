package com.lxisoft.Control;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.ArrayList;
import com.lxisoft.Model.ExamModel;
import com.lxisoft.Repository.SqlRepository;
public class DeleteServlet extends HttpServlet
{
	SqlRepository sqlrepo = new SqlRepository();
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		int d = Integer.parseInt(request.getParameter("Delete"));
		sqlrepo.deleteQuestion(d);
		request.getRequestDispatcher("Delete.jsp").forward(request,response);
	}
}