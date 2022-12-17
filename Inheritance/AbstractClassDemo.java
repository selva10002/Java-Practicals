package inheritance;

// mention abstract keyword before a class that called abstract class.

abstract  class Student
{
	String collage;//it Can't Have final Static constant Variable;
	String Name;
	int marks;
	
	public void input()//we create open method also.
	{
		collage="Govt. Collage";
		Name="Selva";
		marks=90;
	}
	abstract void print(); //we also create abstract method also.
}
public class AbstractClassDemo  extends Student
{

	public static void main(String[] args) 
	{
		//calling the abstract class.
		AbstractClassDemo sb=new AbstractClassDemo();
		
		sb.input();
		sb.print();
	}

	@Override
	void print() //implementing abstract method.
	{
		System.out.println("Collage Name  : "+collage);
		System.out.println("Student Name : "+Name);
		System.out.println("Totall Marks : "+marks);
		
	}

}
