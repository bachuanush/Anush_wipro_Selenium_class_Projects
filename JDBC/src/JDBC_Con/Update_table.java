package JDBC_Con;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update_table {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/mydb";	
		String user = "root";
		String password = "root@1";
		
		//Create table
		String sql = "create table if not exists students(rollno int," 
				+ "name varchar(50),"
				+ " per int," 
				+ "email varchar(50))";
		
		
		//Insert records
		String  insertSQL = "insert into students "
				+ "values(101, 'Neeva Sharma',98,'abc@gmail.com'),"
				+ "(102, 'Sharma',68,'def@gmail.com'),"
				+ "(103, 'Neeva',75,'ghi@gmail.com')";
		
		//Update Records
		String updateSQL = "update students "
				+ "set per = 88 "
				+ "where rollno = 101";
		
		
		try {
			//driver connection
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user, password);
			System.out.println("Connection created");
			
			
			//create statement for query execution
			Statement stmt = con.createStatement();
			
			//call create query using statement
			stmt.executeUpdate(sql);
			System.out.println("Student table created");
			
			//updating the records
			stmt.executeUpdate(updateSQL);
			System.out.println("Student table updated with rollno");
			
			//call insert query using statement
			int rowInserted=stmt.executeUpdate(insertSQL);
			int recordUpdated=stmt.executeUpdate(updateSQL);
			
			if(rowInserted>0)
			{
				System.out.println("new student record inserted ");
			}
			
			//Print table
			ResultSet rs =stmt.executeQuery("Select * from students");
			System.out.println("rollno\t name\t Percentage\t Email");
			
			//while loop for fecthing all the table records
			while(rs.next())
			{
			int rollno=rs.getInt("rollno");
			String name=rs.getString("name");
			int per=rs.getInt("per");
			String email=rs.getString("email");
			
			System.out.println(rollno +"   "+name+"    "+per+"   "+email);
			}
			
			
			stmt.close();
			con.close();
			
		} catch (SQLException e) {
			System.out.println(e);
		}
		catch(ClassNotFoundException e) {
			System.out.println(e);
		}
		
		System.out.println("Connection created");

	}

}
