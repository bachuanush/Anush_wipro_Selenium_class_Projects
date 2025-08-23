package Week1day5;


//public class Thiskey {
//	int rollno, age;
//	String name, collegename, address;
//	float per;
//	
//	void details(int rollno, String name, float per) {
//		this.rollno=rollno;
//		this.name=name;
//		this.per=per;
//		
//		System.out.println("rollno= " + rollno);
//		System.out.println("Name= " + name);
//		System.out.println("per= " + per);
//	}
//
//void details(int rollno, String name)
//{
//	this.rollno=rollno;
//	this.name=name;
//	System.out.println("rollno=" + rollno);
//	System.out.println("Name=" + name);
//}
//	public static void main(String[] args) {
//		Thiskey sa = new Thiskey();
//		sa.details(10, "Minal", 89.90f);
//		sa.details(45, "Raj");
//	}
//}


public class Thiskey {
	void setname(String name) {
		System.out.println(name);
	}
	
	void getname() {
		this.setname("Mittal shah");
		System.out.println("Welcome to Java Learning sessions");
	}		
		public static void main (String[] args) {
			Thiskey ab1 = new Thiskey();
			ab1.getname();
		}
}

