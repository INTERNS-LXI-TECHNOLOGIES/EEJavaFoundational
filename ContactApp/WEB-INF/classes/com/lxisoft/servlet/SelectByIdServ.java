package com.lxisoft.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.domain.*;
import com.lxisoft.models.*;
public class SelectByIdServ extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{	
		MysqlRepository myrepo=new MysqlRepository();
		String id=request.getParameter("id");
		Contact c=myrepo.findContactById(id);
		request.setAttribute("contacts",c);
		System.out.println(c.getName()+ " dff");
		HttpSession session=request.getSession();
		session.setAttribute("contact",c);
		RequestDispatcher rd=request.getRequestDispatcher("Save.jsp");
		rd.forward(request,response);
	}
}