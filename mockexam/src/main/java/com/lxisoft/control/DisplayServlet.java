package com.lxisoft.control;
import com.lxisoft.sqlRepository.*;
import com.lxisoft.model.Model;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.PrintWriter;

public class DisplayServlet extends HttpServlet 
{ 
	public SqlRepository sql=new SqlRepository();
	ArrayList<Model>model=new ArrayList<Model>();
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {	 
  	  PrintWriter out = response.getWriter();
  HttpSession session=request.getSession(true);
  model.clear();
  model=sql.selectFrom(model);
  session.setAttribute("disp",model);
  response.sendRedirect("Display.jsp");
}
}