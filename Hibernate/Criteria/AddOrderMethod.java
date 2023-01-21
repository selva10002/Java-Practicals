package criteriya;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;

import entity.Employee;

public class AddOrderMethod
{

	public static void main(String[] args)
	{
		Configuration con=new Configuration();
		
		con.configure("com/Hibernate1/hibernate.cfg.xml");
		
		SessionFactory fact=con.buildSessionFactory();
		
		Session session=fact.openSession();
		
		Criteria cr=session.createCriteria(Employee.class);
		
		
		System.out.println("By ascending order");
		cr.addOrder(Order.asc("Name"));

		List list=cr.list();
		
		
		for(Object obj:list)
		{
		
			System.out.println(obj);
		
		}
		System.out.println("By descendening Order");
		
		cr.addOrder(Order.desc("Name"));
		
		List list1=cr.list();
		for(Object obj2:list1)
		{
			
			System.out.println(obj2);
		
		}
	}

}
