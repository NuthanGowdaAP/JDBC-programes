package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetDataStudent 
{
	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentDB","root","root");
			Statement statement = connection.createStatement();
			ResultSet resultset =statement.executeQuery("select * from student");
			//  ResultSet resultset =statement.executeQuery("select * from student where id=101");
			while(resultset.next())
			{
				System.out.println("The Student id is: "+resultset.getInt(1));
				System.out.println("The Student Name is: "+resultset.getString(2));
				System.out.println("The Student Age is: "+resultset.getInt(3));
				System.out.println("The Student Gender is: "+resultset.getString(4));
				System.out.println("*************************************************");
			}
			connection.close();
		}
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}
}