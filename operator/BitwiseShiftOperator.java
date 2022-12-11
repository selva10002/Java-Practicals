package operator;

import java.util.Scanner;

public class BitwiseShiftOperator {

	public static void main(String[] args) 
	{
		int b,c;
		
		Scanner rs = new Scanner(System.in);
		
		System.out.println("Enter the value of b : ");
		
		b=rs.nextInt();
		
		System.out.println("\nEnter the value of c : ");
		
		c=rs.nextInt();
		
		rs.close();
		
		System.out.println("\n b<<1 : "+(b<<1));//lift Shift Operator
		
		System.out.println("\n b>>1 : "+(c>>1));//Right Shift Operator
		
		System.out.println("\n b>>>1 : "+(b>>>1));//Shift Right Zero Auto fill operator
		
		System.out.println("\n c>>>1 : "+(c>>>1));//Shift Right Zero Auto fill Operator
		
		System.out.println("***********************");
	

	}

}
