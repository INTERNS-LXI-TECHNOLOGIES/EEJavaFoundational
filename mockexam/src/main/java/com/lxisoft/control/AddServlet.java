package com.lxisoft.control;
import com.lxisoft.sqlRepository.*;
import com.lxisoft.model.Model;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet 
{ 
	public SqlRepository sql=new SqlRepository();
	//ArrayList<Model>model=new ArrayList<Model>();
  //public Model model;
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {	 
    Model model=new Model();
  	  PrintWriter out = response.getWriter();
  HttpSession session1=request.getSession(true);
  model.setQn(request.getParameter("question"));
  model.setOpt1(request.getParameter("option1"));
  model.setOpt2(request.getParameter("option2"));
  model.setOpt3(request.getParameter("option3"));
  model.setOpt4(request.getParameter("option4"));
  model.setAns(Integer.parseInt(request.getParameter("ans")));
 		
  sql.insertInto(model);
  response.sendRedirect("add2.jsp");
 
}
}