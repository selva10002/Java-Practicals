package threads;

/*In Threads it have three priority
 * 
 * 1.MIN_PRIORITY   -- 1
 * 2.NORM_PRIORITY  -- 5
 * 3.MAX_PRIORITY   -- 10
 * 
 * the priority used to we define witch Thread is execute first...
 * 
 * MAX_PRIORITY Thread  is executed first...
 * 
 * And next Executed the NORM_PRIORITY Thread
 * 
 * And Finally Executed the MIN_PRIORITY
 * */ 


//created class Num and extends with Thread class
class Num extends Thread
{
	       //implementing run() method
	public void run()
	{
		System.out.println("Thread 1 Starts...");
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread 1 :"+i);
		}
	}
}

//Create Class Num2 and extends with Thread class
class Num2 extends Thread
{
	       //implements run() method
	public void run()
	{
		System.out.println("Thread 2 Starts... ");
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread 2 :"+i);
		}
	}
}


//create class Num3 and extends with Thread class..
class Num3 extends Thread
{
	     //implements run() method
	public void run()
	{
		System.out.println("Thread 3 Starts...");
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread 3 :"+i);
		}
	}
}

       //main class
public class ThreadPriorityDemo 
{
					//main() method
	public static void main(String[] args) 
	{
		
		  //calling all class
		Num sb=new Num();
		Num2 sb1=new Num2();
		Num3 sb2=new Num3();
		
		//using setPriority() method to declare the Threads are witch type of priority it have..
		sb.setPriority(Thread.MIN_PRIORITY);
		sb1.setPriority(Thread.NORM_PRIORITY);
		sb2.setPriority(Thread.MAX_PRIORITY);
		
		//using start() method to start the thread process..
		sb.start();
		sb1.start();
		sb2.start();
		

	}

}
