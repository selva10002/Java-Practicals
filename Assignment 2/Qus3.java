package assignment2collection;

/* Create an ArrayList which will be able to store only Strings.
Create a printAll method which will print all the elements
using an Iterator.*/

import java.util.*;
public class Qus3 
{
	ArrayList<String> sb=new ArrayList<String>();
	public void addList()
	{
		
		
		sb.add("Hello");
		sb.add("I am");
		sb.add("Tonny");
		sb.add("Well");
		sb.add("My");
		sb.add("World");
		
	
	}
	public void printAll()
	{
	
        Iterator<String> iter=sb.iterator();
		
        while(iter.hasNext())
        {
		System.out.println(iter.next());
        }

	}
	public static void main(String[] args) 
	{
		
		Qus3 sb2=new Qus3();
		sb2.addList();
		sb2.printAll();
		
	}

}
