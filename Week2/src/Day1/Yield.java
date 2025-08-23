package Day1;


class Demo1 extends Thread{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Hello");
		}
		System.out.println(Thread.currentThread().getName());
	}
}

public class Yield extends Thread{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Welcome");
		}
		System.out.println(Thread.currentThread().getName());
		Thread.yield();
	}


	public static void main(String[] args) {
		Yield t1 = new Yield();
		Demo1 t2 = new Demo1();
		t1.start();
		t2.start();

	}

}
