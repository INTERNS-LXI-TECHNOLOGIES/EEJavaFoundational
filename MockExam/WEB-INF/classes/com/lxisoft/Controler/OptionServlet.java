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
	//private SqlRepository sqlReppo = SqlRepository.getInstance();
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
					case 2:
						String option1 = questions.get(i).getOption1().getOption();
						questions.get(i).getSelectedOption().setOption(option1);
						out.println("Selected Option : "+questions.get(i).getSelectedOption().getOption());
						//this.doOperation(option1,out);
						break;
					case 3:
						String option2 = questions.get(i).getOption2().getOption();
						questions.get(i).getSelectedOption().setOption(option2);
						out.println("Selected Option : "+questions.get(i).getSelectedOption().getOption());
						//this.doOperation(option2,out);
						break;
					case 4:
						String option3 = questions.get(i).getOption3().getOption();
						questions.get(i).getSelectedOption().setOption(option3);
						out.println("Selected Option : "+questions.get(i).getSelectedOption().getOption());
						//this.doOperation(option3,out);
						break;
					case 1:
						String answer = questions.get(i).getAnswer().getAnswer();
						questions.get(i).getSelectedOption().setOption(answer);
						out.println("Selected Option : "+questions.get(i).getSelectedOption().getOption());
						//this.doOperation(answer,out);
						break;
				}
				break;
			}
		}
		HttpSession sessions = request.getSession(true);
		sessions.setAttribute("Array",questions);
		//request.setAttribute("Array",questions);
		request.getRequestDispatcher("welcome.jsp").forward(request, response);
	}
	public void doOperation(String option,PrintWriter out)
	{
		for(int i =0;i<questions.size();i++)
		{
			if(questions.get(i).getSelectedOption().getOption()== null)
			{
				questions.get(i).getSelectedOption().setOption(option);
				out.println("Selected Option : "+questions.get(i).getSelectedOption().getOption());
				break;
			}
		}
	}
	
} 