package java_8_features;

/*			Predicate negate() method
 * 
 * the use to convert true to false and false to true
 * 
 * like
 * 
 * true negate  ==  false
 * false negate  == true.
 * */
import java.util.function.*;

public class Predicate_negateMethod
{

					//main() method
	public static void main(String[] args)
	{
		
		//Predicate with Integer input type..and implements with Lambda expression..
		Predicate<Integer> sb=x->x>10;
		
		System.out.println(sb.test(5));
		
		              //using negate() method..
		System.out.println(sb.negate().test(5));
		
		
		
		
		//using String input type
		
		
		
//		Predicate<String> sb1=name->name.length() == 5;
//		
//		System.out.println(sb1.test("Selva"));

	}

}
