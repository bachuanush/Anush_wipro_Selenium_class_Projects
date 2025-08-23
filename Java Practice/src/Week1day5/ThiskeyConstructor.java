package Week1day5;

public class ThiskeyConstructor {
	ThiskeyConstructor(String name) {
		System.out.println(name);
	}
	ThiskeyConstructor(){
		this("im from Test1 parameterized constructor");
		System.out.println("welcome to my space");
	}
	
	public static void main(String[] args) {
		ThiskeyConstructor abt = new ThiskeyConstructor();
	}
}
