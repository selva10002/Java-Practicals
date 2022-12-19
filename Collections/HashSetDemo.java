package collection;
//HashSet is class in the interface of Set.
//Set used only unique value
//it store data randomly .
//Set interface not Access the duplicates

import java.util.*;

public class HashSetDemo 
{

	public static void main(String[] args) 
	{
  //interface  and  class
		Set sb=new HashSet();
		
		//use add keyword to add values
		sb.add("selva");
		sb.add("magi");
		sb.add("kanniyappan");
		sb.add("dinagaran");
		sb.add(null);
		
		//use contains key word to check the object in or not
		System.out.println(sb.contains("selva"));
		//Iterator used to 
		
		Iterator name= sb.iterator();
		
		while(name.hasNext())
		{
			System.out.println(name.next());
		}

	}

}
