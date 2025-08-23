package Day1;

public class Passbyref1 {
	public static void changepassword(String passwordString) {
		passwordString = "NewPassword";
	}
	
	public static void main(String[] args) {
		
		String password = "OldPassword";
		changepassword(password); // pass reference
		System.out.println("Password method = " + password);
	}
	
}
