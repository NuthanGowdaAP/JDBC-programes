package com.infosys;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Infosys {
	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/infosyshiring","root","root");
			Statement statement = connection.createStatement();
		    statement.execute("insert into infosysemp values(101,'manju',21,'male',779554340,25000,'Software Engineer')");
		    statement.execute("insert into infosysemp values(102,'kalasa',25,'male',999543450,35000,'Senior Software Engineer')");
		    statement.execute("insert into infosysemp values(103,'mbk',65,'male',885554450,55000,'Software triner Engineer')");
		    statement.execute("insert into infosysemp values(104,'xyz',61,'female',639543450,35000,'Senior Software Engineer')");
		    statement.execute("insert into infosysemp values(105,'abc',40,'male',989554450,25000,'Software Engineer')");
		    statement.execute("insert into infosysemp values(106,'bc',30,'male',779554350,25000,'testing Engineer')");
		    statement.execute("insert into infosysemp values(107,'mk',45,'male',997554350,35000,'Senior Software Engineer')");
		    statement.execute("insert into infosysemp values(108,'suma',35,'female',889543450,45000,'Software Engineer')");  
		    statement.execute("insert into infosysemp values(109,'mkk',61,'male',778544350,45000,'Software Engineer')");
		    statement.execute("insert into infosysemp values(110,'mbbm',55,'female',899453450,55000,'Assi Software Engineer')");
			connection.close();
			System.out.println("Data Inserted");
		}
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}
}