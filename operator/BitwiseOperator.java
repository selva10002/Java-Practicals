package operator;

import java.util.Scanner;

public class BitwiseOperator {

	public static void main(String[] args) 
	{
		
		int x,y;
		
		Scanner sd = new Scanner(System.in);
		
		System.out.println("Enter value of X : ");
		
		x=sd.nextInt();
		
		System.out.println("Enter value of y : ");
		
		y=sd.nextInt();
		
		System.out.println("x&y : "+(x&y));//Bitwise AND(&) Operator
		
		System.out.println("x|y : "+(x|y));//Bitwise OR(|) Operator
		
		System.out.println("x^y : "+(x^y));//Bitwise XOR(^) Operator
		
		System.out.println("~x  : "+(~x));//Bitwise Compliment(~) Operator
		
		System.out.println("~y  : "+(~y));//Bitwise Compliment(~) Operator
		

	}

}
