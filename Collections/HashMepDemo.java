package collection;

//Map is interface Map have two parameters that are (key) and (values)
//Map don't allowed duplicates keys,but it accept the duplicate values.
//the Map key Store only one value.

import java.util.*;

public class HashMepDemo 
{

	public static void main(String[] args) 
	{
		
		//Creating HashMap with String key and Integer value
		//String and Integer are classes
		Map<String,Integer> sb=new HashMap<String,Integer>();
		
		//using put() method to add value in the HashMap.
		sb.put("Selva", 20);
		sb.put("magi", 21);
		sb.put("tamilselvan", 21);
		sb.put("kanniyappan", 21);
		
		//print the all objects using HashMap variable (sb).
		System.out.println(sb);
		
		System.out.println("*******After get() method*************");
		
		//After get()method ..this method used to get an value using key
		System.out.println(sb.get("Selva"));
		
		
		System.out.println("**************After Iterator method**************");
		
		//we not able to use iterator at Map ,
		//so first  we convert the segment Map to Set Using Below method  
		Set set=sb.entrySet();
		
		//then we use the Iterator() method
		Iterator iter=set.iterator();
		
		while(iter.hasNext())
		
		{
			System.out.println(iter.next());
		}
		
		System.out.println("**************After Map.Entry() method***********");
		
		//we can use iterator at every variable usage.
		Iterator iter1=set.iterator();
		
		//Map.Entry() Method
		while(iter1.hasNext())
		
		{
			Map.Entry entry=(Map.Entry)iter1.next();
			System.out.println(entry.getKey()+"--"+entry.getValue());
		}

	}

}
