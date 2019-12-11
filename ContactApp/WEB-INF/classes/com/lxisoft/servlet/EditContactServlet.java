package com.lxisoft.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import com.lxisoft.domain.*;
import com.lxisoft.repository.*;
import com.lxisoft.servlet.*;
public class EditContactServlet extends HttpServlet
{
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{
		String id=request.getParameter("id");
		int n=Integer.parseInt(id);
		String name=request.getParameter("name");
		String number=request.getParameter("number");
		Contact cont=new Contact();
		cont.setContactName(name);
		cont.setContactNumber(number);
		MysqlRepository dbrepo=new MysqlRepository();
		Contact con=dbrepo.updateContact(n,cont);
		request.setAttribute("getContactById",con);
		RequestDispatcher rd=request.getRequestDispatcher("GetContactById.jsp");
		rd.forward(request,response);
	}
}