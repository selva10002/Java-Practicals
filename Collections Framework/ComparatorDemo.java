package collectionframework;

//Comparator used to compare the fields and order the elements
//using compareTo() method with two fields
import java.util.*;

class Company 
{
	String name;
	int rating;
	int year;
	
	//create constructor by given fields
	public Company(String name, int rating, int year) 
	{
		super();
		this.name = name;
		this.rating = rating;
		this.year = year;
	}
	
	//use to display the object at right way..  
	@Override
	public String toString() 
	{
		return "Company [name=" + name + ", rating=" + rating + ", year=" + year + "]";
	}
	
}

 class SortedByRating implements Comparator<Company>
	{

	
	//override the compare() method at Comparator interface
		@Override
		public int compare(Company o1, Company o2) 
		{
		
			return o1.rating-o2.rating;
		}
	
	
	

	}
	
	


public class ComparatorDemo 
{

	public static void main(String[] args) 
	{
		Company sb=new Company("capgemini",4,2005);
		Company sb1=new Company("apple",7,2000);
		Company sb2=new Company("samsung",6,1990);
		Company sb3=new Company("nokiya",9,1980);
		
		ArrayList<Company> list=new ArrayList<Company>();
		
		list.add(sb);
		list.add(sb1);
		list.add(sb2);
		list.add(sb3);
		
		System.out.println(list);
		
		System.out.println("\n******************After sort() method*****************\n");
		
		//SortedByRating rating=new SortedByRating();
		Collections.sort(list,new SortedByRating());
		
		for(Company c:list)
		{
			System.out.println(c);
		}
		

	}

}

