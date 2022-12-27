package inerface_enhancement;


interface Demo
{
	public void run();
	
	default public void show()
	{
		System.out.println("default keyword");
	}
	public static void display()
	{
		System.out.println("All is well");
	}
}

class Child implements Demo

{
	

	@Override
	public void run() 
	{
		System.out.println("abstract run() method");
		
	}
	
}

public class StaticMethod
{

	public static void main(String[] args)
	{
		Child obj=new Child();
		
		obj.run();
		
		obj.show();
		
		Demo.display();
		
		
		

	}

}
