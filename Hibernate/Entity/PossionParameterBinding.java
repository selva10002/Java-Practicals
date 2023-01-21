package entity;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class PossionParameterBinding 
{

	public static void main(String[] args) 
	{
		Configuration con=new Configuration();
		
		con.configure("com/Hibernate1/hibernate.cfg.xml");
		
		SessionFactory fact=con.buildSessionFactory();
		
		Session session=fact.openSession();
		
		String qry="From Student where id=?1";
		
		Query query =session.createQuery(qry);
		
		query.setParameter(1, 1);
		
		List list=query.list();
		
		System.out.println(list);
		
		
	}

}
