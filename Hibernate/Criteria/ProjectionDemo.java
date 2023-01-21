package criteriya;

/*
 * setProjection() this method used to fetch(display) the data at particular column.. 
 * 
 * */

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import entity.Employee;

public class ProjectionDemo
{

	public static void main(String[] args)
	{
		
		Configuration con=new Configuration();
		
		con.configure("com/Hibernate1/hibernate.cfg.xml");
		
		SessionFactory fact=con.buildSessionFactory();
		
		Session session=fact.openSession();
		
		Criteria cr=session.createCriteria(Employee.class);
		
		//                         property used to set column name..
		cr.setProjection(Projections.property("Name"));
		
		List list=cr.list();
		
		for(Object obj:list)

		{
			System.out.println(obj);
		}

	}

}
