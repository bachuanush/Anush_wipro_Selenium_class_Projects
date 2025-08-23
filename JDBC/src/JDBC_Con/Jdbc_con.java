package JDBC_Con;
//Week2 
//Day 10
//import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Jdbc_con {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//import packages
		//create object for connection
		//Retrieve data
		//close connection
		String url = "jdbc:mysql://localhost:3306/mydb";	
		String user = "root";
		String password = "root@1";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url, user, password);
		System.out.println("Connection created");
		//create statement
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from Emp");
		System.out.println("ID    name  salary");
		
		while(rs.next())
		{
		int id=rs.getInt("Id");
		String name=rs.getString("name");
		int salary=rs.getInt("salary");
		System.out.println(id +"   "+name+"    "+salary);
		}
		
		rs.close();
		stmt.close();
		con.close();
	}

}
