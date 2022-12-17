package polymorphism;

//the super keyword used to call the other class same method,
//(same method means the same name of method is already used in the child class),
//at the child class .

//for example 
//the parent class display() method is called in child class display() method with use of super keyword

class MyVillage//parent class

{
	int code=206;
	
	public void display()
	
	{
		System.out.println("****Class-Village****Parent Class****");
		System.out.println("village code :"+code);
	}
}

class MyTown extends MyVillage//child class

{
	int code =306;
	
	public void display()
	
	{
		super.display();//super keyword
		
		System.out.println("\n\n****Class-town*****Child Class******");
		System.out.println("Town code :"+code);
	}
}

public class SuperKeyWord 

{

	public static void main(String[] args)
	
	{
		//calling child class
		MyTown sb=new MyTown();
		
		sb.display();
		
		System.out.println("\n\n*****************************************");
		System.out.println("Variable :"+sb.code);

	}

}
