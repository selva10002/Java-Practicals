package java_8_features;

/*     Function Interface apply() abstract method..
 * 
 * the function interface contains two parameters that are given below
 * 
 * 1.input type  - witch type of input we are giving
 * 2.Return type  - witch type of output we want...
 * 
 * */

import java.util.function.Function;

public class Function_applyMethodDemo 
{

	public static void main(String[] args)
	{
		
		//Function interface with two parameters
		Function<Integer,Integer> sb=a->a*2;
		
		System.out.println(sb.apply(8));
		
		//another function interface  
		Function<String,Integer>  sb1=name->name.length();
		
		System.out.println(sb1.apply("Selva"));

		//another function interface
		Function<Integer,String>  sb2=name->name.toString();
		
		System.out.println(sb2.apply(10));
	}

}
