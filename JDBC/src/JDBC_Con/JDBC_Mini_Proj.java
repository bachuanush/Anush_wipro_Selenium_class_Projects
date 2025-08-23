package JDBC_Con;

import java.sql.*;

public class JDBC_Mini_Proj {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		String url = "jdbc:mysql://localhost:3306/mydb";	
		String user = "root";
		String password = "root@1";
		
		//Create table
		String sql = "create table students(rollno int," 
				+ "name varchar(50),"
				+ " per int," 
				+ " city varchar(70),"
				+ "email varchar(50))";
		
		
		//1.Insert records
		String  insertSQL = "insert into students "
				+ "values(101, 'Neeva Sharma',98,'HYD','abc@gmail.com'),"
				+ "(102, 'Sharma',68,'WGL','def@gmail.com'),"
				+ "(103, 'Neeva',75,'HYD','ghi@gmail.com')";
		
		//2.Update Records
		String updateSQL = "update students "
				+ "set per = 88 "
				+ "where rollno = 101";
		
		//3.Find out highest percentage students 
//		String hps = "select * from students where per = (select Max(per) from students)";
//		
//		//4. Arrange records in ascending order
//		String asc= "select * from students order by per asc";
//		
//		//5.Find all the student which belong to same city
//		String scity = "select * from students where city = 'HYD'";
//		
//		//6.Add new column
//		String newCol = "alter table students add age float";
//		
//		//7.Modify column datatype
//		String cnd = "alter table students modify age int";
		
//		//8.Change the name of table
//		String cngName = "rename table students to stu";
//		
//		//9.Delete column
//		String delcol = "alter table stu drop column age";
//		
//		//10.Delete single row
//		String delrow = "delete from stu where rollno = 102";
//		
//		//11.Delete all the records from table without affecting table attributes
//		String delrec = "truncate table stu";
		
//		//12. Delete entire table
//		String droptab = "drop table stu";
		
		try {
			//driver connection
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url, user, password);
			System.out.println("Connection created");
			
			
			//create statement for query execution
			Statement stmt = con.createStatement();
			
			//call create query using statement
			stmt.executeUpdate(sql);
			System.out.println("				Student table created");
			System.out.println("******************************************************************************");
			
			// 2. Insert records
			stmt.executeUpdate(insertSQL);
			System.out.println("				Records inserted");
			System.out.println("******************************************************************************");
			
			//2. updating the records
			stmt.executeUpdate(updateSQL);
			System.out.println("				Student table updated with rollno");
			System.out.println("******************************************************************************");
			
//			//3.Find out highest percentage students  
//			System.out.println("				Student with highest per");
//			System.out.println("******************************************************************************");
//			ResultSet rs1 = stmt.executeQuery(hps);
//            while (rs1.next()) {
//                System.out.println(rs1.getInt("rollno") + "\t" + rs1.getString("name") + "\t" + rs1.getInt("per"));
//            }
//			
//			//4. Arrange records in ascending order
//			System.out.println("				sorted recorded based on per");
//			System.out.println("******************************************************************************");
//			ResultSet rs2 = stmt.executeQuery(asc);
//            while (rs2.next()) {
//                System.out.println(rs2.getInt("rollno") + "\t" + rs2.getString("name") + "\t" + rs2.getInt("per"));
//            }
//
//			//5.Find all the student which belong to same city
//			System.out.println("				Student who belongs to hyd city");
//			System.out.println("******************************************************************************");
//			ResultSet rs3 = stmt.executeQuery(scity);
//            while (rs3.next()) {
//                System.out.println(rs3.getInt("rollno") + "\t" + rs3.getString("name") + "\t" + rs3.getInt("per"));
//            }
//
//			//6.Add new column
//			stmt.executeUpdate(newCol);
//			System.out.println("				Inserting a new column age");
//			System.out.println("******************************************************************************");
//
//			//7.Modify column datatype
//			stmt.executeUpdate(cnd);
//			System.out.println("				Modifying data type for the new column");
//			System.out.println("******************************************************************************");

//			//8.Change the name of table
//			stmt.executeUpdate(cngName);
//			System.out.println("Renaming the table");
//			System.out.println("******************************************************************************");
//
//			//9.Delete column
//			stmt.executeUpdate(delcol);
//			System.out.println("deleting the new column");
//			System.out.println("******************************************************************************");
//
//			//10.Delete single row
//			stmt.executeUpdate(delrow);
//			System.out.println("Deleting a row where id = 102");
//			System.out.println("******************************************************************************");
//
//			//11.Delete all the records from table without affecting table attributes
//			stmt.executeUpdate(delrec);
//			System.out.println("Deleting records from the table without droping the structure");
//			System.out.println("******************************************************************************");

			//12. Delete entire table
//			stmt.executeUpdate(droptab);
//			System.out.println("Droping the table");
//			System.out.println("******************************************************************************");
			
			//call query using statement
			int rowInserted=stmt.executeUpdate(insertSQL);

			if(rowInserted>0)
			{
				System.out.println("new student record inserted ");
			}
			
			//Print table
			ResultSet rs =stmt.executeQuery("Select * from students");
			System.out.println("rollno\t name\t Percentage\t city\t Email");
			
			ResultSet rs7 =stmt.executeQuery("update students set per = 88 where rollno = 101");
			System.out.println("rollno\t name\t Percentage\t city\t Email");
			
			ResultSet rs6 =stmt.executeQuery("Select * from stud");
			System.out.println("rollno\t name\t Percentage\t city\t Email");
			
//			while loop for fecthing all the table records
			while(rs7.next())
			{
			int rollno=rs.getInt("rollno");
			String name=rs.getString("name");
			int per=rs.getInt("per");
			String city=rs.getString("city");
			String email=rs.getString("email");
			
			System.out.println(rollno +"   "+name+"    "+per+"   "+city+"   "+email);
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
