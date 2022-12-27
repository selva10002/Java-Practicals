package threads;

/* Using sleep() method
 * 
 * the method used to suspends one thread at a fixed time*/


  // Creating class S extends with Thread class
class S extends Thread
{
	          //implementing run() method
	public void run()
	{
		System.out.println("Thread S is Starts..... ");
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			
			//using try catch method because the sleep method gives exception error..(InterruptedException)
			//it is a compile time exception error..
			try 
			{
				     //using sleep() method reference of Thread class... with 1000 millisecond delay 
				Thread.sleep(1000);
			}
			
			//catch method used to catch the exception
			catch (InterruptedException e) 
			{
				System.out.println("Exception occured :");
			}
		}
		
		System.out.println("Thread S is Exits.......");
	}
}

//Creating class V extends with Thread class
class V extends Thread
{
	     //implementing run() method... 
	public void run()
	{
		System.out.println("Thread V is Starts..... ");
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			//using try catch method
			try
			{
				
				    //declaring sleep() method with assigning of 500 millisecond delay
				Thread.sleep(500);
			}
			
			//declaring catch method to catch the exception error.. 
			catch (InterruptedException e) 
			{
			
			   System.out.println("Exception occured :");
			}
		}
		
		System.out.println("Thread V is Exits.......");
	}
}


//creating class R extends with Thread class....
class R extends Thread
{
	public void run()
	{
		System.out.println("Thread R is Starts..... ");
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			//declaring try catch method...
			try
			{
				  //declaring sleep() method reference of Thread class and assigning 1500 millisecond delay..
				Thread.sleep(1500);
			}
			catch (InterruptedException e)
			{
		
				System.out.println("Exception Occured :");
			}
		}
		
		System.out.println("Thread R is Exits.......");
	}
}


//class T extends with Thread class..
class T extends Thread
{
	
	//implements run() method
	public void run()
	{
		System.out.println("Thread T is Starts..... ");
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		System.out.println("Thread T is Exits.......");
	}
}

///class M extends with Thread class.
class M extends Thread
{
	
	     //implements run() method
	public void run()
	{
		System.out.println("Thread M is Starts..... ");
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
		System.out.println("Thread M is Exits.......");
	}
}





public class SleepMethodDemo 
{
 
	                //main() method..         
	public static void main(String[] args) 
	{
		//calling the child class..
		S sb1=new S();
		V sb2=new V();
		R sb3=new R();
		T sb4=new T();
		M sb5=new M();
		
		//declaring start() method to start the MultiThreading process..
		sb1.start();
		sb2.start();
		sb3.start();
		sb4.start();
		sb5.start();

	}

}
