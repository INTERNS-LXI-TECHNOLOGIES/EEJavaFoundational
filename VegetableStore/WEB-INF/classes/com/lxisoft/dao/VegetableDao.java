package com.lxisoft.dao;
 import java.sql.*;
import com.lxisoft.vegetable.Vegetable;

public class VegetableDao {

	
	String INSERT_USER_SQL = "insert into vegetablestore" +
			"(name,price,stock,minOrderQuantity) values" +
					"(?,?,?,?);";
			
	String EDIT_USER_SQL ="update vegetablestore set name = ?,price = ?,stock = ?,minOrderQuantity = ? where no =?;";
			
			
	String DELETE_USER_SQL = "delete from vegetablestore where no = ?;";
	
	

public int addVegetable(Vegetable vegetable) throws ClassNotFoundException  {
	

	
	int result = 0;
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lxisoft","root","Mubashir24092000");
	
	PreparedStatement ps = con.prepareStatement(INSERT_USER_SQL);
		
		ps.setString(1,vegetable.getName());
		ps.setString(2,vegetable.getPrice());
		ps.setString(3,vegetable.getStock());
		ps.setString(4,vegetable.getOrderQuantity());
		
		System.out.println(ps);
		
		result = ps.executeUpdate();
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	return result;
	
	
}

public void updateVegetable(Vegetable vegetable) throws SQLException  {

	
	boolean rowUpdated;
	
	try {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lxisoft","root","Mubashir24092000");
		
		PreparedStatement statement = con.prepareStatement(EDIT_USER_SQL);
		
		statement.setString(1,vegetable.getName());
		statement.setString(2,vegetable.getPrice());
		statement.setString(3,vegetable.getStock());
		statement.setString(4,vegetable.getOrderQuantity());
		statement.setInt(5,vegetable.getNo());
		
		System.out.println(statement);
		
		rowUpdated = statement.executeUpdate() >0;
		
		
	}catch(Exception e)  {
		
		e.printStackTrace();
	}
	
	//return rowUpdated;
	
}

public void deleteVegetable(int no) throws SQLException  {
	
	boolean rowDeleted;
	
	try {
		
	
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lxisoft","root","Mubashir24092000");
		
	PreparedStatement statement = con.prepareStatement(DELETE_USER_SQL); 
		
		statement.setInt(5,no);
		
		System.out.println(statement);
		rowDeleted = statement.executeUpdate() >0;
		
	}catch(Exception e ) {
	e.printStackTrace();
	
	}
	//return rowDeleted;

}
}