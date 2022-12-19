package collection;

import java.util.*;

public class TreeMaopDemo 
{

	public static void main(String[] args) 
	{
		TreeMap<String,String> sb=new TreeMap<String,String>();
		
		sb.put("Name", "Selva");
		sb.put("ID", "sb");
		sb.put("Address", "Tamilnadu");
		
		System.out.println(sb);
		
		//convert to Map to set using entrySet() method
		Set set=sb.entrySet();
		
		System.out.println("\n**********After Iterator***************");
		Iterator iter=set.iterator();
		
		while(iter.hasNext())
		{
			Map.Entry entry=(Map.Entry)iter.next();
			System.out.println(entry.getKey()+"--"+entry.getValue());
		}
		
		

	}

}
