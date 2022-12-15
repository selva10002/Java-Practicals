package inheritance;

// the Multiple inheritance is not working in java programming so use another method for those that is interface. 

interface company

{
	final static String name="IT";//interface only have final static constant variable  
	final static int number=45;
	abstract void print();

}

interface collage
{
	final static String name="collage of tindivanam";
	final static int number=409;
	abstract void print();// interface have only abstract methods
	
}

class student
{
	void input()
	{
		System.out.println("*************************");
		System.out.println("input of Student Detials");
	}

	void output()
	{
		System.out.println("Student out comes");
	}
}

class Student1 extends student implements collage,company//calling interfaces using key word of implements.

{
	void input1()
	{
		System.out.println("*************************");
		System.out.println("selected Student Dedials");
	}

	void output1()
	{
		System.out.println("Selected out COme Students");
	}
	
	
	@Override
	public void print() //the abstract method implemented at inside of extends class.
	{
		System.out.println("*****************************");
		
		System.out.println("Company Name :"+company.name);
		System.out.println("Company ID :"+company.number);
	
		System.out.println("*****************************");
		
		System.out.println("Collage Name :"+collage.name);
		System.out.println("Collage ID:"+collage.number);
		
	}
}
public class MultipileInheritanceDemo 
{

	public static void main(String[] args)//main method 
	{
		//the Extends calling Arguments 
	Student1 sb=new Student1();
	sb.input();
	sb.output();
	
	sb.input1();
	sb.output1();
	
	sb.print();//override method calling

	
			

	}

}
