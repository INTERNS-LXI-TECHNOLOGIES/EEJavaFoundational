package com.lxisoft.sqlrepository;
import java.sql.*;  
import java.util.*;
import com.lxisoft.model.Model;
public class Sqlrepository
{
	Connection con=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	

	public void connection()
	{
		
	 try{
			if (con==null)
			{
				Class.forName("com.mysql.jdbc.Driver");  
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sanfar","root","root");
						
			}
		}catch(Exception e)
			{
			 	e.printStackTrace();
			 	System.out.println(e);
			} 
	}

	public ArrayList<Model> readquestion(ArrayList<Model> questions)
	{
		questions.clear();
		try{
			connection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from mockexam");
			Model model=null;
			while (rs.next())
			{
				model=new Model();
				model.setId(rs.getInt("id"));
				model.setQuestion(rs.getString("Question"));
				model.setAnswer(rs.getString("Answers"));
				model.setOption1(rs.getString("option1"));
				model.setOption2(rs.getString("option2"));
				model.setOption3(rs.getString("option3"));
				questions.add(model);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return questions;
	}
	public void addQuestion(Model model)
	{
		try{
			connection();
			String query="insert into mockexam(question,answers,option1,option2,option3)values(?,?,?,?,?)";
				ps=con.prepareStatement(query);
			 
			 		ps.setString(1,model.getQuestion());
			 		ps.setString(2,model.getAnswer());
				 	ps.setString(3,model.getOption1());
				 	ps.setString(4,model.getOption2());
				 	ps.setString(5,model.getOption3());
				 	ps.execute();
		}catch(Exception e)
			{
				e.printStackTrace();
				System.out.println(e);
			} 
	}
	/*public void updateQuestion(Model model)
	{
		try{
			connection();
			String query="insert into mockexam(question,answers,option1,option2,option3)values(?,?,?,?,?)";
				ps=con.prepareStatement(query);
			 		
			 		ps.setString(1,model.getQuestion());
			 		ps.setString(2,model.getAnswer());
				 	ps.setString(3,model.getOption1());
				 	ps.setString(4,model.getOption2());
				 	ps.setString(5,model.getOption3());
				 	ps.executeUpdate();

			}catch(Exception e)
			{
				e.printStackTrace();
				System.out.println(e);
			} 
	}*/

	public void editQuestion(Model model)
	{

		try{
			connection();
			System.out.println(model.getQuestion());
			//deleteQuestion(model.getId());
				ps=con.prepareStatement("update mockexam set question=?,answers=?,option1=?,option2=?,option3=? where id=?");
			 		
			 		ps.setString(1,model.getQuestion());
			 		ps.setString(2,model.getAnswer());
				 	ps.setString(3,model.getOption1());
				 	ps.setString(4,model.getOption2());
				 	ps.setString(5,model.getOption3());
				 	ps.setInt(6,model.getId());
				 	ps.execute();

			}catch(Exception e)
			{
				e.printStackTrace();
				System.out.println(e);
			} 
	}
	public void deleteQuestion(int id)
	{
		try{
			connection();
			// String query=
			ps=con.prepareStatement("delete from mockexam where id=?");
			ps.setInt(1,id);
			ps.executeUpdate();
			}catch(Exception e)
			{
				e.printStackTrace();
				System.out.println(e);
			} 

	}
	
	/*public void addUser()
	{
		questions.clear();
		try{
			connection();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from users");
			Model model=null;
			
		}catch(Exception e)
			{
				e.printStackTrace();
				System.out.println(e);
			}
			
	}
*/
}