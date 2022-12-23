package assignment2collection;

/*Develop a java class with a method saveEvenNumbers(int N) 
using ArrayList to store even numbers from 2 to N, where N is a
integer which is passed as a parameter to the method
saveEvenNumbers().

The method should return the ArrayList (A1) created. In the
same class create a method printEvenNumbers()which iterates
through the arrayList A1 in step 1, and It should multiply
each number with 2 and display it in format 4,8,12….2*N. and
add these numbers in a new ArrayList (A2).

The new ArrayList (A2) created needs to be returned. Create a
method printEvenNumber(int N) parameter is a number N. This
method should search the arrayList (A1) for the existence of
the number ‘N’ passed. If exists it should return the Number
else return zero.Hint: Use instance variable for storing the
ArrayList A1 and A2.

NOTE: You can test the methods using a main method.
*/

import java.util.*;
class A
{
	ArrayList<Integer> A1=new ArrayList<Integer>();
	
	public void saveEvenNumber(int N)
	{
		
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				A1.add(i);
			}
		}
		
		System.out.println(A1);
	}
	
	ArrayList<Integer> A2=new ArrayList<Integer>();
	
	public void printEvenNumber() 
	{
		Iterator<Integer> iter=A1.iterator();
		System.out.println("*********************************");
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		for(int i=0;i<A1.size();i++)
		{
			A2.add((A1.get(i))*2);
		}
		System.out.println("********************************");
		System.out.println(A2);
		
		System.out.println("**********************************");
		System.out.println(A1.get(9));
	}
	
	
	public void printEvenNumber(int N)
	{
		
		System.out.println("******************************************");
		
		//System.out.println(A1);
		ArrayList<Integer> sb =new ArrayList<Integer>();
		for(int i=0;i<A1.size();i++)
		{
			if(A1.get(i)==N)
			{
				sb.add(N);
			}
			else
			{
				sb.add(null);
			}
			
		}
		int a=sb.indexOf(N);
		if(a==N)
		{
			System.out.println(N);
		}
		else
		{
			System.out.println("0.*");
		}
		
		
		
	}
}
public class Qus1 
{

	public static void main(String[] args) 
	{
		A class1=new A();
		class1.saveEvenNumber(20);
		class1.printEvenNumber();
		class1.printEvenNumber(15);
		

	}

}
