package com.hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Hospital {

	public static void main(String[] args) {
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/HospitalDB","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("insert into Hospital values(?,?,?,?)");
			preparedStatement.setInt(1, 101);
			preparedStatement.setString(2, "manju");
			preparedStatement.setString(3, "www.mkhospital.com");
			preparedStatement.setString(4, "Banglore");
			preparedStatement.execute();
			connection.close();
			System.out.println("Data Saved");
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
