package threads;
/*Some method in Threading the method are used to declaring the multiTheading process..
 * 
 * that are give below
 * 
 * 1.currentThread() method
 * 2.setName() method
 *  
 * */

class Demo_A extends Thread
{
	
	public void run()
	{
		 						//currentThread() method used to Display the current Thread..
		
		//example
		//it display the thread name at currently processing in class Demo_A
		System.out.println("Thread Demo_A Starts...."+Thread.currentThread());
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Demo_A :"+i);
		}
		System.out.println("Thread Demo_A ends.....");
	}
}

class Demo_B extends Thread
{
	
	public void run()
	{
											//use currentThread() method to display the current Thread..
		System.out.println("Thread Demo_B Starts...."+Thread.currentThread());
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Demo_B :"+i);
		}
		System.out.println("Thread Demo_B ends.....");
	}
}

public class MethodsInThreadsDemo 
{

	public static void main(String[] args)
	{
		Demo_A sb=new Demo_A();
		Demo_B sb1=new Demo_B();
		
		sb.start();
		sb1.start();
		
		//the setName() method used to set a name in to Thread....
		sb.setName("Thread sb");
		sb1.setName("Thread sb1");

	}

}
