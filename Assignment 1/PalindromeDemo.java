package assignment1;

import java.util.Scanner;

public class PalindromeDemo 
{

	public static void main(String[] args) 
	{
			    
		String s;
		Scanner sb=new Scanner(System.in);
		System.out.println("Enter a String :");
		s=sb.next();
		sb.close();
		
		int count=0,a=s.length();
		
		
		int i=0;
		int j=a-1;
		while(i<a || j+1>0)
		{
    	
			if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
				
			i++;
			j--;
			
		}
		
		if(count==a)
		{
			System.out.println("is palindrome");
		}
		
		else
		{
			System.out.println("is not palindrome");
		}
		
		//System.out.println(a);
		
	}

}
