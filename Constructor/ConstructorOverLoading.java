package oopconcept;

//Constructor Over Loading That means Two or more Constructor using the same class 

public class ConstructorOverLoading 
{
	ConstructorOverLoading()//Default Constructor
	{
		System.out.println(" the Squre value of x");
	}
	ConstructorOverLoading(int x)//parameterized Constructor (One Parameter)
	{
		
		System.out.println("Enter  the Value of a :" +(x-2));
		System.out.println("***********************");
	}
	ConstructorOverLoading(int a,int b)//Parameterized Constructor (Two Parameter)
	{
		
		System.out.println("Mulitplication : "+(a*b));
		System.out.println("*********************");
		
	}
	public static void main(String[] args)
	{
		//Calling Arguments of Constructors
		ConstructorOverLoading sb = new ConstructorOverLoading();
		ConstructorOverLoading sb1 = new ConstructorOverLoading(5);
		ConstructorOverLoading sb2 = new ConstructorOverLoading(5,6);
		
		
	}
}
