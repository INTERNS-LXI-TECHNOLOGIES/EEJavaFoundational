package com.lxisoft.Controler;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import com.lxisoft.Repository.SqlRepository;
public class RegisterServlet extends HttpServlet
{
	private SqlRepository sqlReppo ;
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		sqlReppo = SqlRepository.getInstance();
		//PrintWriter out = response.getWriter();
		//out.println("HAHAHAHAHAHA");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		sqlReppo.userRoles(username,password);
		request.getRequestDispatcher("Sample1.jsp").forward(request,response);

	}
}