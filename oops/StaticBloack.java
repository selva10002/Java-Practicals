package oopconcept;

//Static Bloack Used to Create Static data members like,
//Static Variable And other Static Data at inside of the Static Bloack

//Static Bloack runs Before the main Method Runs

public class StaticBloack 

{
	static//Static Method
	
	{
		System.out.println("Static Bloack Runs Befor the Main Method");
		System.out.println("*******************************************");
	}
	
	public static void main(String[] args)//Main Method 
	{
		System.out.println("the Main Method Runs After the Static Bloack");

	}

}
