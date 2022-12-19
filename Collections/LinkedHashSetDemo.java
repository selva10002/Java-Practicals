package collection;
//this is all so a class of set interface
//this LinkedHashSet display the data  like what we typing order.

import java.util.*;
public class LinkedHashSetDemo 
{

	public static void main(String[] args) 
	{
		Set<String> sb=new LinkedHashSet<String>();
		
		sb.add("apple");
		sb.add("cat");
		sb.add("boll");
		sb.add("dog");
		
		sb.add(null);
		
		Iterator name=sb.iterator();
		
		while(name.hasNext())
		{
			System.out.println(name.next());
		}
		

	}

}
