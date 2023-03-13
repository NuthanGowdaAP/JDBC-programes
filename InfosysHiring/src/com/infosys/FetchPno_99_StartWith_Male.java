package com.infosys;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchPno_99_StartWith_Male
{
	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/infosyshiring","root","root");
			Statement statement = connection.createStatement();
			ResultSet resultset =statement.executeQuery("select * from infosysemp where phoneno like '99%' and gender='male' ");
			while(resultset.next())
			{
				System.out.println("The Student id is: "+resultset.getInt(1));
				System.out.println("The Student Name is: "+resultset.getString(2));
				System.out.println("The Student Age is: "+resultset.getInt(3));
				System.out.println("The Student Gender is: "+resultset.getString(4));
				System.out.println("The Student Phone NO is: "+resultset.getInt(5));
				System.out.println("The Student Salary is: "+resultset.getDouble(6));
				System.out.println("The Student Designation is: "+resultset.getString(7));
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