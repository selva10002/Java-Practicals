package inheritance;

//Multilevel inheritance means the class ends with extends with other class 

//Example

//Sems2 extends of Sems1
//and
//Sems3 extends of Sems2

class Sems1 //class 1

{
	int math,cpp,allide;
	
	public Sems1()//constructor inside of class 1(Sems1)
	
	{
		System.out.println("sem1 constructor");
	}
	
	
	void input()
	
	{
		math=67;
		cpp=78;
		allide=100;
		System.out.println("********************Semester 1*****************");
	}
	
	void output()
	
	{
		System.out.println("Mark in Math :"+math);
		System.out.println("Mark in Cpp Language :"+cpp);
		System.out.println("Mark in  Allide :"+allide);
	}
}

class Sems2 extends Sems1 //Sem2(class 2) extends of Sems1(class 1)

{
	int computer,php,mn;
	
	public Sems2()//constructor inside of class 2(Sems2)
	
	{
		System.out.println("sem2 constructor");
	}
	
	
	void input1()
	
	{
		computer=67;
		php=78;
		mn=100;
		System.out.println("********************Semester 2*****************");
	}
	
	void output1()
	
	{
		System.out.println("Mark in Computer :"+computer);
		System.out.println("Mark in Php Language :"+php);
		System.out.println("Mark in  Multy Talent :"+mn);
	}
}

class Sems3 extends Sems2//Sems3(class3) extends of Sems2(class2)
{
	int dbms,java,sql;
	
	public Sems3()//Constructor inside of Sems3(class3)
	
	{
		System.out.println("sem 3 constructor");
	}
	
	void input2()
	
	{
		dbms=67;
		java=78;
		sql=100;
		System.out.println("********************Semester 3*****************");
	}
	
	void output2()
	
	{
		System.out.println("Mark in DBMS :"+dbms);
		System.out.println("Mark in Java Language :"+java);
		System.out.println("Mark in  Sql :"+sql);
	}
}



public class MultiLevelInheritanceDemo 
{

	public static void main(String[] args) 
	{
		//class calling methods
		Sems3 sb=new Sems3();
		
		sb.input();
		sb.output();
	
		sb.input1();
		sb.output1();
		
		sb.input2();
		sb.output2();
		
		//the constructor executed like top to bottom
		
		//like
		
		//contructor1(sems1())
		//constructor2(sems2())
		//constructor3(sems3())

	}

}
