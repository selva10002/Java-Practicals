package exceptiondemo;

//Exception handing 
//there are two type of Exception handling 
//1.Check Exception Handing        --  At Compile Time
//2.Not check Exception Handling   --  At Run Time

//All exception are Commonly a Not checked Exception

//And All Exceptions Are a Class.
class Excep1
{
	int a=10;
	int b=20;
	
	public void display()
	{
		//using try catch method to check the exception handing at run time,  
		try 
		{
			System.out.println("\n*********************************\n");
			System.out.println("before exception");
			
			System.out.println("All is well");
			
			System.out.println("\n*********************************\n");
			System.out.println("\nAfter Exception\n");
			
			//in this line an exception error like ArithmeticEception error 
			//so next line can not be executed.
			int c=b/0;
			
			System.out.println("Not Well");
		}
		//catch this is used to check the Exception
		catch (Exception e)
		{
			
			System.out.println("the eception is:"+e);
			
			System.out.println("\n*************After Finally method*****************");
		}
		
		//this finally method is optional .we can used to execute the segment inside of finally method..  
		finally
		{
			System.out.println("good night");
		}
		
		System.out.println("\n******************************************");
		
	}
	
	public void show()
	{
		
		System.out.println("a:b value ="+a+":"+b);
	}
}
public class ExceptionDemo1 
{
	

	public static void main(String[] args) 
	{
		
		//calling the class to execute the all method...
		Excep1 sb=new Excep1();
		
		
		//calling display() method
		sb.display();
		
		//calling show() method..
		sb.show();
		
	}

}
