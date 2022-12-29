package java_8_features;

/*                           in Interface default method

 * 
 * in interface it have only abstract method it can be implements only on the child class...
 * 
 *   but we using default key word front of abstract method it can be usable like a normal method
 *   
 *   And we can also implement the default method a child class..
 *   
 *    in the given example it's explained*/

//interface
interface Methods
{
	//abstract method(it means it can be implementing only on the child class)
	public void display();
	
	//abstract method using default keyword for using normal method
	default public void show()
	{
		System.out.println("hello my world...show() method at default key word");
	}
	
	//another abstract method using default keyword 
	default public void show1()
	{
		System.out.println("show1() method ...");
	}
	
}

//child class implements with interface with using implement key word.. 
public class Default_Method implements Methods
{

					//main() method 
	public static void main(String[] args) 
	{
		
		//calling the child class..
		Default_Method sb=new Default_Method();
		
		//using child class object to call the Interface default method..
		sb.show();
		sb.show1();
		
		//calling the abstract method
		sb.display();
	}

	//override the abstract method in the child class..
	@Override
	public void display()
	{
		System.out.println("abstract display() method...");
		
	}
	

	//we can also able to override the default method at child class..
	@Override
	public void show()
	{
		System.out.println("this is Override default method..");
	}
}
