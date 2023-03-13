package com.hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class UpdateHospital 
{
	public static void main(String[] args) {
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/HospitalDB","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("update Hospital set name=? where id=?");
			preparedStatement.setString(1,"manjukalasa");
			preparedStatement.setInt(2,101);
			preparedStatement.execute();
			connection.close();
			System.out.println("Data Updated");
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
