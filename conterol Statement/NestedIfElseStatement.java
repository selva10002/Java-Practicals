package controlstatement;
import java.util.*;
public class NestedIfElseStatement {

	public static void main(String[] args) {
		int a,b,c;
		int max=0;
		Scanner s=new Scanner(System.in);
		System.out.println("value of a :");
		a=s.nextInt();
		System.out.println("value of b :");
		b=s.nextInt();
		System.out.println("value of c :");
		c=s.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				max=a;
				System.out.println("value of Max:"+max);
			}
			else
			{
				max=c;
				System.out.println("value of max:"+max);
			}
		}
		else
		{
			if(b>c)
			{
				max=b;
				System.out.println("value of max:"+max);
			}
			else
			{
				max=c;
				System.out.println("value of max:"+max);
			}
		}
		

	}

}
