package assignment2collection;

//Implement the assignment 1 using Linked List

import java.util.*;
class A2
{
	LinkedList<Integer> A1=new LinkedList<Integer>();
	
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
	
	LinkedList<Integer> A2=new LinkedList<Integer>();
	
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
		LinkedList<Integer> sb =new LinkedList<Integer>();
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
public class Qus7
{

	public static void main(String[] args)
	{
		A2 class1=new A2();
		class1.saveEvenNumber(20);
		class1.printEvenNumber();
		class1.printEvenNumber(15);
		
		
	}

}
