package java_8_features;

/*Predicate is a function interface 
 * 
 *  that perform some arguments and condition checking 
 *  
 *  the predicate interface contains three default methods and one static method
 *  
 *  that are given below
 *  
 *             			Default methods
 * 
 *  1.and() method
 *  2.or() method
 *  3.negate() method
 *  
 * 						 static method
 *  
 *  1.isEquals() method
 *  */

import java.util.function.*;
public class Priticate_Demo
{

	public static void main(String[] args) 
	{
		
		//Predicate interface with Integer input type.. 
		Predicate<Integer> sb= a->a*2==0;
		
		System.out.println(sb.test(5));

	}

}
