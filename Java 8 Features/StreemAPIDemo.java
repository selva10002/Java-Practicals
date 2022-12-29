package java_8_features;

/*					Stream() method
 * 
 * Stream perform bulk operations
 * 
 * this streamAPI like collection framework
 * 
 * this Stream method contains some method that are given below
 * 
 * 1.sorted()
 * 2.filter()
 * 3.map()
 * 4.collect()
 * 
 * */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreemAPIDemo
{

	public static void main(String[] args)
	{
		ArrayList<Integer> sb=new ArrayList<Integer>();
		
		sb.add(1);
		sb.add(2);
		sb.add(3);
		sb.add(4);
		sb.add(5);
		sb.add(6);
		sb.add(7);
		
		
		//this filter() method base of predicate interface so only used to conditional checking process
		sb.stream().filter(i->4<i).forEach(System.out::println);
		
		System.out.println("****************************************************");
		
		//this collect() method used to collect and store the all data ..
		List<Integer> number =sb.stream().filter(i->5<i).collect(Collectors.toList());
		
		System.out.println(number);
		
		System.out.println("***********************************************");
		
		//in this line forEach() method used to print the all value at sequence means at processing order
		sb.stream().map(a->a*4).forEach(System.out::println);
		
		System.out.println("*************************************************");
		
		//this map() method base of function interface so it have input and return value so it print some value by return type base
		List<Integer>Mul=sb.stream().map(a->a*5).collect(Collectors.toList());
		
		System.out.println(Mul);
		

	}

}
