package assignment1;

import java.util.Scanner;

//toLowerCase() used to convert String UpperCase to LowerCase.
//toUpperCase() method Used to convert String LowerCase to UpperCase 
public class LoverToUpper2 
{

	public static void main(String[] args) 
	{
		String a,b;
		Scanner sb=new Scanner(System.in);
		System.out.println("Enter a String to Convert UpperCase :");
		a=sb.next();
		System.out.println("Enter a String to Convert LowerCase :");
		b=sb.next();
		sb.close();
		
		System.out.println("LowerCase :"+a+"\nUpperCase :"+a.toUpperCase());
		System.out.println("UpperCase :"+b+"\nLowerCase :"+b.toLowerCase());

	}

}
