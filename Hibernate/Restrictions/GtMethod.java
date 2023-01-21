package restrictions;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import entity.Employee;

public class GtMethod 
{

	public static void main(String[] args)
	{
		Configuration con=new Configuration();
		
		con.configure("com/Hibernate1/hibernate.cfg.xml");
		
		SessionFactory fact=con.buildSessionFactory();
		
		Session session=fact.openSession();
		
		Criteria cr=session.createCriteria(Employee.class);
		
						//gt- grater then
		cr.add(Restrictions.gt("Salary", 20000));
		
		List list=cr.list();
		
		for(Object obj:list)
		{
			System.out.println(obj);
		}

	}

}
