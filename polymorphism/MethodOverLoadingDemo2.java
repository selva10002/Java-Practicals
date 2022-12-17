package polymorphism;

//in polymorphism have two type of method Overloading that are

//1.Change number of parameter in Arguments
//2.Change number of Data type in parameter Arguments 

//We can Execute (Second) type

class collage
{

	public void value(int year,int year2)//the value() method one have (two) parameters(int)
	{
		System.out.println("Year of Results :"+year);
		System.out.println("Year of Results :"+year2);
	}
	
	public void value(double pers,double pers2)//the second value() method also have two parameters but different data types. 
	{
		System.out.println("**********************************");
		System.out.println("Students Totall Persentage :"+pers);
		System.out.println("Students Totall Persentage :"+pers2);
	}
}

public class MethodOverLoadingDemo2
{

	public static void main(String[] args) 
	{
		
		//polymorphism calling methods
		collage sb=new collage();

		sb.value(2010, 2020);//first value() method calling Argument, with integer values
		
		sb.value(80.12, 88.32);//second value() method calling Argument, with Double values
	}

}
