package java_8_features;

/*          Predicate or() default method
 * 
 *     the method represent the or operator
 *     
 *     like
 *     
 *     true   or   false   ==  true
 *     false  or   true    ==  true
 *     true   or   true    ==  true
 *     false  or   false   ==  false
 *     
 *     it means the predicate or() method check the condition with two values
 *     
 *     if the two values any one value is true the return type true 
 *     
 *     if both condition was false the return type also false
 *     
 *     
 * */
import java.util.function.*;

public class Predicate_orMethod 
{

					//main() method...
	public static void main(String[] args)
	{
		           //first condition..  
		 Predicate<Integer> sb= a->a%2==0;
		 
		 System.out.println(" sb "+sb.test(6));
		           //second condition...
		 Predicate<Integer> sb1=b->b>5;
		 
		 System.out.println(" sb2 "+sb1.test(6));
		 
		
		 
		 				//using or() method to check both conditions.. 
		 System.out.println(sb.or(sb1).test(7));

	}

}
