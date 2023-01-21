package projectionmethods;

import java.util.*;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

import entity.Employee;

public class AverageMethod 
{
	public static void main(String[] args)
	{
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		
		SessionFactory fact=con.buildSessionFactory();
		Session session=fact.openSession();
		
		Criteria cr=session.createCriteria(Employee.class);
		
		cr.setProjection(Projections.avg("Salary"));
		
		List list=cr.list();
		
		System.out.println("Average of Salary : "+list.get(0));
		
	}

}
