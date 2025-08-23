package Day1;

								//Example 1

//pass by reference

//class user_pass
//{
//	String username;
//	String password;
//}
//
//public class Username_password {
//	static void update_credentials(user_pass up)
//	{
//		up.username = "admin123";
//		up.password = "Pass@123";
//	}
//
//	public static void main(String[] args) {
//		user_pass up = new user_pass();
//		up.username = "User123";
//		up.password = "User@123";
//		
//		update_credentials(up);
//		System.out.println("Username = " + up.username);
//		System.out.println("password = " + up.password);
//	}
//
//}



						//Example 2


//Pass by value


public class Username_password{
	String username,
	 password;
	static void update_credentials1(String username,
	String password)
	{
		username="admin123";
		password="Admin@123";
	}
	public static void main(String[] args) {
		Username_password up1=new Username_password();
		up1.username="User123";
		up1.password="User@123";
		update_credentials1("admin123","Pass@123");
		System.out.println("Username="+up1.username);
		System.out.println("password="+up1.password);
	}

}
