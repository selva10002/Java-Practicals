package stringclassmethods;
//the equalsignorecase() method work also like equals() method but it compare the String Characters 
//the character is uppercase or lowercase that is not a meter i can be true.
//example 
//String name="SELVA";
//String name ="selva";

public class EqualsIgnoreCase 
{

	public static void main(String[] args) 
	{
		String Name ="SELVA"; //String 1

		String Name1="selva"; //String 2
		
		String Name3="MaGi"; //String 3
		
		String Name4="mAgI"; //String 4
		
		if(Name.equalsIgnoreCase(Name1))//equalsignoreCase() method
		
		{
			System.out.println("the (Name),(Name1) String are same compare by the Characters");
		}
		
		else
		
		{
			System.out.println("the (Name),(Name1) String are Not same Compare by the Character");
		}
        
		System.out.println("*************************************************************************");
		
		if(Name3.equalsIgnoreCase(Name4))//equalignoreCase() method
		
		{
			System.out.println("the (Name3),(Name4) String are same compare by the Characters");
		}
		
		else
		
		{
			System.out.println("the (Name3),(Name4) String are not same compare by the Characters");
		}
}


}
