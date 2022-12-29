package java_8_features;

/*   the Predicate isEquals() static method
 * 
 * this method use to compare some value 
 * */

import java.util.function.Predicate;

public class Predicate_isEqualsMethod
{

					//main method
	public static void main(String[] args)
	{
		
		//Predicate interface with Integer input type
		                       //using isEqual method calling by the interface name because this is static method     
		Predicate<Integer> sb=Predicate.isEqual(25);
		
		        //enter some value..using abstract method..
		System.out.println(sb.test(25));
		
		
		
		//Predicate using String input type.. 
		Predicate<String> sb1=Predicate.isEqual("Selva");
		
		
		System.out.println(sb1.test("Selva"));
	}

}