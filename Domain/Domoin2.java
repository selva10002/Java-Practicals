package basic;
import java.util.*;

public class Domoin2
{

	public static void main(String[] args)
	{
		int a,b,c;
		
		Scanner sb=new Scanner(System.in);
		
		System.out.println("Enter Number 1 :");
		a=sb.nextInt();
		
		System.out.println("Enter Number 2 :");
		b=sb.nextInt();
		System.out.println("Enter Number 3 :");
		c=sb.nextInt();
		
		sb.close();
		
		int array[]= {a,b,c};
		
		for(int z=0;z<3;z++)
		{
			for(int i=1;i<=array[z];i++)
			{   
					
				for(int x=0;x<array[z]-i;x++)
					{
						System.out.print(" ");
					}
				
				
				int j=0;
				
				while(j<i)
					{
						System.out.print(i);
						System.out.print(" ");
				
						j++;
					}
						
						System.out.println();
			}
		}
		
	}

}
