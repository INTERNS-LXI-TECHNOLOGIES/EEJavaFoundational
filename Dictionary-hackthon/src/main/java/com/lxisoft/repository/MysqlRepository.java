package com.lxisoft.repository;
import java.sql.*;
import java.util.*;
import com.lxisoft.model.*;
/**
 *class: repository for mysql operation
 */
public class MysqlRepository
{
	List <WordUnit> wordList=new ArrayList<WordUnit>();
	Connection con=null;
	PreparedStatement ps=null;
	{
		try
		{
			databaseConnection();
			createStorage();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *to get database connection
	 */
	public void databaseConnection()
	{
		try
		{  
			Class.forName("com.mysql.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dictionary","root","root");

			// con.close();
		}
		catch(SQLException|ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	} 
	/**
	 *to create table
	 */
	public void createStorage()
	{
		try
		{
			Statement s=con.createStatement();
			s.executeUpdate("create table if not exists WordList(WORD varchar(20),MEANING varchar(20))");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *to read all words from database
	 *
	 *@return arraylist of word
	 */
	public List<WordUnit> findAllWords()
	{
		
		try
		{
			wordList.clear();
			Statement s=con.createStatement();
			ResultSet rs=s.executeQuery("select * from WordList");
			while(rs.next())
			{
				WordUnit w=new WordUnit();
				w.setWord(rs.getString("WORD"));			
				w.setMeaning(rs.getString("MEANING"));
				wordList.add(w);				
			}
			s.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return wordList; 
	}
	/**
	 *to write word in to database
	 *
	 *@param word wordunit contain word and meaning
	 */
	public WordUnit saveWord(WordUnit wu)
	{
		try
		{
			ps=con.prepareStatement("insert into WordList(WORD,MEANING) values(?,?)");
			ps.setString(1,wu.getWord());
			ps.setString(2,wu.getMeaning());
			int x=ps.executeUpdate();
			System.out.println(""+x);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return wu;
	}

}