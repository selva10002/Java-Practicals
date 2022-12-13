package stringclassmethods;

// in string CompareOperator(==) used to compare the String Values At the Same memory location that's same print will true not same print false.

public class CompareOperatorDemo 

{

	public static void main(String[] args) 
	{
		String Name="Selva";//in pool memory
		
		String Name1="Selva";//in pool memory
		
		String sb=new String("Magi");//in heap memory
		
		String sb1=new String("Magi");//inn heap memory
		
		System.out.println(Name==Name1);; 
		
		System.out.println(sb==sb1);

	}

}
