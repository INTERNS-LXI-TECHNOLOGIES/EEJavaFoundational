package demoApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Repository {

	
	public int score;
	public String userName;
	
	Question question;

	private Connection connection;
   
    public Repository(Connection connection) throws SQLException  {

        this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root", "123");
        
    }
      public Repository() {
		// TODO Auto-generated constructor stub
	}
      
      
  	public Question getQuestion(int rr) throws SQLException{
		   this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root", "123");
     Connection conn = this.connection;
     java.sql.Statement statement = conn.createStatement();
    

     String query = "SELECT * FROM questions WHERE id = ?";
     PreparedStatement stmt = conn.prepareStatement(query);
     stmt.setInt(1, rr);

     ResultSet rs = stmt.executeQuery();
     if (rs.next()) {
       
         String column1Value = rs.getString("question");
         String column2Value = rs.getString("option1");
         String column3Value = rs.getString("option2");
         String column4Value = rs.getString("option3");
         String column5Value = rs.getString("answer");
         question = new Question(column1Value,column2Value,column3Value,column4Value, column5Value);
     }
 
	return question;
     
	}
      
      
      
      
      
      
      
	public void getQ(int userscore) throws SQLException{
		   this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root", "123");
           Connection conn = this.connection;
           java.sql.Statement statement = conn.createStatement();
            
       
           
           String sql = "UPDATE userscore SET score = score +? WHERE id=1";
           PreparedStatement statement1 = connection.prepareStatement(sql);
        
           statement1.setInt(1, userscore);
           statement1.executeUpdate();
}
	
	public void idQ() throws SQLException {
		 this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root", "123");
         Connection conn = this.connection;
         java.sql.Statement statement = conn.createStatement();
          
     
         String name = "name";
         String sql = "INSERT INTO userscore (id, name, score) VALUES(?,?,?)";
         PreparedStatement statement1 = connection.prepareStatement(sql);
         statement1.setInt(1, 1);
         statement1.setString(2, name);
         statement1.setInt(3, 0);
         statement1.execute();
		
	}

	
	public void reset() throws SQLException {
		 this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root", "123");
		Connection conn = this.connection;
		  java.sql.Statement statement = conn.createStatement();
		
		  String query2 ="TRUNCATE TABLE userscore";
	        statement.executeUpdate(query2);
	}
	
	public void nameC(String name1) throws SQLException{
		   this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root", "123");
        Connection conn = this.connection;
        java.sql.Statement statement = conn.createStatement();
         
       
        
        
        String sql = "UPDATE userscore SET name = ? WHERE id=1";
        PreparedStatement statement1 = connection.prepareStatement(sql);
     
        statement1.setString(1, name1);
        statement1.executeUpdate();
	
	}
	public void result() throws SQLException {
		this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root", "123");
		Connection conn = this.connection;
		  java.sql.Statement statement = conn.createStatement();
		  String query =  "SELECT * FROM userscore";
		  PreparedStatement stmt  = conn.prepareStatement(query);
		  ResultSet rs = stmt.executeQuery();
		  if (rs.next()) {
			  	
	            userName = rs.getString("name");
	            score = rs.getInt("score");
		  }
	}

}
