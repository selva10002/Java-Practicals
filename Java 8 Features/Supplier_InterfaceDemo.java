package java_8_features;
/*				Supplier interface 
 *
 *the interface have only return type. and it don't have input type.
 *
 *it have one abstract method name was  get() method
 *
 *there no default and static method..
 * */

import java.util.UUID;
import java.util.function.Supplier;

public class Supplier_InterfaceDemo 
{

					//main() method
	public static void main(String[] args) 
	{
		//Supplier interface with Double return type.
		Supplier<Double> sb=()->Math.random();//the Math.random() thid method used to display some random double value..
		                                      //every time it displays different value.. 
		             
				
						//using get() abstract method .it have no input type..
		System.out.println(sb.get());
		
		                     
		Supplier<String> sb2=()->UUID.randomUUID().toString();
		
		System.out.println(sb2.get());
	}

}
