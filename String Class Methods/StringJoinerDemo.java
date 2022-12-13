package stringclassmethods;
import java.util.*;
public class StringJoinerDemo 
{

	public static void main(String[] args) 
	{
		StringJoiner sb =new StringJoiner(",");
		
		sb.add("Selva");
		sb.add("Magi");
		sb.add("kanniyappan");
		System.out.println(sb);

	}

}
