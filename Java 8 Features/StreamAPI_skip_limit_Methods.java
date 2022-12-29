package java_8_features;

import java.util.*;

/*				StreamAPI skip() and limit() method
 * 
 * skip() -- this method use to skip some value
 * 
 * limit()  -- this method used to set limit how much value to print
 * 
 * like
 * 
 *  1,3,5,8,4,9,6,9
 *  
 *  skip(2)
 *  
 *  print 5,8,4,9,6,9
 *  
 *  limit(4)
 *  
 *  print 1,3,5,8
 *  
 *  
 * */
public class StreamAPI_skip_limit_Methods 
{

	public static void main(String[] args)
	{
		List<Integer> sb=Arrays.asList(1,3,5,8,4,9,6,9);
		
		
		
		
		System.out.println("_________________After skip() method_______________");
		
		sb.stream().skip(2).forEach(System.out::println);
		
		System.out.println("_________________After limit() method_______________");
		
		sb.stream().limit(4).forEach(System.out::println);
		
		System.out.println("_________________After skip() and limit() method_______________");
		
		sb.stream().skip(2).limit(4).forEach(System.out::println);
		
		System.out.println("_________________After limit() and skip() method_______________");
		
		sb.stream().limit(4).skip(2).forEach(System.out::println);
		

	}

}
