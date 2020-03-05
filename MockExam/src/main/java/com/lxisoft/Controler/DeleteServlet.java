package com.lxisoft.Controler;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.ArrayList;
import com.lxisoft.Model.MockExamModel;
import com.lxisoft.Repository.SqlRepository;
public class DeleteServlet extends HttpServlet
{
	SqlRepository sqlReppo = SqlRepository.getInstance();
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		int delete = Integer.parseInt(request.getParameter("Delete"));
		sqlReppo.delete(delete);
		request.getRequestDispatcher("Delete.jsp").forward(request,response);

	}
}