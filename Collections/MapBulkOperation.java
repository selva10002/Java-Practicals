package collection;
//Map Bulk Operations
//1.void putAll() method
//2.void clear() method

import java.util.*;
public class MapBulkOperation 
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
		
		Map<Integer,String> sb1=new HashMap<Integer,String>();
		
		//put() method
		sb1.put(7, "dinagaran");
		sb1.put(8, "purusoth");
		sb1.put(9, "jayavel");
		sb1.put(10, "bubadhi");
		
		System.out.println("**********After putAll() method*********");
		//putAll() method
		sb1.putAll(sb);
		
		System.out.println("\n"+sb1);
		
		System.out.println("\n***********After clear() method**********");
		
		//clear() method
		sb.clear();
		
		System.out.println("\n"+sb);

	}

}
