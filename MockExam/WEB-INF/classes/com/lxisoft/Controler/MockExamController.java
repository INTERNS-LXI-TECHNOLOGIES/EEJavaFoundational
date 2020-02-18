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
		PrintWriter out = response.getWriter();
		model.clear();
		model = sqlReppo.readFromDatabase(model);
		HttpSession sessions = request.getSession(true);
		sessions.setAttribute("questions",model);
		request.getRequestDispatcher("welcome.jsp").forward(request, response);
  	}
}