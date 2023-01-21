package entity;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteClause
{

	public static void main(String[] args)
	{
		Configuration con=new Configuration();
		
		con.configure("com/Hibernate1/hibernate.cfg.xml");
		
		SessionFactory fact=con.buildSessionFactory();
		
		Session session=fact.openSession();
		
		Transaction trs=session.beginTransaction();
		
		String qry="Delete from Student where id=1";
		
		Query query=session.createQuery(qry);
		
		int i=query.executeUpdate();
		
		trs.commit();
		
		if(i>0)
		{
			System.out.println("Record deleted");
		}

	}

}
