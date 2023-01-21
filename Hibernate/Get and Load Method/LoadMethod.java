package getandload;

/*
 * we also used the load() method fetch the data from database table..
 * 
 * and when we using the load() method the record is not found in the table 
 * then it throw the exception
 * */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Student;

public class LoadMethod
{

	public static void main(String[] args) 
	{
		Configuration con=new Configuration();
		
		con.configure("com/Hibernate1/hibernate.cfg.xml");
		
		SessionFactory fact=con.buildSessionFactory();
		
		Session session=fact.openSession();
		
		           //using load() method reference of session object 
		Student student =session.load(Student.class, 1);
		
		System.out.println("records founds good");
		
		System.out.println(student);
		
		
		Student student2=session.load(Student.class, 4);
		
		System.out.println("record is not found");
		
		System.out.println(student2);

	}

}
