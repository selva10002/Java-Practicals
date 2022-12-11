package oopconcept;
// Static Variable that means an Variable Before a Static Word(Concept) 

//Example

//normal Variable Declaration
//int a,String Name,float s;

//Static Variable Declaration
//static int a,static String Name,static float s;

public class StaticVariable 

{
	
	int id;    // instance Variable
	
	String Name;//instance Variable
	
	static String Collage = "Government Collage";//instance Variable with static (Or) static Variable
    
	StaticVariable(int id,String Name)//parameterized Constructor (two Parameter)
    
	{
    	this.id=id;   //(this) keyword used to assigning the local Variable and Instance Variable is same. 
    	this.Name=Name;
    	
    }
    
	void Display()//Display method
    
	{
    	System.out.println("Student ID :"+id+"\nStudent NAME :"+Name+"\nCollage :"+Collage);
    }
	
	public static void main(String[] args) 
	
	{
		//calling parameterized Constructor
		StaticVariable sb =new StaticVariable(77,"Selva");
		
		sb.Display();//calling Display Method
		
		StaticVariable sb1 =new  StaticVariable(78,"Knniyappan");
		
		sb1.Display();
		
		StaticVariable sb2=new StaticVariable(79,"Gopi");
		
		sb2.Display();
 
	}

}
