package collection;

//Map Basic Operations

//1.object put() method
//2.object get() method
//3.object remove() method
//4.boolean containsKey() method
//5.boolean containsValue() method
//6.int size() method
//7.boolean isEmpty() method
import java.util.*;
public class MapBasicOperationsDemo 
{

	public static void main(String[] args) 
	{
		Map<Integer,String> sb=new HashMap<Integer,String>();
		
		
		//put() method
		sb.put(1, "Selva");
		sb.put(2, "Magi");
		sb.put(3, "Suresh");
		sb.put(4, "Gopi");
		sb.put(5, "Kanniyappan");
		
		System.out.println("***********After get() method**********");
		
		//get() method
		System.out.println(sb.get(1));
		System.out.println(sb.get(2));
		System.out.println(sb.get(3));
		System.out.println(sb.get(4));
		System.out.println(sb.get(5));
		
		System.out.println("***********After remove() method**********");
		
		//remove() method
		sb.remove(1);
		sb.remove(4);
		
		System.out.println(sb);
		
		System.out.println("*********After containsKey() method********");
		
		//containsKey() method..
		//used to the entered key is in or not in the HashMap
		System.out.println(sb.containsKey(2));
		System.out.println(sb.containsKey(5));
		System.out.println(sb.containsKey(6));
		
		System.out.println("*********After containsValue() method********");
		
		//containsValue() method..
		//used to the entered Value is in or not in the HashMap.
		//the value is in then display message is true but is not then display false.
		System.out.println(sb.containsValue("Magi"));
		System.out.println(sb.containsValue("Dinagaran"));
		
		System.out.println("*************After size() method**************");
		
		//size() method
		//it display the length of the object
		System.out.println(sb.size());
		
		System.out.println("***********After isEmpty() method**********");
		
		//isEmpty() method
		System.out.println(sb.isEmpty());

	}

}
