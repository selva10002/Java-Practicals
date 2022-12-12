package stringobject;

//String object Data is Constent It is con't Editable 

// There are two way to create String Object that Are
//1.String Literal
//2.New keyword

public class StringObject 
{

	public static void main(String[] args) 
	
	{
		String Name="Selva";//a String Object Created By (String Literal) Method 
		System.out.println("My Name :"+Name);
		
		String sb=new String("Selva");//a String Object By (New Keyword) Method
		System.out.println("MyName :"+sb);
	}
	

}
