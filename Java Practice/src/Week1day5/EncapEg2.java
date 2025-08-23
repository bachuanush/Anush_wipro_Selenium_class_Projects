package Week1day5;
													//Practice done
public class EncapEg2 {
	public String username = "newuser1";
	private String password;
	
	public void setpass(String p) {
		password = p;
	}
	
	public void getlogin() {
		System.out.println("UserName is : "+username);
		System.out.println("Password is : "+password);
	}
	
	
	public static void main(String[] args) {

		EncapEg2 ab = new EncapEg2();
		ab.setpass("mypassword4");
		ab.getlogin();
		
	}

}
