package java_8_features;

/*      FunctionInterface
 * 
 * it Defines a interface contains only one abstract method that called Functional interface
 * 
 * but it contains many number of default an static method at interface*/


//interface declared to functional interface by using of @FunctionalInterface tag.. 
@FunctionalInterface
interface Demo1
{
	
	//abstract method
	public void display();
	
	//default method
	default public void show()
	{
		System.out.println("Default key word using at abstract method");
	}
	
	//static method
	public static void show1()
	{
		System.out.println("static method at abstract method");
	}
}

//child class implements Demo1 interface
public class FunctionalInterfaceDemo implements Demo1
{

					//main() method
	public static void main(String[] args) 
	{
		
		//calling the child class
		FunctionalInterfaceDemo sb=new FunctionalInterfaceDemo();
		
		//calling the display() method
		sb.display();
		
		//calling the show() method
		sb.show();
		
		//calling Static method using of interface name.
		Demo1.show1();

	}

	
	//Override the abstract method..
	@Override
	public void display()
	{
		System.out.println("abstract method in Demo1 interface");
		
	}

}
