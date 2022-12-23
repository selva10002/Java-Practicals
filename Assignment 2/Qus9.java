package assignment2collection;

/* Develop a java class with a instance variable CountryMap HashMap (M1)
	* add a method saveCountryCapital(String CountryName, String capital) ,
	* the method should add the passed country and capital as key/value in the map M1 and return the
	Map (M1).
	Key- Country Value - Capital
	India Delhi
	Japan Tokyo

	2. Develop a method getCapital(String CountryName) which returns the capital for the country passed
	from the Map M1 created in step 1.
	
	3. Develop a method getCountry(String capitalName) which returns the country for the capital name
	passed from the Map M1 created in step 1.
	
	4. Develop a method which iterates through the map M1 and creates another map M2 with Capital as
	the key and value as Country and returns the Map M2.
	Key – Capital Value – Country
	Delhi India
	Tokyo Japan
	
	5. Develop a method which iterates through the map M1 and creates an ArrayList with all
	the Country names stored as keys. This method should return the ArrayList.
	
	NOTE: You can test the methods using a main method. */

import java.util.*;


public class Qus9 
{
	
	static HashMap<String,String> M2=new HashMap<String,String>();
	static HashMap<String,String> M1=new HashMap<String,String>();
	
	public static void saveCountryAndCapital(String CountryName,String Capital)
	{
		
		M1.put(CountryName,Capital);
		M2.put(Capital, CountryName);
		
	}
	public void getCapital()
	{
	
		for(Map.Entry<String,String> ent: M1.entrySet())
		{
		
			System.out.println(ent.getKey());
			
			
			
		
		}
	}
	
	
	public void getCountry()
	{
		for(Map.Entry<String,String> ent:M1.entrySet())
		{
			System.out.println(ent.getValue());
		}
	
	}
	
	

	public static void main(String[] args) 
	{
		Qus9 sb=new Qus9();
		Qus9.saveCountryAndCapital("India","Delhi");
		Qus9.saveCountryAndCapital("Japan","Tokyo");
		System.out.println(M1);
		
		System.out.println("\n**************************************************\n");
		
	    sb.getCapital();
	    
	    System.out.println("\n***************************************************\n");
	    
	    sb.getCountry();
	    
	    System.out.println("\n***************************************************\n");
	    
	    System.out.println(M2);
	    
	    System.out.println("\n****************************************************\n");
	    
	    ArrayList<String> arr=new ArrayList<String>();
	    
	    Set set=M1.entrySet();
	    
	    Iterator iter=set.iterator();
	    while(iter.hasNext())
	    {
	    	Map.Entry<String,String> entry=(Map.Entry) iter.next();
	    	System.out.println(entry.getKey());
	    	
	    	arr.add(entry.getKey());
	    }
	    
	    System.out.println("\n******************************************************\n");
	    
	    System.out.println(arr);
		
	}
	

}
