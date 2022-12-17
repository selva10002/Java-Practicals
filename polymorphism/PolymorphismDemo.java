package polymorphism;

//Polymorphism means have many forms.

//like
//the class Student have Detils  method Declared many times with different parameters.

class Student

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

public class PolymorphismDemo 
{

	public static void main(String[] args) 

	{
		//in polymorphism when we want to call the method using of class name .
		Student sb=new Student();
	
		sb.Detils("Selva");//calling the (one) parameter (Detils) method
		
		sb.Detils("Govt .Collage" ,77);//calling (Two) parameter (Detils) method
		
		sb.Detils("***********Results************" ,489,477);//Calling (three) parameter (Detils) method
		
	

	}

}
