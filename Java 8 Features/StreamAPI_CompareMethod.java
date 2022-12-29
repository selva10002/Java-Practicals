package java_8_features;

/*				StreamAPI Comparator
 * 
 * comparator method used to sorted the fields in order 
 * */
import java.util.*;
import java.util.stream.Collectors;

//class
class CollageDetails
{
	private String Name;
	
	private int ID;
	
	private String Location;
	
	//parameterized constructor
	public CollageDetails(String name, int iD, String location)
	{
		super();
		Name = name;
		ID = iD;
		Location = location;
	}

    //instance method
	public String getName()
	{
		return Name;
	}

	//instance method
	public void setName(String name)
	{
		Name = name;
	}

	//instance method
	public int getID()
	{
		return ID;
	}

	//instance method
	public void setID(int iD)
	{
		ID = iD;
	}

	//instance method
	public String getLocation() 
	{
		return Location;
	}

	//instance method
	public void setLocation(String location) 
	{
		Location = location;
	}

	//override the toString() method for display the data correctly 
	@Override
	public String toString() 
	{
		return "CollageDetails [Name=" + Name + ", ID=" + ID + ", Location=" + Location + "]";
	}
	
	
	
}

public class StreamAPI_CompareMethod 
{

					//main() method
	public static void main(String[] args) 
	{
		//creating one ArrayList()
		List<CollageDetails> sb=new ArrayList<CollageDetails>();
		
		      //new keyword used to calling the constructor
		sb.add(new CollageDetails("selva",77,"Tamilnadu"));
		sb.add(new CollageDetails("magi",78,"Thelungana"));
		sb.add(new CollageDetails("kanniyappan",79,"mumbi"));
		sb.add(new CollageDetails("seenivasan",61,"deli"));
		sb.add(new CollageDetails("bubadhi",66,"karnadga"));
		
		System.out.println(sb);
		
		sb.stream().forEach(System.out::println);
		
		System.out.println("*******After sorting by name********************************************************************");
		
		//using compare method with the help of Comparator.comparing() method..
	    Comparator<CollageDetails> compare= Comparator.comparing(CollageDetails::getName);
	   
	    sb.sort(compare);
	   
	    sb.forEach(System.out::println);
	   
	   System.out.println("*********************************************************************");
	   
	   //another way to do compare process using of sorted() method
	  List<CollageDetails>list= sb.stream().sorted((o1,o2)->o1.getID()-o2.getID()).collect(Collectors.toList());

	   list.forEach(System.out::println);
	   
	   System.out.println("***************************************************************");
	   
	  List<CollageDetails>listByLocation= sb.stream().sorted((m1,m2)->m1.getLocation().compareTo(m2.getLocation())).collect(Collectors.toList());
	   
	  listByLocation.forEach(System.out::println);
	  
	}

}
