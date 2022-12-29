package java_8_features;

import java.util.ArrayList;

/*  					Method Reference
 * 
 *  method reference only use in the functional interfaces..  
 *  
 *  we can refer a method using of (::) operator
 *  
 *   Method reference used to Refer an method arguments to abstract method of an interface
 *   
 *   like 
 *   
 *   we don't want implement an abstract method i want another method arguments in my abstract method .so we use reference method
 *   
 *   		this topic we refer three type of methods that are given below
 * 
 * 1.Static method 
 * 2.Instance method
 * 3.Constructors
 * 
 * 
 * this program check Third one  Constructors 
 * */


//interface name with Name2
interface Name2
{
	//abstract method
	public void NameList();
}

//class
class DetialShow
{
	//constructor
	public  DetialShow()
	{
		//simple ArrayList it stores some names
		ArrayList<String> sb=new ArrayList<String>();
		
		sb.add("Selva");
		sb.add("Magi");
		sb.add("Kanniyappan");
		sb.add("Seenivasan");
		
		System.out.println("Print Detils");
		
		System.out.println("*************************************");
		
		//simple for loop
		for(int i=0;i<sb.size();i++)
		{
			System.out.println("Name List : "+sb.get(i));
		}
	}
	
	
//	public  DetialShow(String name)
//	{
//		//simple ArrayList it stores some names
//		ArrayList<String> sb=new ArrayList<String>();
////		
////		sb.add("Selva");
////		sb.add("Magi");
////		sb.add("Kanniyappan");
////		sb.add("Seenivasan");
//		
//		sb.add(name);
//		
//		System.out.println("Print Detils");
//		
//		System.out.println("*************************************");
//		
//		//simple for loop
//		for(int i=0;i<sb.size();i++)
//		{
//			System.out.println("Name List : "+sb.get(i));
//		}
//	}
}
public class MethodReference_Constructor
{

					//main() method
	public static void main(String[] args)
	{
		//calling the constructor using new keyword.. 
		Name2 sb=DetialShow::new;
		
		//finally mention the abstract method. 
		sb.NameList();
	

	}

}
