package inerface_enhancement;

/*interface Default Keyword
 * 
 * when we have to use normal methods in the Interface by using of default keyword 
 * 
 * And we can Override also in the child class*/

interface Collage
{
	public void student();
	
	
	default public void status()
	{
		System.out.println("All Students Are pass.");
		//System.out.println();
	}
	
	
}

class Department implements Collage
{

	@Override
	public void student()
	{
		System.out.println("Student Results");
		
	}
	
	@Override
	public void status()
	{
		System.out.println("All Students Are Fail");
	}
	
	
}

public class DefaultMethod1
{

	public static void main(String[] args) 
	{
		Department obj=new Department();
		
		obj.student();
		
		obj.status();
	}

}
