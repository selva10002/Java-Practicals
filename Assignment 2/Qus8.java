package assignment2collection;

/* Write a program that will have a Vector which is capable of
storing emp objects. Use an Iterator and enumeration to list
all the elements of the Vector */

import java.util.*;

class Emp
{
	String a;
	

	int b;
	int c;
	
	Emp(String Name,int ID,int salary)
	{
		this.a=Name;
		this.b=ID;
		this.c=salary;
		
	}
	
	@Override
	public String toString() {
		return "Emp [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
}

public class Qus8 
{

	public static void main(String[] args) 
	
	{
		Emp sb=new Emp("Selva", 77,25000 );
		Emp sb2=new Emp("Magi", 78,30000 );
		Emp sb3=new Emp("Kanniyappan", 79,26000 );
		Emp sb4=new Emp("Seenivasan", 80,28000 );
		Emp sb5=new Emp("Bubadhi", 82,29000 );
		
		Vector v=new Vector();
		
		v.add(sb);
		v.add(sb2);
		v.add(sb3);
		v.add(sb4);
		v.add(sb5);
		
		
		Iterator iter=v.iterator();
		
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		
		
	}

}
