package com.lxisoft.Control;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import com.lxisoft.Model.ExamModel;
import com.lxisoft.Repository.SqlRepository;
public class AddQuestionServlet  extends HttpServlet
{  
  public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
  {
    PrintWriter out = response.getWriter();
    SqlRepository sqlrepo=new SqlRepository();
    ExamModel models=new ExamModel();
    models.setQuestion(request.getParameter("question"));    
    models.setOpt1(request.getParameter("option1"));
    models.setOpt2(request.getParameter("option2"));
    models.setOpt3(request.getParameter("option3"));
    models.setOpt4(request.getParameter("option4"));
    models.setAnswer(request.getParameter("answer"));
    sqlrepo.insertIntoDatabase(models); 
    HttpSession session = request.getSession(true);
    request.getRequestDispatcher("Admin.jsp").forward(request,response);
  }  
}
