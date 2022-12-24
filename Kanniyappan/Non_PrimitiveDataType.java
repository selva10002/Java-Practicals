package datatype;



/*Non-primitive data types are three types (there )
 * 
 * the String And Array is classes
 * 
 * 1.String
 *  
 *  Syntax
 *  
 *  Data type Variable = value
 *  
 *  1 way
 *  String a="Kanniyappan";
 *  
 *  2 way
 *  
 *  Data Type Variable;
 *  
 *  Variable=value;
 *  
 *  String c;
 * 
 *  
 *  c="Kanniyappan";
 * 				  
 * 
 * 
 * 
 * 2.Array[]
 * 
 * Data type Variable[]={value};
 * 
 * example
 * 
 *    int number[]={1,2,3,4,5};
 * 
 * 
 * 
 *       
 * 
 * 3.UserDefine Data types
 *  
 *  * */
public class Non_PrimitiveDataType 
{

	public static void main(String[] args)
	{
		
		//non primitive data type
		
		
		//String data type Stores sequence of letter . within Double codes " "..
		//1 st Way
		String a="my ,name ,Kanniyappan";
		
		//2 nd way
		
		String b;
		
		b="Selva";
		
		
		System.out.println(a);
		
		System.out.println(b);
		
		
		//Array[] data type Store More Data within order..  
		
		//the important rule of Array[] is once the Array is declared the values of array is not be involved in increased and Decreased process 
		
		/*example
		 * 
		 * String name[]={"Kanniyappan","Selva","Seenivasan","dinagara"};
		 * 
		 * name[0]=Kanniyappan
		 * name[1]=Selva
		 * name[2]=Seenivasan
		 * name[3]=dinagaran
		 * 
		 * 
		 * 
		 * */
		
		int Numbers[]= {1,2,4,5,6};
		
		//Numbers[0]=1
		//Numbers[1]=2
		//Numbers[2]=4
		//Numbers[3]=5
		//Numbers[4]=6
		
		float points[]= {1,2,3,4,5};
		
		
		char letters[]= {'k','n','n','i','y','a','p','p','a','n'};
		
		//letters[0]=k
		
		String name[]= {"Kanniyappan","Selva","Seenivasan","dinagara"};	
		
		
		System.out.println("String Values :"+a);
		
		System.out.println("Array int  numbers :"+Numbers[2]);
		
		System.out.println("Array float points :"+points[4]);
		
		System.out.println("Array char letters :"+letters[4]);
		
		System.out.println("Array String name :"+name[2]);
		}

}
