package com.lxisoft.Controler;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.ArrayList;
import com.lxisoft.Model.MockExamModel;
import com.lxisoft.Repository.SqlRepository;
public class MockExamController extends HttpServlet
{
	private int i =0;
	private ArrayList<MockExamModel> model = new ArrayList<MockExamModel>();
	private SqlRepository sqlReppo = SqlRepository.getInstance();
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		model.clear();
		model = sqlReppo.readFromDatabase(model);
		HttpSession session = request.getSession();
		session.setAttribute("Array",model.get(i));
		i++;
		response.sendRedirect("welcome.jsp");
  	}
}