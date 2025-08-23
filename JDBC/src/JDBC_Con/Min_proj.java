//package JDBC_Con;
//import java.sql.*;
//
//
//public class Min_proj {
//
//	public static void main(String[] args) throws ClassNotFoundException, SQLException{
//
//				String url = "jdbc:mysql://localhost:3306/mydb";
//				String user = "root";
//				String password = "root@1";
//
//				String sql = "create table if not exists students(rollno int, "
//						+ "name varchar(50), "
//						+ "per int, "
//						+ "city varchar(70), "
//						+ "email varchar(50))";
//
//				String insertSQL = "insert into students "
//						+ "values(101, 'Kapil', 98, 'HYD', 'abc@gmail.com'), "
//						+ "(102, 'Sharma', 68, 'WGL', 'def@gmail.com'), "
//						+ "(103, 'Neeva', 75, 'HYD', 'ghi@gmail.com')";
//
//				String updateSQL = "update students set per = 88 where rollno = 101";
//				String hps = "select * from students where per = (select max(per) from students)";
//				String asc = "select * from students order by per asc";
//				String scity = "select * from students where city = 'HYD'";
////				String newCol = "alter table students add column age int";
////				String modifyCol = "alter table students modify column age int";
//
//				try {
//					Class.forName("com.mysql.cj.jdbc.Driver");
//					Connection con = DriverManager.getConnection(url, user, password);
//					System.out.println("Connection created");
//
//					Statement stmt = con.createStatement();
//
//					// 1. Create table
//					stmt.executeUpdate(sql);
//					System.out.println("				Student table created");
//					System.out.println("******************************************************************************");
//
//					// 2. Insert records
//					stmt.executeUpdate(insertSQL);
//					System.out.println("				Records inserted");
//					System.out.println("******************************************************************************");
//					ResultSet insertedRS = stmt.executeQuery("select * from students");
//					while (insertedRS.next()) {
//						System.out.println(insertedRS.getInt("rollno") + "\t" + insertedRS.getString("name") + "\t" +
//								insertedRS.getInt("per") + "\t" + insertedRS.getString("city") + "\t" + insertedRS.getString("email"));
//					}
//					System.out.println("******************************************************************************");
//
//					// 3. Update records
//					stmt.executeUpdate(updateSQL);
//					System.out.println("				Student record updated (rollno = 101)");
//					System.out.println("******************************************************************************");
//					
//					ResultSet updatedRS = stmt.executeQuery("select * from students where rollno = 101");
//					while (updatedRS.next()) {
//						System.out.println(updatedRS.getInt("rollno") + "\t" + updatedRS.getString("name") + "\t" +
//								updatedRS.getInt("per") + "\t" + updatedRS.getString("city") + "\t" + updatedRS.getString("email"));
//					}
//					System.out.println("******************************************************************************");
//
//					// 4. Highest percentage
//					System.out.println("				Student(s) with highest percentage:");
//					System.out.println("******************************************************************************");
//					ResultSet rs1 = stmt.executeQuery(hps);
//					while (rs1.next()) {
//						System.out.println(rs1.getInt("rollno") + "\t" + rs1.getString("name") + "\t" +
//								rs1.getInt("per"));
//					}
//					System.out.println("******************************************************************************");
//
//					// 5. Ascending order
//					System.out.println("				Students sorted by percentage (ascending):");
//					System.out.println("******************************************************************************");
//					ResultSet rs2 = stmt.executeQuery(asc);
//					while (rs2.next()) {
//						System.out.println(rs2.getInt("rollno") + "\t" + rs2.getString("name") + "\t" + rs2.getInt("per"));
//					}
//					System.out.println("******************************************************************************");
//
//					// 6. Same city (HYD)
//					System.out.println("				Students from HYD:");
//					System.out.println("******************************************************************************");
//					ResultSet rs3 = stmt.executeQuery(scity);
//					while (rs3.next()) {
//						System.out.println(rs3.getInt("rollno") + "\t" + rs3.getString("name") + "\t" + rs3.getInt("per"));
//					}
//					System.out.println("******************************************************************************");
//
//					// 7. Add new column
////					stmt.executeUpdate(newCol);
////					System.out.println("				New column 'age' added");
////					System.out.println("******************************************************************************");
////
////					// 8. Modify column
////					stmt.executeUpdate(modifyCol);
////					System.out.println("				Modified 'age' column to int type");
////					System.out.println("******************************************************************************");
//
//					// Final Display
//					System.out.println("				Final student table:");
////					System.out.println("rollno\tname\t\tper\tcity\temail");
//					System.out.println("******************************************************************************");
//					ResultSet rs = stmt.executeQuery("select * from students");
//					while (rs.next()) {
//						int rollno = rs.getInt("rollno");
//						String name = rs.getString("name");
//						int per = rs.getInt("per");
//						String city = rs.getString("city");
//						String email = rs.getString("email");
//
//						System.out.println(rollno + "\t" + name + "\t" + per + "\t" + city + "\t" + email);
//					}
//					System.out.println("******************************************************************************");
//
//					stmt.close();
//					con.close();
//
//				} catch (SQLException e) {
//					System.out.println("SQL Exception: " + e.getMessage());
//				} catch (ClassNotFoundException e) {
//					System.out.println("Class Not Found: " + e.getMessage());
//				}
//
//				System.out.println("Done");
//		
//	}
//
//}
