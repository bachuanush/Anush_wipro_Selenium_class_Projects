package Day1;


//We cam create Multi threading using
//1. By extending Thread class
//2. By implementing Runnable Interface


class Mythread1 extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Welcome");
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Mythread extends Thread{
	
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Hello ");
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

	public static void main(String[] args) throws InterruptedException {
		Mythread m1 = new Mythread();  // creating thread
		Mythread1 m2 = new Mythread1();  // creating thread
		
		m1.start();
		m2.join();
		
		m2.start();
		m1.join();
		
	}

}
