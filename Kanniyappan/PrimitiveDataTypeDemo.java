package datatype;

/*Data type
 *  
 *  1.primitive 
 *  
 *
 *  1.1 Integer           	size         					 range
 *  			byte   		- 1 byte             	-    -128 to 127    
 *  			short  		-2 byte    				-    -32768 to 32767
 *  			int    		-4 byte    				-    -2147483648 to 2147483647
 *				long   	 	-8 byte  				-    -9223372036854775808 to 9223372036854775807
 *				  
 *1.2 Float point
 *  				float    -4 byte
 *  				double   - 8 byte       
 *  
 *  
 *  1.3 character
 *  				char    - 2 byte
 *  
 *  1.4 boolean
					boolean  - 1 byte 
 * 
 * 
 * 
 * In primitive data type the following are the commonly used 
 * 
 *  int ,float,double,char,Boolean
 *  */
public class PrimitiveDataTypeDemo 
{

	public static void main(String[] args) 
	{
		
		//Integer
//		
//		byte a=1;
//		
//		short b=4;
//		
//		int c=88;
		
		
		
		
		
		float b =1;
		
		double c=2;
		
		
		
		System.out.println("Float value :"+b);
		
		System.out.println("Double value :"+c);

		
		//Character
		
		char z='f';
		
		//int boolean it stores only tow values that are 
		//1. true
		//2. false
		boolean a=true;
		
		boolean x=false;
		
		
		
		System.out.println("the values "+a+" is boolean value");
		
		System.out.println(z);

	}

}
