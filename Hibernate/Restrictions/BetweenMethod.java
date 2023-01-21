package restrictions;

/*
 * In Restriction the between() method used to fetch(display) the data between the range.. 
 * */

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import entity.Employee;

public class BetweenMethod 
{

	public static void main(String[] args) 
	{
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		
		SessionFactory fact=con.buildSessionFactory();
		Session session=fact.openSession();
		
		Criteria cr=session.createCriteria(Employee.class);
		//using between() method we mention column name and min value and max value
		cr.add(Restrictions.between("Salary",30000, 40000));
		
		List list=cr.list();
		
		for(Object obj:list)
		{
			System.out.println(obj);
		}

	}

}
