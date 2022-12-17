package polymorphism;
//Method over loading means we using same method in parent and child class .
//then we call the parent class reference of child class at main method .
//and it execute the child class method only and executed parent class variable only. 

//example we use the command argument like,
//VillageDemo sb=new Town()

class VillageDemo//parent class
{
	int code=206;//variable in parent class
	public void display()//display() method in parent class
	{
		System.out.println("****Class-Village****Parent Class****");
		System.out.println("village code :"+code);
	}
}

class TownDemo extends VillageDemo//child class with extends of parent class
{
	int code =306;//variable in child class
	public void display()//display() method in child class
	{
		System.out.println("****Class-town*****Child Class******");
		System.out.println("Town code :"+code);
	}
}
public class MethodOverWritingDemo2 
{

	public static void main(String[] args) //main() method
	{
		//calling Argument like ,parent class reference child class
		Village sb=new Town();
		
		sb.display();//calling display() method
		System.out.println("\n\n**************************************");
		System.out.println("Variable :"+sb.code);//Argument like display  the variable.
	
	}

}



							//output
							
							//****Class-town*****Child Class******
							//Town code :306
							
							
							//**************************************
							//Variable :206