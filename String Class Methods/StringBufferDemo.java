package stringclassmethods;
//in string StringBuffer() class Data can be Stored in the heap memory. it can be change able. 
// and is Synchronized
public class StringBufferDemo 
{

	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("Java Programming");
		System.out.println("Our Strinng :"+sb);
		for(int i=0;i<sb.length();i++)
		{
			System.out.println("Frequency of : "+i+" :is: "+sb.charAt(i));
		}
		
		String sb1=new String(sb.toString());
		System.out.println(sb1);
		int position=sb.indexOf("Programming");
		sb.insert(position,"object orinted");
		System.out.println("Affter inserts :"+sb);
		
		sb.setCharAt(5, '-');
		System.out.println("After modifier :"+sb);
		
		sb.append("Corse");
		System.out.println("After append :"+sb);
		
	}

}
