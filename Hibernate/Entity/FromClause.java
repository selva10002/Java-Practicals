package entity;


import java.util.List;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
;

public class FromClause
{
	

	public static void main(String[] args)
	{
		Configuration con=new Configuration();
		
		con.configure("com/Hibernate1/hibernate.cfg.xml");
		
		SessionFactory fact=con.buildSessionFactory();
		
		Session session=fact.openSession();
		
		String qry="From Student";
		
		Query query=session.createQuery(qry);
		
		List list=query.list();
		
		for(Object sb:list)
		{
			System.out.println(sb);
		}
		
	}

}
