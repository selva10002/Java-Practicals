package oopconcept;

// Static Method means apply the Static keyword at any method that called Static Method

public class StaticMethod 

{
	int id;//instance Variable
	String Name;
	static String Collage="Government Collage";//Static Variable
	
	static void Change()//Static Method Using Static keyword 
	
	{
		Collage="Private Collage";
	}
	
	StaticMethod(int id,String Name)//Parameterized Constructor(two Parameters)
	
	{
		this.id=id;
		this.Name=Name;
		
	}
	
	void Display()//Display Method Used to display the Constructor Values 
	
	{
		System.out.println("Student ID :"+id+"\nStudent Name :"+Name+"\nCollage :"+Collage);
	}
	
	public static void main(String[] args)
	
	{
	
		//Calling Static Method Using of class name and method name. 
		StaticMethod.Change();
		
		//Calling Parameterized Constructor
		StaticMethod sb=new StaticMethod(88,"Magi");
		
		//Calling Display Method.
		sb.Display();
		
		StaticMethod sb1=new StaticMethod(89,"Selva Ganabadhi");
		sb1.Display();
		
		StaticMethod sb2=new StaticMethod(90,"Prakash");
		sb2.Display();
		

	}

}
