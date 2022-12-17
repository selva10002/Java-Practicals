package polymorphism;

//Method over loading means we using same method in parent and child class .
//then we call the child class at main method it execute the child class method .
//and child class variable only.

//  example we use the command argument like,
// Town sb=new Town()


class Village // parent class 

{
	int code=206;//variable in parent class

	public void display()//display() method in parent class
	
	{
		System.out.println("****Class-Village****Parent Class****");
		System.out.println("village code :"+code);
	}
}

class Town extends Village//child class (because this class is extends of village class(parent class))

{
	int code =306;//variable in child class

	public void display()//display() method in child class
	
	{
		System.out.println("****Class-town*****Child Class******");
		System.out.println("Town code :"+code);
	}
}

public class MethodOverWritingDemo1 
{

	public static void main(String[] args)//main method

	{
		//calling the child class
		Town sb=new Town();
	
		sb.display();//calling the display() method
		
		System.out.println("\n\n*****************************");
		
		System.out.println("Variable :"+sb.code);//calling variable
		
		//It Displayed the child class method and child class variable.
	}
	

}





						//output
						
						//****Class-town*****Child Class******
						//Town code :306
						
						
						//*****************************
						//Variable :306
