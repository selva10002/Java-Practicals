package getandload;

/*
 * The get() method used to fetch the form database table.
 * 
 *  and when we using the get() method  the record is not found it return only null.. 
 * */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Student;

public class GetMethod
{

	public static void main(String[] args)
	{
		Configuration con=new Configuration();
		
		con.configure("hibernate.cfg.xml");
		
		SessionFactory fact=con.buildSessionFactory();
		
		Session session=fact.openSession();
		
					//using get() method reference of session object
		Student student=session.get(Student.class, 1);
		
		System.out.println("the record found good");
		
		System.out.println(student);
		
		Student student1=session.get(Student.class, 4);
		
		System.out.println("record not found");
		
		System.out.println(student1);
		
		

	}

}
