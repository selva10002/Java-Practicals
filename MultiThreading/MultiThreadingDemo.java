package threads;

/*In MultiThreading there are twos to declare it that are given below
 * 
 * 1.Extending with Thread Class
 * 2.Implementing with Runnable Interface
 * 
 * First we talk about Extending with Thread Class
 * 
 *  creating Thread class by following Steps
 *  
 *  1.create a Class extends with Thread class
 *  2.implement run() method inside of the class*/


//class Z is created and extended with Thread class
class Z extends Thread
{
	           //implementing run() method inside of the class Z  
	public void run()
	{
		System.out.println("Thread Z is Started ");
		
		//simple for loop
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread Z :"+i);
			
		}
		
		System.out.println("Thread Z is Exits.....");
	}
}

//Create Another class Y and it's extended with Thread class
class Y extends Thread
{
	        //implements run() method
	public void run()
	{
		System.out.println("Thread Y is Started ");
		
		for(int x=1;x<=10;x++)
		{
			System.out.println("Thread Y :"+x);
			
		}
		
		System.out.println("Thread Y is Exits.....");
	}
}

//Create another class X and It's extended with Thread class
class X extends Thread
{
	        //implements run() method
	public void run()
	{
		System.out.println("Thread X is Started ");
		
		for(int j=1;j<=10;j++)
		{
			System.out.println("Thread X :"+j);
			
		}
		
		System.out.println("Thread X is Exits.....");
	}
}
public class MultiThreadingDemo 
{

	                        //main method
	public static void main(String[] args) 
	{
		
		//calling the classes
		Z sb=new Z();
		Y sb1=new Y();
		X sb2=new X();
		
		

		//then using start() method to Start the multiThreading  process. 
		sb.start();
		sb1.start();
		sb2.start();
		
		
		

	}

}
