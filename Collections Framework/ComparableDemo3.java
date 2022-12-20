package collectionframework;

import java.util.ArrayList;
import java.util.Collections;

//the comparable interface used to compare with percentage

class CollageStudent3 implements Comparable<CollageStudent3>
{
	private String name;
	private int ID;
	private double persentage;
	
	
	//create constructor by before fields..
	//and it create parameters by fields..
	public CollageStudent3(String name, int iD, double persentage) 
	{
		super();
		this.name = name;
		this.ID = iD;
		this.persentage = persentage;
	}
	

	//override the cmpareTo() method
	//this method is already in the comparable interface.
	//to check that by using cmd type at javap
	//java.long.Comparable

	@Override
	public int compareTo(CollageStudent3 o) 
	{
		
		return o.ID-this.ID;
	}
	
	
	//the toString() method used to display the object right way. 

	@Override
	public String toString()
	{
		return "CollageStudent1 [name=" + name + ", ID=" + ID + ", persentage=" + persentage + "]";
	}
}
public class ComparableDemo3 
{

	public static void main(String[] args) 
	{
		//calling the constructor with parameter
		CollageStudent3 sb=new CollageStudent3("Selva",77,79.94);
		CollageStudent3 sb1=new CollageStudent3("Seenivasan",78,89.94);
		CollageStudent3 sb2=new CollageStudent3("Kanniyappan",79,80.99);
		CollageStudent3 sb3=new CollageStudent3("Bubadhi",80,98.90);
		CollageStudent3 sb4=new CollageStudent3("Magi",81,89.09);
		
		
		//creating an ArrayList to store the fields(name,ID,percentage) objects(values).
		ArrayList<CollageStudent3> list=new ArrayList<CollageStudent3>();
		
	
		//add method to add objects at ArrayList
		list.add(sb);
		list.add(sb1);
		list.add(sb2);
		list.add(sb3);
		list.add(sb4);
		
		System.out.println(list);
		
		
		//using sort() method to order the objects
		Collections.sort(list);
		
		System.out.println("\n*****************After using of loop****************\n");
		
		//using of loop to display the object at one by one.
		for (CollageStudent3 collage:list)
		{
			System.out.println(collage);
		}

      
	
	}


}


