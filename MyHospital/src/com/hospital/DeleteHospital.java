package com.hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class DeleteHospital 
{
	public static void main(String[] args) {
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/HospitalDB","root","root");
			PreparedStatement preparedStatement=connection.prepareStatement("Delete from Hospital where id=?");
			preparedStatement.setInt(1,103);
			preparedStatement.setInt(1,105);
			preparedStatement.setInt(1,104);
			preparedStatement.execute();
			connection.close();
			System.out.println("Data Deleted");
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
