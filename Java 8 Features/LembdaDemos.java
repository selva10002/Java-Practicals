package java_8_features;

/*  							Lambda Expression
 * 
 * Defines anonymous Function
 * that means no modifier,no return type,no method name..
 * 
 * Lambda Expression use to declare less code
 * 
 *  Lambda Expression only used in the Functional Interface
 *   */

//functional interface because it have only one abstract method
interface Calculation
{
	
	//abstract method
	public void sum();
	
}

public class LembdaDemos 
{
					//main() method
	public static void main(String[] args) 
	{
		
		             //Lambda expression
		Calculation sb=()->{int a=7,b=7;
		int c=a+b;
		
		System.out.println("sum of a and b :"+c);
		
		};
		
		//calling the abstract method
		sb.sum();

	}

}
