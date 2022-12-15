package assignment1;

import java.util.Scanner;

//CompareTo() method used becase is Lexico comparition 
public class LexicoGrapicallyDemo1 
{

	public static void main(String[] args) 
	{
		String a,b;
		Scanner sb=new Scanner(System.in);
		System.out.println("Enter String 1 :");
		b=sb.next();
		System.out.println("Enter String 2 :");
		a=sb.next();
		sb.close();
		int d=a.compareTo(b);
		
		if(d==0)
		{
			System.out.println("the String are Same");
		}
		
		else if(d>0)
		{
			System.out.println("the String are not same,and the Defrenciate had pasitive Value :"+a.compareTo(b));
		}
		
		else
		{
			System.out.println("the String are not same ,and the deffrenciate had negative value :"+a.compareTo(b));
		}

	}

}
