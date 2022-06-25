package com.lxisoft.dao;
 import java.sql.*;
import com.lxisoft.vegetable.Vegetable;

public class VegetableDao {

	
	String INSERT_SQL = "insert into vegetablestore" +
			"(name,price,stock,minOrderQuantity) values" +
					"(?,?,?,?);";
			
	String EDIT_SQL ="update vegetablestore set name = ?,price = ?,stock = ?,minOrderQuantity = ? where no =?;";
			
			
	String DELETE_SQL = "delete from vegetablestore where no = ?;";
	
	Connection connection;

	public VegetableDao()  {


try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/lxisoft","root","Mubashir24092000");
} catch (Exception e) {
	e.printStackTrace();
}

	}
	

public int addVegetable(Vegetable vegetable) throws ClassNotFoundException  {
	
	int result = 0;
	
	try {
	
	PreparedStatement ps = 	connection.prepareStatement(INSERT_SQL);
		
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

public boolean updateVegetable(Vegetable vegetable) throws SQLException, ClassNotFoundException  {

	boolean rowUpdated;
		
		PreparedStatement statement = 	connection.prepareStatement(EDIT_SQL);
		
		statement.setString(1,vegetable.getName());
		statement.setString(2,vegetable.getPrice());
		statement.setString(3,vegetable.getStock());
		statement.setString(4,vegetable.getOrderQuantity());
		statement.setInt(1,vegetable.getId());
		
		System.out.println(statement);
		
		rowUpdated = statement.executeUpdate() >0;
		
	
	return rowUpdated;
	
}

public boolean deleteVegetable(int id) throws SQLException, ClassNotFoundException  {
	boolean rowDeleted;
	
	PreparedStatement statement = 	connection.prepareStatement(DELETE_SQL); 
		
		statement.setInt(1,id);
		
		System.out.println(statement);
		int result= statement.executeUpdate();
		
 rowDeleted = result >0;
		
	return rowDeleted;

}
}