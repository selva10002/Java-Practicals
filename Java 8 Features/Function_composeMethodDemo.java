package java_8_features;

/*				Function interface compose() default method
 * 
 * the command like
 * 
 * object 1.compose(object 2)
 * 
 * that means the compose() method first execute the object 2 
 * And the get object 2 return value to set input value of object 1
 *  then compose execute the object 1.
 * */
import java.util.function.Function;

public class Function_composeMethodDemo 
{

	public static void main(String[] args)
	{

		
		System.out.println("**************sum of given number*************");
		
		//Function interface with two parameter
		Function<Integer,Integer> sum=a->a+a;
		System.out.println(sum.apply(5));
		
		System.out.println("************Multiplication of given number*************");
		
		//Function interface with two parameter
		Function<Integer,Integer> mul=b->b*b;
		System.out.println(mul.apply(5));
		
		System.out.println("*************andThen() method*****************");
		
		//using compose() method
		System.out.println(sum.compose(mul).apply(5));
		

	}

}
