package com.lxisoft.Servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.lxisoft.Domain.*;
import com.lxisoft.Repository.*;
import com.lxisoft.Servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		String id = request.getParameter("id");
		DataRepository drr = new DataRepository();
		
		HttpSession session= request.getSession();
		session.setAttribute("c",drr.findById(id));
		RequestDispatcher rs=request.getRequestDispatcher("Edit.jsp");
	 	rs.forward(request,response);

        
	}
}



