package Week1day5;

//
//class Encapsulation{
//private String name;
//
//public void setName(String name) {
//this.name=name;
//}
//
//public void getName(String name) {
//System.out.println("Person Name="+name);
//}
//
//public static void main(String[] args) {
//	Encapsulation p = new Encapsulation();
//  p.getName("Navin Yadav");
//}
//}
//
//



public class Encapsulation {
	private String name="Navin Yadav";
	private int age=29;
	public String setname()
	{
		return name;
	}
	public int setage()
	{
		return age;
	}
	public void getnameage()
	{
		System.out.println(name);
		System.out.println(age);
	}
 
	public static void main(String[] args) {
		Encapsulation s=new Encapsulation();
		s.getnameage();
 
		
	}
 
}