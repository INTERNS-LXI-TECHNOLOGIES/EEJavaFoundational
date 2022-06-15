package com.lxisoft.dao;
 import java.sql.*;
import com.lxisoft.vegetable.Vegetable;

public class VegetableDao {


public int addVegetable(Vegetable vegetable) throws ClassNotFoundException  {
	
	String INSERT_USER_SQL = "insert into vegetablestore" +
	"(name,price,stock,minOrderQuantity) values" +
			"(?,?,?,?);";
	
	int result = 0;
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lxisoft","root","Mubashir24092000");
	
	PreparedStatement ps = con.prepareStatement(INSERT_USER_SQL);
		
		ps.setString(2,vegetable.getName());
		ps.setString(3,vegetable.getPrice());
		ps.setString(4,vegetable.getStock());
		ps.setString(5,vegetable.getOrderQuantity());
		
		System.out.println(ps);
		
		result = ps.executeUpdate();
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	return result;
	
	
}




}