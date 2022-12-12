package stringclassmethods;
// In String the trim() method used to cancel the unwanted spaces at start's and end's of String value
public class Trim 
{

	public static void main(String[] args) 
	{
		String Name=" Selva ";
		
		System.out.println("without using trim() method");
		
		System.out.println("Name :"+Name);
		
		System.out.println("***************");
		
		System.out.println("with using trim() method"); 
		
		System.out.println("Name :"+Name.trim());//trim() method
	}

}
