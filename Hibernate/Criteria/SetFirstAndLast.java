package criteriya;

/*
 * This setFirstResult() method used to mention the index of the rows to display
 * 
 * like the rows index are start with 0
 * 
 * then we set index 0 at setFistResut() method then it fetch the at starts with the index
 * 
 * 
 * like given example
 * 
 * cr is object of criteria
 * 
 * cr.setFirstResult(0);
 * 
 * it fetch the data at starting with index of 0 like we have 3 data at the table it fetch recirds like
 * 
 * index 0 row 1
 * index 1 row 2
 * index 2 row 3
 * 
 * 
 * And setLastResult() method used to how many data you want to display..
 * 
 * like
 * 
 * cr.setFirstResult(1);
 * cr.setLastResult(2);
 * 
 * index 1 row 2
 * index 2 row 3
 * 
 * */

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Employee;

public class SetFirstAndLast 
{

	public static void main(String[] args)
	{
		
		Configuration con=new Configuration();
		
		con.configure("hibernate.cfg.xml");
		
		SessionFactory fact=con.buildSessionFactory();
		
		Session session=fact.openSession();
		
		Criteria cr=session.createCriteria(Employee.class);
		
		cr.setFirstResult(1);
		cr.setMaxResults(2);
		
		List list=cr.list();
		
		for(Object obj:list)
		{
			System.out.println(obj);
		}
		
	}

}
