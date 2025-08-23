package JDBC_Con;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;

public class Callable_Statement2 {
	public static void main(String[] args) {
		
		
		String url = "jdbc:mysql://localhost:3306/mydb";
	    String user = "root";
	    String password = "root@1";
	 
	    try (Connection con = DriverManager.getConnection(url, user, password)) {
	        
	    	// Call stored procedure to add bonus
	        CallableStatement cst = con.prepareCall("{Call addbonus()}");
	        cst.execute();
	       
//	        cst.setInt(1,87);                
	       //cst.setString(2, "Neeva sharma");
	 
	        
	     // Retrieve updated employee records
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
	 
	        System.out.println("ID\tName\t\t\tsalary");
	        System.out.println("------------------------------------");
	 
	        while (rs.next()) {
	            int id = rs.getInt("id");
	            String name = rs.getString("name");
	            int sal = rs.getInt("salary");
	 
	            System.out.printf("%d\t%-20s\t%d\n", id, name, sal);
	        }
	 
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
}
