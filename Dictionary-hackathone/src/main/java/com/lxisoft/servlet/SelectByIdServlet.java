package com.lxisoft.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import com.lxisoft.repository.*;
import com.lxisoft.domain.*;
import com.lxisoft.model.*;
public class SelectByIdServlet extends HttpServlet
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
	{	
		SqlRepository sqlRepo=new SqlRepository();
		String id=request.getParameter("id");
		Word w=sqlRepo.findWordById(id);
		request.setAttribute("words",w);
		HttpSession session=request.getSession();
		session.setAttribute("word",w);
		RequestDispatcher rd=request.getRequestDispatcher("Save.jsp");
		rd.forward(request,response);
	}
}