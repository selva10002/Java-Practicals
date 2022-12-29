package java_8_features;
/*			sorted() method
 * 
 * the sorted() method used to arrange the values in order
 * like example
 * 
 * 1,3,2,5,4,7,6,8,9
 * 
 * after sorting
 * 
 * 1,2,3,4,5,6,7,8,9
 *  
 * */
import java.util.*;

public class StreamAPI_sortMethod
{

	public static void main(String[] args)
	{
		//creating an ArrayList()
		List<Integer> sb=Arrays.asList(11,10,3,4,5,6,7,8,9);
		
		System.out.println(sb);
		
		System.out.println("________After sorting________");
		
		//using sorted() method
		sb.stream().sorted().forEach(System.out::println);
		
	
		

	}

}
