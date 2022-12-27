package threads;

/*Next we talk about Implements With Runnable Interface
 * 
 * there are two steps to multiThreading with using of Runnable Interface
 * 
 * 1.Create a class with implements of Runnable Interface
 * 2.and Override the run() method inside the class..  
 * */

 //Create class Demo and implements Runnable Interface
 class Demo implements Runnable
 {

	   //Override the run() method inside the class
	@Override
	public void run() 
	{
		System.out.println("Thread Demo is Strats:");
		
		//simple for loop.
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		System.out.println("Thread Demo is Exits......");
		
		
		System.out.println("******************************");
	}
	 
 }
 
 //Create Another class Demo1 implements Runnable Interface
 class Demo1 implements Runnable
 {
    
	 //Override the run() method
	@Override
	public void run() 
	{
		System.out.println("Thread Demo1 is Starts..");
		
		for(int j=1;j<=10;j++)
		{
			System.out.println(j);
		}
		
		System.out.println("Thread Demo1 is Exits...");

		
	}
	 
 }
public class MultiThreadingDemo2

{
                  // main() method
	public static void main(String[] args) 
	{
		
		//calling the class
		Demo sb=new Demo();
		Demo1 sb1=new Demo1();
		
		//Below Arguments Describes Convert Runnable Interface to Thread class... 
		Thread q=new Thread(sb);
		Thread q1=new Thread(sb1);
		
		//using start() method..
		q.start();
		q1.start();
		
		
		//the output is differenced at every execution.. 
		
	}

}
