package oopconcept;

// using Display Method TO Display An Value
public class DisplayMethod 
{
	int id;
	String name;
   public DisplayMethod(int id,String name)//Parameterized Constructor
   {
	   this.id=id;
	   this.name=name;
	 System.out.println("ID:NAME");  
   }
   void Display()//Display Method
   {
	   System.out.println(id+""+name);
   }
	public static void main(String[] args) 
	{
		//calling Constructor
		DisplayMethod obj=new DisplayMethod(1,"\nSelva");
		//calling Display Method And asign to Display the Value of Constructor 
		obj.Display();
		
	}

}
