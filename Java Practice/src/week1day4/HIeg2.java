package week1day4;

								//Hirarecal Inheritance

class Hospital{
	void name(String n) {
		System.out.println("The name of the Hospital is : "+n);
	}
}

class Doctor extends Hospital{
	void no(int n) {
		System.out.println("Number of Doctors available : " + n);
	}
}

class Gynac extends Doctor{
	void no(int n) {
		System.out.println("Number of Gynac Doctors available : " + n);
	}
}

class Endo extends Doctor{
	void no1(int n) {
		System.out.println("Number of Endo Doctors available : " + n);
	}
}

class Nurse extends Hospital{
	void nf(int n1) {
		System.out.println("Number of Nurses available : " + n1);
	}
}

class Accountant extends Hospital{
	void nf1(int n2) {
		System.out.println("Number of Accountant available : " + n2);
	}	
}

class Payments extends Accountant{
	void nf2(int n2) {
		System.out.println("Type of Payments available : " + n2);
	}	
}

class Documentation extends Accountant{
	void nf3(int n2) {
		System.out.println("Type of Documentation available : " + n2);
	}	
}


public class HIeg2 {
	public static void main(String[] args) {
		Doctor e1 = new Doctor();
		e1.name("Great Hospitals");
		e1.no(9);
		
		Gynac g1 = new Gynac();
		g1.no(6);
		
		Endo j1 = new Endo();
		j1.no(3);
		
		Nurse p1 = new Nurse();
		p1.nf(54);
		
		
		Documentation s1 = new Documentation();
		s1.nf3(5);
	}
}
