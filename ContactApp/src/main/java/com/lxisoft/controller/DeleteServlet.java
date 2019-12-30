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
		HttpSession session=request.getSession();
		SelectModel selectModel=(SelectModel) session.getAttribute("selectModel");
		System.out.println("deleeteeeee servlet=="+selectModel.getContact().getId());
		deleteModel.setContact(selectModel.getContact());
		
		repository.delete(deleteModel.getContact());
		response.sendRedirect("showAll");

	}
}