package com.lxisoft.Controler;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import com.lxisoft.Repository.SqlRepository;
public class LoginServlet extends HttpServlet
{
	private SqlRepository sqlReppo ;
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		sqlReppo = SqlRepository.getInstance();
		PrintWriter out = response.getWriter();
		String username = request.getRemoteUser();
		String userrole = sqlReppo.selectRole(username);
		
		// response.setCharacterEncoding("UTF-8");
		// response.setContentType("text/html; charset=utf-8");
			if(userrole.equals("admin"))
			{
				request.getRequestDispatcher("Admin.jsp").forward(request,response);
				//response.sendRedirect("Admin.jsp");
			}
			else if(userrole.equals("user"))
			{
				request.getRequestDispatcher("Introduction.jsp").forward(request,response);
				//response.sendRedirect("Introduction.jsp");	
			}
	}
	
}