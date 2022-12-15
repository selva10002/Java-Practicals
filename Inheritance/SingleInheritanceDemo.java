package inheritance;

// it inherits single class .that called single inheritance.

class sem1 //class one created name was sem1.

{
	int data,c,math;//instance variable
	void input()//input() method created inside of class 1.
	
	{
		data=60;
		c=50;   
		math=70;
		System.out.println("******************Semester 1*********************");
	}
	
	void output()//output() method created inside of class 1.
	
	{
		System.out.println("Mark in Data Structure :"+data);
		System.out.println("Mark in c Language :"+c);
		System.out.println("Mark in Mathemetics :"+math);
	}
}

//extends keyword used to declare sem2 is inherits sem1. 
class sem2 extends sem1 //class two created name was sem2.

{
	int cpp,se,me; //instance variable.
	void input1() //input() method created inside of class 2.

	{
		cpp=70;
		se=88;
		me=79;
		System.out.println("*******************Semester 2********************");
	}
	
	void output1() //output() method created inside of class 2.
	
	{
		System.out.println("Mark in Cpp Language :"+cpp);
		System.out.println("Mark in Software Engeeniring :"+se);
		System.out.println("Mark in Mentel Education :"+me);
	}
}

public class SingleInheritanceDemo 

{

	public static void main(String[] args) //main method.

	{
		//Calling Argument of sem2.
		sem2 sb=new sem2();
	
		sb.input();//Calling input() method in class 1.
		sb.output();
		
		sb.input1();//calling output() method in class 2.
		sb.output1();
		
		}

}
