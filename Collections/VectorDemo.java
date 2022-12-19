package collection;
import java.util.*; 
public class VectorDemo 
{

	public static void main(String[] args) 
	{
		List<String> sb=new Vector<String>();
		
		//using add keyword
		sb.add("selva");
		sb.add("magi");
		sb.add("welcome");
		sb.add("to");
		sb.add("home");
		
		//using remove keyword
		sb.remove(0);
		
		for(int i=0;i<sb.size();i++)
		{
			System.out.println(sb.get(i));
		}
	 
	}

}
