package collection;

import java.util.*;
public class LinkedListDemo 
{

	public static void main(String[] args)
	{
		List<String> sb =new LinkedList<String>();
		
		sb.add("one");
		sb.add("two");
		sb.add("three");
		sb.add("three");
		sb.add("two");
		sb.add("one");
		sb.add("zreo");

		for(int i=0;i<sb.size();i++)
		{
			System.out.println(sb.get(i));
		}
	}

}
