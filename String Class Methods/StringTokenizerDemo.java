package stringclassmethods;
// StringTokenizer used to separate a word by word using delimiter.
import java.util.*;
public class StringTokenizerDemo 
{

	public static void main(String[] args)
	{
		System.out.println("******************************************");
		StringTokenizer sb=new StringTokenizer("hello world i am Selva"," ");
		System.out.println(sb.hasMoreTokens());
		while(sb.hasMoreTokens())
		{
		System.out.println(sb.nextToken());
		}
		System.out.println("*******************************************");
		StringTokenizer sb1=new StringTokenizer("hello;world;i;am;Selva",";");
		while(sb1.hasMoreTokens())
		{
		System.out.println(sb1.nextToken());
		}
		
		System.out.println("********************************************");
																	//delimiter  flag
		StringTokenizer sb2=new StringTokenizer("hello world i am Selva"," ",    true);
		while(sb2.hasMoreTokens())
		{
		System.out.println(sb2.nextToken());
		}
	}
	

}
