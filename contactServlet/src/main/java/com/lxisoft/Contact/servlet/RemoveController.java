package com.lxisoft.Contact.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.lxisoft.Contact.repositoryImpl.RepositoryImpl;
import com.lxisoft.Contact.model.*;


@WebServlet("/remove")
public class RemoveController extends HttpServlet {
	
	RepositoryImpl ri = new RepositoryImpl();
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		try {
int id=Integer.parseInt(req.getParameter("Id"));
ri.deleteContact(id);
PrintWriter out = res.getWriter();
res.sendRedirect("Delete.jsp");
}
catch(Exception e) {
}
}
}

