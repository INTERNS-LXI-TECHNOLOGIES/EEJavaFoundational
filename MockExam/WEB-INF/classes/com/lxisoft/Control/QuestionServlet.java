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
      //  out.println("deegghjj");
        response.setContentType("text/html");
        emodels=sqlrepo.readFromDatabase(emodels);       
        
        for(int i=0;i<emodels.size();i++)
        {
           out.println("qNo"+emodels.get(i).getQuestionNumber());
           out.println("question"+emodels.get(i).getQuestion());
           out.println("opt 1"+emodels.get(i).getOpt1());
           out.println("opt 2"+emodels.get(i).getOpt2());
           out.println("opt 3"+emodels.get(i).getOpt3());
           out.println("opt 4"+emodels.get(i).getOpt4());
        }
        
    }     
}

