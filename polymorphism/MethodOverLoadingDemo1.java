package polymorphism;
//in polymorphism have two type of method Overloading that are
//1.Change number of parameter in Arguments
//2.Change number of Data type in parameter Arguments 

//We can Execute (first) type
class Student1

{
	public void Detils(String name)//Detils method with single parameter

	{
		System.out.println("Student Name:"+name);
	}
	
	public void Detils(String Collage,int id)//Same method with (two) parameter
	
	{
		System.out.println("Student ID :"+id);
		System.out.println("Collage Name :"+Collage);
	}
	
	public void Detils(String mark,int s1,int s2)//Same method with (three) parameter
	
	{
		System.out.println(mark);
		System.out.println("Totall Marks in Semester 5 :"+s1);
		System.out.println("Totall Marks in Semester 6 :"+s2);
	}
}
public class MethodOverLoadingDemo1 
{

	public static void main(String[] args) 
	{
		Student1 sb =new Student1();
		sb.Detils("Selva");
		sb.Detils("Govt.Collage" , 77);
		sb.Detils("*****************Result*****************" ,488,489);
		

	}

}
