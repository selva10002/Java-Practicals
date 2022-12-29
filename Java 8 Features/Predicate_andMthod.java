package java_8_features;

/*				Predicate and() default method
 * 
 *    the method represent the And operator
 *    
 *    like
 *    
 *    false  and  true    == false
 *    true   and  false   == false
 *    false  and  false   == false
 *    true   and  true    == true
 *    
 *    it means it considers two condition if one condition is false then the return value also false
 *    
 *     if both condition are true then return true boolean message..
 *    
 * */



//import the java.util.function.predicate package to access the Predicate functional interface
import java.util.function.Predicate;

public class Predicate_andMthod 
{
					//main() method
	public static void main(String[] args) 
	{
		
		    //  mention  the input type  and the functional interface implements by the using of lambda expression..
		Predicate<Integer> sb=x->x*2==0;
												
		Predicate<Integer> sb2=y->y<50;
			
		//calling test() abstract method 
		System.out.println(sb.test(8));
		System.out.println(sb2.test(9));
		
		//using if Statement and() method to check condition
		if(sb.and(sb2).test(2))
		{
			System.out.println("working good");
		}
		
		
		

	}

}
