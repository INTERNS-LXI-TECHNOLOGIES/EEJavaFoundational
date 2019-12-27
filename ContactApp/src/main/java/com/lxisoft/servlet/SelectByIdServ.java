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
		String operations=request.getParameter("operations");
		Contact c=myrepo.findContactById(id);
		request.setAttribute("contacts",c);
		HttpSession session=request.getSession();
		session.setAttribute("contact",c);
		RequestDispatcher rd=null;

		switch(operations)
		{
			case "1":rd=request.getRequestDispatcher("Save.jsp");break;
			case "2":rd=request.getRequestDispatcher("Delete.jsp");break;
			case "3":rd=request.getRequestDispatcher("Edit.jsp");break;
		}
		rd.forward(request,response);
	}
}