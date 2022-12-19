package collection;
//Hashtree is Synchronized.
import java.util.*;
public class MapHashTableDemo 
{

	public static void main(String[] args) 
	{
		Hashtable<String,String> sb=new Hashtable<String,String>(); 
		

		sb.put("Name", "Selva");
		sb.put("ID", "sb");
		sb.put("Address", "Tamilnadu");
		
		System.out.println(sb);

	}

}
