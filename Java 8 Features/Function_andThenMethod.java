package java_8_features;
/*				Function interface andThen() default method..
 * 
 * the method executed like
 * 
 * object 1.andThen(object 2)
 * 
 * it mean it take the object 1 execution value 
 * then the processed the object 1 return  value convert to input value of object 2
 * 
 * */

import java.util.function.Function;

public class Function_andThenMethod 
{

					//main() method
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
		
		//using andThen() method..
		System.out.println(sum.andThen(mul).apply(5));
		
		//it first execute the sum object
		//then execute mul object with using of sum return value.
		

	}

}
