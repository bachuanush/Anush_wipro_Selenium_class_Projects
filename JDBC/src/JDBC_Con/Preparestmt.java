package JDBC_Con;

import java.sql.Connection;
import java.sql.*;

public class Preparestmt {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://localhost:3306/mydb";	
		String user = "root";
		String password = "root@1";
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(url, user, password);
		System.out.println("Connection created");
		
		String query="Insert into student1(rollno, name, age) values(?,?,?)";
		PreparedStatement pst =con.prepareStatement(query);
		
		pst.setInt(1, 101);
		pst.setString(2, "Neeva Sharma");
		pst.setInt(3, 20);
		
		pst.setInt(1, 102);
		pst.setString(2, "Neeva Sharma");
		pst.setInt(3, 20);
		
		pst.setInt(1, 103);
		pst.setString(2, "Shiva Upadhyay");
		pst.setInt(3, 20);
		
		int rows = pst.executeUpdate();
		System.out.println(rows +"=Upated rows");

	}

}
