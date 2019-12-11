package com.lxisoft.controller;
import com.lxisoft.model.*;
import java.util.*;
import com.lxisoft.repository.*;
import com.lxisoft.domain.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class DeleteServlet extends HttpServlet
{
	Repository repository=new DbRepository();

	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		DeleteModel deleteModel=new DeleteModel(); 
		deleteModel.setContact((Contact) request.getAttribute("selectModel"));
		repository.delete(deleteModel.getContact());
		// contact.setNumber(request.getParameter("number"));
		// repository.save(contact);
		RequestDispatcher rd=request.getRequestDispatcher("Select.jsp");
		rd.forward(request,response);
		//response.sendRedirect("?selectId="+deleteModel.getContact().getId());

	}
}
