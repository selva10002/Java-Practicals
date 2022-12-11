package controlstatement;
import java.util.*;
public class IfElseStatement 

       {

	public static void main(String[] args) 
	   {
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the marks ");
		int marks=obj.nextInt();
		if(marks<35)
		{
			System.out.println("youer not pass");

	    }
		else
		{
			System.out.println("your are passed");
		}
	   }
	

}
