package inerface_enhancement;
/*          rules of interface
 * 
 * 1.it contains only final Static Data types or (variable) or(value)
 *
 * 2.it contains only abstract methods
 * 
 * 3.the abstract method are implements in the child class.
 * */
interface Sweet
{
	final static int a=9;
	
	public void display();
	
	
	
}

class Tamil implements Sweet
{

	@Override
	public void display()
	{
		System.out.println("abstract method display");
		
	}
	
}
public class DefaultMethod
{
	

	public static void main(String[] args)
	{
		Tamil obj=new Tamil();
		obj.display();

	}

}
