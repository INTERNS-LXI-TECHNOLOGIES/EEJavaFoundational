package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.lxisoft.domain.*;
import com.lxisoft.repository.*;
import com.lxisoft.servlet.*;
public class GetContactByIdServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		MysqlRepository dbrepo=new MysqlRepository();
		String id=request.getParameter("id");
		int idd=Integer.parseInt(id);
		Contact contact=dbrepo.findContactById(idd);
		request.setAttribute("getContactById",contact);
		HttpSession session=request.getSession(); 
		session.setAttribute("cont",contact);
		RequestDispatcher rd=null;
		String value=request.getParameter("crud");
		switch(value)
		{
			case "2":rd=request.getRequestDispatcher("GetContactById.jsp"); break;
			case "3":rd=request.getRequestDispatcher("EditContact.jsp"); break;
			case "4":rd=request.getRequestDispatcher("DeleteContact.jsp"); break;
		}
		rd.forward(request,response);
	}
}
