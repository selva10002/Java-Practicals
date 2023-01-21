package entity;

/*
 * Named Parameter binding
 * 
 * this is used to we put the data at run time by using of name
 * */
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class NamedParameterBinding
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		Configuration con=new Configuration();

		con.configure("com/Hibernate1/hibernate.cfg.xml");
		
		SessionFactory fact=con.buildSessionFactory();
		
		Session session=fact.openSession();
		
		Transaction trs=session.beginTransaction();
	
										//:name this is named parameter	
		String qry="Update Student set name=:name where id=:id";
														//:id named parameter
		
										//:id named parameter
		String qry2="From Student where id=:id";
		
		
		//this method used to createQuery to perform the operation
		Query query=session.createQuery(qry); 
		Query query2=session.createQuery(qry2);
		
		System.out.println("Enter new Name");
		String name=sc.nextLine();
		
		query.setParameter("name",name);
		System.out.println("Enter your ID");
		int id=sc.nextInt();
		
		//setParameter() used to set the data
		query.setParameter("id",id);
		
	    int i=query.executeUpdate();
	    
	    trs.commit();
	    
	    query2.setParameter("id", id);
	    
	    //list use to convert the object to list
	    List list=query2.list();
	    if(i>0)
	    {
	    System.out.println("Record Successsfuly updated");
	    
	    //Display the data by list
	    System.out.println(list);
	    }
	    
		
	}

}
