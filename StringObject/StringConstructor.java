package stringobject;

// the Constructor use to Call the Byte arrays 

public class StringConstructor 

{

	public static void main(String[] args) 
	
	{
		//creating array using Character
		char ch[]= {'s','t','r','i','n','g',' ','c','n','s','t','r','c','t','o','r'};
	
		String sb=new String(ch);//using String Constructor to convert character to String object
		
		System.out.println(sb);
	}

}
