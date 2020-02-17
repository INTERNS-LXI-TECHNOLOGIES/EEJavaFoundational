package com.lxisoft.Control;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import com.lxisoft.Model.ExamModel;
import com.lxisoft.Repository.SqlRepository;
public class QuestionServlet extends HttpServlet
{
    public ArrayList<ExamModel> emodels=new ArrayList<ExamModel>();
    public SqlRepository sqlrepo=new SqlRepository();
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException  
    {
         PrintWriter out=response.getWriter();
         out.println("deegghjj");
         emodels = sqlrepo.readFromDatabase(emodels);
         out.println("ArraySize : "+emodels.size());
        request.setAttribute("question",emodels);
         request.getRequestDispatcher("Questionview.jsp").forward(request,response);
               
          
    }     
}
