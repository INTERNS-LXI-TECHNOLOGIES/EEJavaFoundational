package com.lxisoft.Control;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import com.lxisoft.Model.ExamModel;
import com.lxisoft.Repository.SqlRepository;
public class AddQuestionServlet extends HttpServlet
{
	/*private ArrayList<ExamModel> models;
	private SqlRepository sqlrepo;*/
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException  
    {
    	PrintWriter out = response.getWriter();
       
       /* models= (ArrayList<ExamModel>) session.getAttribute("qstn");
        models.addQuestion();
   */
       // models=sqlrepo.addQuestion();
        

        out.println("asdfghj");
   	} 
}