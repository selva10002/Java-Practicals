package entity;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AsClause 
{

	public static void main(String[] args) 
	{
		Configuration con=new Configuration();
		
		con.configure("com/Hibernate1/hibernate.cfg.xml");
		
		SessionFactory fact=con.buildSessionFactory();
		
		Session session=fact.openSession();
		
		Transaction trs=session.beginTransaction();
		
		String qry="From Student As s where s.id=2";
		
		Query query=session.createQuery(qry);

		//int i=query.executeUpdate();
		
		List list=query.list();
		
		for(Object sb:list)
		{
			System.out.println(sb);
		}
		
		
	}

}
