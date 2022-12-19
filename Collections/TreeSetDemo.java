package collection;

// TreeSet is class of Set Interface.
//it Display the data is the Ascending order.
import java.util.*;
public class TreeSetDemo
{

	public static void main(String[] args)
	{
		//we set it the String data type of TreeSet class. 
		Set<String> sb=new TreeSet();
		
		sb.add("selva");
		sb.add("suresh");
		sb.add("gopi");
		sb.add("magi");
		
		//TreeSet not Accept null .
		//sb.add(null);
		
		Iterator<String> name=sb.iterator();
		while(name.hasNext())
		{
			System.out.println(name.next());
		}
		
				

	}

}
