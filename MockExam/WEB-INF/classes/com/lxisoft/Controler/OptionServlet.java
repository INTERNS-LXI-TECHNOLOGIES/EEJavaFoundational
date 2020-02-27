package com.lxisoft.Controler;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.ArrayList;
import com.lxisoft.Model.MockExamModel;
import com.lxisoft.Repository.SqlRepository;
public class OptionServlet extends HttpServlet
{
	private ArrayList<MockExamModel> questions = new ArrayList<MockExamModel>();
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
	{
		HttpSession session = request.getSession(true);
		questions = (ArrayList<MockExamModel>)session.getAttribute("questions");
		PrintWriter out = response.getWriter();
		int selectedOption = Integer.parseInt(request.getParameter("option"));
		for(int i=0;i<questions.size();i++)
		{
			if(questions.get(i).getSelectedOption().getOption()== null)
			{

				switch(selectedOption)
				{
					case 1:
						String option1 = questions.get(i).getOption1().getOption();
						questions.get(i).getSelectedOption().setOption(option1);
						break;
					case 2:
						String option2 = questions.get(i).getOption2().getOption();
						questions.get(i).getSelectedOption().setOption(option2);
						break;
					case 3:
						String option3 = questions.get(i).getOption3().getOption();
						questions.get(i).getSelectedOption().setOption(option3);
						break;
					case 4:
						String option4 = questions.get(i).getOption4().getOption();
						questions.get(i).getSelectedOption().setOption(option4);
						break;
				}
				break;
			}
		}
		HttpSession sessions = request.getSession(true);
		sessions.setAttribute("Array",questions);
		request.getRequestDispatcher("Questions.jsp").forward(request, response);
	}
} 