package com.lxisoft.controller;
import com.lxisoft.model.*;
import java.util.*;
import com.lxisoft.repository.*;
import com.lxisoft.domain.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class EditServlet extends HttpServlet
{
	Repository repository=new DbRepository();

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		EditModel editModel=new EditModel();
		HttpSession session=request.getSession();
		SelectModel selectModel=(SelectModel) session.getAttribute("selectModel");

		System.out.println("sncsjkn edit servlet=="+selectModel.getContact().getId());
		editModel.setContact(selectModel.getContact());
		String[] newValue=new String[2];
		newValue[0]=(String) request.getParameter("name");
		newValue[1]=(String) request.getParameter("number");
		repository.edit(editModel,newValue);
		response.sendRedirect("showAll");
	}
}
