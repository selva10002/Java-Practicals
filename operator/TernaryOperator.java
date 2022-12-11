package operator;

import java.util.Scanner;

// Ternary Operator or Conditional Operator it also simplified if Statement 
public class TernaryOperator {

	public static void main(String[] args)
	{
	    int x; 
	    Scanner s = new Scanner(System.in);
	    
	    System.out.println("enter your marks : ");
	    
	    x=s.nextInt();
	    
	    String status=(x>35)?"Pass":"Fail";//Ternary Operator
	    
	    System.out.println( "Ststus  :  " +status);
	    
	    if(x>35)
	    
	    {
	    
	    	System.out.println("\nCongratulations for your Success");
	    	
	     }
	     
	    else
	    
	    {
	    
	    	System.out.println("\nDont Wory About it Try it Again Success will come");
	     
	    }
	    
	    System.out.println("\n\n*****************************************");
	}
	

}
