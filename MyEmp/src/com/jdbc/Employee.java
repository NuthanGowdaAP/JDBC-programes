package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Employee 
{
	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeDB","root","root");
			Statement statement = connection.createStatement();
		    statement.execute("insert into employee values(111,'manjukalasa',21,'male','manju@123')");
			statement.execute("insert into employee values(112,'mbk',22,'male','manju@124')");
			statement.execute("insert into employee values(113,'abc',23,'female','divya@125')");
			statement.execute("insert into employee values(114,'xyz',24,'male','kavya@126')");
			statement.execute("insert into employee values(115,'pqr',25,'female','manju@127')");
			connection.close();
			System.out.println("Data Save");
		}
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}
}