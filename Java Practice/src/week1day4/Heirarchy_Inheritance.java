package week1day4;


class Vechile1{
	void start(String st) {
		System.out.println("The vehicle starts with "+st);
	}
	
	void stop(String st1) {
		System.out.println("The vehicle stops with "+st1);
	}
}

class Car1 extends Vechile1{
	void model(String m) {
		System.out.println("The model of the car is "+m);
	}
}

class Scooty extends Vechile1{
	void type_of_Scooter(String type) {
		System.out.println(type + " Scooter");
	}
	void no_of_seta(int st) {
		System.out.println(st + " seats available");
	}
}


public class Heirarchy_Inheritance {
	public static void main(String[] args) {
		Scooty sc = new Scooty();
		System.out.println("*******The 2 Wheeler Scooty*******");
		sc.no_of_seta(2);
		sc.type_of_Scooter("Activa");
	}
}
