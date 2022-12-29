package java_8_features;

/*  in Interface Static method
 * 
 * the abstract method using static keyword it can't be implementable at the child class
 * 
 * and we create many number of Static method in interface*/



//creating Interface
interface MethodDemo

{
	//Abstract() method
	public void display();
	
	//abstract() method assigning to static() method
	public static  void show()
	{
		System.out.println("show() method with assignning Static");
	}
	
	//abstract() method assigning to static() method
	public static void show1()
	{
		System.out.println("show1() method with assigning Static");
		
	}
	
}

public class Static_Method implements MethodDemo
{
	
	    			//main() method
	public static void main(String[] args)
	{
		
		//calling the child class
		Static_Method sb=new Static_Method();
		
		//calling the abstract() method using of object(sb)
		sb.display();
		
		//calling the Static() method using of interface name..
		MethodDemo.show();
		MethodDemo.show1();

	}

	//Override the abstract method
	@Override
	public void display()
	{
		System.out.println("Abstract display() method");
		
	}

}
