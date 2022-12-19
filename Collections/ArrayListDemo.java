package collection;

//ArrayList is a class of List interface
//the List interface if support duplicates.

import java.util.*;
public class ArrayListDemo 
{

	public static void main(String[] args) 
	{
		ArrayList<String> sb=new ArrayList<String>();
		

		sb.add("selva");
		sb.add("magi");
		sb.add("bubadhi");
		sb.add("kanniyappan");

		System.out.println(sb.get(0));
		System.out.println(sb.get(1));
		System.out.println(sb.get(2));
		System.out.println(sb.get(3));
		
	}

}
