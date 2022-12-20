package collectionframework;

//Comparable interface used to compare with ID.
//comparable interface used to oder the elements by using compareTo() method. 
//like an Example
//i use the CollageStudent1 class 
//the use the different fields that are
//1.name
//2.ID
//3.percentage

//use compare to method to arrange the order by which we want. and one parameter.
import java.util.*;

//create class CollageStudent1 and implements the comparable interface to use compareTo method.

class CollageStudent1 implements Comparable<CollageStudent1>
{
	private String name;
	private int ID;
	private double persentage;
	
	
	//create constructor by before fields..
	//and it create parameters by fields..
	public CollageStudent1(String name, int iD, double persentage) 
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
	public int compareTo(CollageStudent1 o) 
	{
		
		return o.ID-this.ID;
	}
	
	
	//the toString() method used to display the object right way. 

	@Override
	public String toString() {
		return "CollageStudent1 [name=" + name + ", ID=" + ID + ", persentage=" + persentage + "]";
	}
	
		
}


public class ComparableDemo 
{

	public static void main(String[] args) //main method
	
	{
		//calling the constructor with parameter
		CollageStudent1 sb=new CollageStudent1("Selva",77,79.94);
		CollageStudent1 sb1=new CollageStudent1("Seenivasan",78,89.94);
		CollageStudent1 sb2=new CollageStudent1("Kanniyappan",79,80.99);
		CollageStudent1 sb3=new CollageStudent1("Bubadhi",80,98.90);
		CollageStudent1 sb4=new CollageStudent1("Magi",81,89.09);
		
		
		//creating an ArrayList to store the fields(name,ID,percentage) objects(values).
		ArrayList<CollageStudent1> list=new ArrayList<CollageStudent1>();
		
	
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
		for (CollageStudent1 collage:list)
		{
			System.out.println(collage);
		}
	}

}
