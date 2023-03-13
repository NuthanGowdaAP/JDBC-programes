package com.hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class GetDataHospital 
{
	public static void main(String[] args) {
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/HospitalDB","root","root");
			//PreparedStatement preparedStatement=connection.prepareStatement("select * from Hospital");
		 	PreparedStatement preparedStatement=connection.prepareStatement("select * from Hospital where id=? and name=?");
		//	PreparedStatement preparedStatement=connection.prepareStatement("select * from Hospital where id=?");
			//  PreparedStatement preparedStatement=connection.prepareStatement("select * from Hospital where id in (?,?)");
			preparedStatement.setInt(1,101);
			//preparedStatement.setInt(2,102);
			preparedStatement.setString(2,"manjukalasa");

			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next())
			{
				System.out.println("The Hspital id: "+resultSet.getInt(1));
				System.out.println("The Hspital name: "+resultSet.getString(2));
				System.out.println("The Hspital website: "+resultSet.getString(3));
				System.out.println("The Hspital location: "+resultSet.getString(4));
				System.out.println("****************************************************");
			}
			connection.close();
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}
}
