package com.lxisoft.Control;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import com.lxisoft.Model.ExamModel;
import com.lxisoft.Repository.SqlRepository;


public class ViewServlet extends HttpServlet 
{ 
  SqlRepository sqlrepo=new SqlRepository();
  ArrayList<ExamModel> models=new ArrayList<ExamModel>();
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
  {  

      PrintWriter out = response.getWriter();
      HttpSession session=request.getSession(true);
      models.clear();
      models=sqlrepo.readFromDatabase(models);
      session.setAttribute("view",models);
      response.sendRedirect("View.jsp");
      
  }
}
