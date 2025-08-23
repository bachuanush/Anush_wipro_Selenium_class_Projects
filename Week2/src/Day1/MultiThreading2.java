package Day1;


//We can create Multi threading using
//1. By extending Thread class
//2. By implementing Runnable Interface


class Mythread3 extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Welcome");
			
		}
		System.out.println("Print id for thread="+Thread.currentThread().getId());
		System.out.println("current name="+Thread.currentThread().getName());
		Thread.currentThread().setName("Print_welcome_message");
		System.out.println("New name is="+Thread.currentThread().getName());
		System.out.println("Priority test1 is="+Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(10);
		System.out.println("New Priority for test1 is="+Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().isAlive());
		
	}
}

public class MultiThreading2 extends Thread{
	
	public void run()
	{
		for(int i=1; i<=5; i++)
		{
			System.out.println("Hello ");
			
		}
//		System.out.println("Print id for thread="+Thread.currentThread().getId());
//		System.out.println("current name="+Thread.currentThread().getName());
//		Thread.currentThread().setName("Print_Hello_message");
//		System.out.println("New name is="+Thread.currentThread().getName());
		System.out.println("Priority test is="+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(9);
		System.out.println("New Priority for test is="+Thread.currentThread().getPriority());
	}
	

	public static void main(String[] args) throws InterruptedException {
		MultiThreading2 m1 = new MultiThreading2();  // creating thread
		Mythread3 m2 = new Mythread3();  // creating thread
		
		m1.start();
		m2.join();
		
		m2.start();
		m1.join();
		
		System.out.println(m1.isAlive());
		
	}

}