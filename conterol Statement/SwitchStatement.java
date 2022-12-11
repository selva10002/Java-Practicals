package controlstatement;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		int day;
		Scanner s= new Scanner(System.in);
		System.out.println("enter a number witch day you want");
        day=s.nextInt();
        switch(day)
        {
        case 1:
        	System.out.println("sunday");
        	break;
        case 2:
        	System.out.println("monday");
        	break;
        case 3:
        	System.out.println("tusday");
        	break;
        case 4:
        	System.out.println("wednesday");
        	break;
        case 5:
        	System.out.println("thusday");
        	break;
        case 6:
        	System.out.println("friday");
        	break;
        case 7:
        	System.out.println("saterday");
        	break;
        default:
        	System.out.println("your input was wrong");
        	break;
        
        }
	}

}
