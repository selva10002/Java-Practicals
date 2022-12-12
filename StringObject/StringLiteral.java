package stringobject;
 // String Literal using Pool Memory
public class StringLiteral 
{
 
	public static void main(String[] args)
	{ 
		//In String Literal the variable Storing Data is same it Stores once in the Memory Location
		
		String Name="Selva";//the Name  Data Stores in Memory location like(11)
		
		String Name2="Selva";//the Name2 data Stores in the same memory Location like(11)
		
		String Name3="Selva";//Name3 also use Same Memory Location
		
		String Name4="Magi";//Name4 is use another Memory Address Becase the Variable Data is Different
		
		String Name5="Kanniyappan";//Name5 Also use Another Memory Address Becase it's Variable is Different
		
		System.out.println("Name :"+Name+"\nHashcode :"+Name.hashCode());
		
		System.out.println("Name :"+Name2+"\nHashcode :"+Name2.hashCode());//hashcode() this keyword used to display the memory adders
		
		System.out.println("Name :"+Name3+"\nHashcode :"+Name3.hashCode());
		
		System.out.println("Name :"+Name4+"\nHashcode :"+Name4.hashCode());
		
		System.out.println("Name :"+Name5+"\nHashcode :"+Name5.hashCode());

	}

}
