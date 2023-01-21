package entity;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateClause 
{

	public static void main(String[] args) 
	{
		Configuration con=new Configuration();
		
		con.configure("com/Hibernate1/hibernate.cfg.xml");
		
		SessionFactory fact=con.buildSessionFactory();
		
		
		Session session=fact.openSession();
		
		Transaction trs=session.beginTransaction();
		
		String qry="Update Student set contact='2342325424' where id=1 ";
		String qry1="From Student where id=1";
		
		Query query=session.createQuery(qry);
		Query query1=session.createQuery(qry1);
		
		int i=query.executeUpdate();
		trs.commit();
		
		if(i>0)
		{
			System.out.println("Record updated");
		     List list=query1.list();
		     
		     for(Object sb:list)
		     {
		    	 System.out.println(sb);
		     }

		}
	}

}
