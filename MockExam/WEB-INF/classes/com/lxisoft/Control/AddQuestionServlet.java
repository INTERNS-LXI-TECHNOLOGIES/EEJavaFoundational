package com.lxisoft.Controler;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.ArrayList;
import com.lxisoft.Model.MockExamModel;
import com.lxisoft.Repository.SqlRepository;
public class AddServlet  extends HttpServlet
{
  private ExamModel models ;
  private SqlRepository sqlrepo ;
  public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
  {
    PrintWriter out = response.getWriter();
    sqlReppo = SqlRepository();
    models = new ExamModel();
    models.getQuestion().setQuestion(request.getParameter("question"));
    models.getAnswer().setAnswer(request.getParameter("answer"));
    models.getOption1().setOpt1(request.getParameter("option1"));
    models.getOption2().setOpt2(request.getParameter("option2"));
    models.getOption3().setOpt3(request.getParameter("option3"));
    models.getOption4().setOpt3(request.getParameter("option4"));
    sqlrepo.insertIntoDatabase(models);
    
    request.getRequestDispatcher("NewQuestion.jsp").forward(request,response);
  }
  
}