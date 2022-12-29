package java_8_features;

/*					Consumer Interface
 * 
 * it have only input type no return type.
 * 
 * and is dos't accept the System.out.println() argument 
 * at inside of using accept() abstract method that time only..
 * 
 * 
 * And it contains one abstract method   ---  accept()
 * 
 * And it contains one Default method  --- andThen()
 * 
 * 
 * 				andThen() default method
 * 
 * 		Syntax
 * 
 *	 object 1.andThen(object 2)
 * 
 * it means it first execute the object 1 
 * 
 * next execute the object 2 .the object 2 input value is the executing value of object 1. 
 * */

import java.util.function.Consumer;

public class Consumer_interfaceDemo
{

					//main() method
	public static void main(String[] args) 
	{
		
		//Consumer interface with Integer input type.
		Consumer<Integer> sb=a->System.out.println(a);
		
		sb.accept(1);
		

		//Consumer interface with String input type 
		Consumer<String> name=a->System.out.println(a.hashCode());
		
		name.accept("Selva");
		
		//Consumer interface with String input type 
		Consumer<String> name1=a->System.out.println(a.toUpperCase());
		
		name1.accept("Selva");
		
		
		//Consumer interface with String input type 
		Consumer<String> name2=a->System.out.println(a.toLowerCase());
		
		name2.accept("Selva");
		
		
		//using andThen() method
		name2.andThen(name1).accept("Selva");
		
	}
}
