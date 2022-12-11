package oopconcept;

public class ParameterizedConstructor 
{
	//the Parameterized Constructor Created with public modifier 
	
	//And we can Use All So a any Constructor without Any Modifier
	
	//like ParameterizedConstuctor(int a,float b)
	
	public ParameterizedConstructor(int a,float b)
	
	{
		System.out.println("The value of a : "+a);
		System.out.println("The value of b : "+b);
	}
      
	public static void main(String[] args)
	{
	
		//calling the Parameterized Constructor
		
		ParameterizedConstructor sb=new ParameterizedConstructor(10,12.4f);
	}

}
