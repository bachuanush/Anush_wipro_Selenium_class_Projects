package week1;


class Day3oops {
	String name="Shradhha";// field
	// fields
	// methods
	//static methods
	// block
	// nested class
	
	void deatils(int rollno, String name, float per)// parameterized method
	{
		System.out.println("Rollno ="+rollno);
		System.out.println("Name="+name);
		System.out.println("Pecentage="+per);
		
	}
	double demo()// datatype return method
	{
		return 89.9;
	}
	void test()// no argument method
	{
		
	}
	// block
	{
		System.out.println("Hello guys");
	}
	class nestedclass
	{
		
	}
 
	public static void main(String[] args) {
		// student= classname
		// mohan= objectname
		//new =Keyword for memory management
		// Student()=Constructor
		Day3oops stud=new Day3oops();
		stud.deatils(101, "Mohan raga", 89.9f);
		System.out.println("*********************");
		stud.deatils(102, "Mittal shah", 87.0f);
		
		
		
	}
 
}
 