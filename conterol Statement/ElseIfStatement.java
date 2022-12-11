package controlstatement;

import java.util.Scanner;

public class ElseIfStatement {

	public static void main(String[] args) 
	{
		int day;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number to show date ");
		day=s.nextInt();
		if(day==0)
		{
			System.out.println("day of sunday");
		}
		else if(day==1)
		{
			System.out.println("day of mounday");
			
		}
		
		else if(day==2)
		{
			System.out.println("day of tusday");
			
		}
		
		else if(day==3)
		{
			System.out.println("day of thusday");
			
		}
		
		else if(day==4)
		{
			System.out.println("day of friday");
			
		}
		else if(day==5)
		{
			System.out.println("day of saterday");
			
		}
		else
		{
			System.out.println("your input was wrong");

		}

	}

}
