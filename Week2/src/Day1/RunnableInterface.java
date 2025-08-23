package Day1;

//implements runnable interface


class myrun1 implements Runnable
{
	@Override
	public void run() {
		for(int i=1; i<=5; i++)
		{
			System.out.println("Hello");
		}
		System.out.println("Current thread name = " + Thread.currentThread().getName());
		
	}
}

public class RunnableInterface {

	public static void main(String[] args) {
		RunnableInterface t = new RunnableInterface();//runnable interface child class object(Runnable state)
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		t1.start();
		t2.start();
		
		//constructor for Thread
		//Thread()
		//Thread(Runnable state)
		//Thread(Thread name)
		//Thread(Runnable state, Thread Name)
		
	}

}
