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
 * this program check first one  Static method 
 * */


interface Name
{
	public void NameList();
}

class Detial
{
	public static  void display()
	{
		ArrayList<String> sb=new ArrayList<String>();
		
		sb.add("Selva");
		sb.add("Magi");
		sb.add("Kanniyappan");
		sb.add("Seenivasan");
		
		System.out.println("Print Detils");
		
		System.out.println("*************************************");
		
		for(int i=0;i<sb.size();i++)
		{
			System.out.println("Name List : "+sb.get(i));
		}
	}
}
public class MethodReference_StaticMethod
{

	public static void main(String[] args)
	{
		
		//calling the static method by using class name..
		Name sb=Detial::display;
		
		//finally mention the abstract method
		sb.NameList();
	}

}
