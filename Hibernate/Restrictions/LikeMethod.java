package restrictions;

/*
 * this like() method used to sort the data by first letter or last letter
 * 
 * like using of column name and like command this command is given below
 * 
 * cr.add(Restrictions.like(property,object)
 * 
 * object like  %a  -- this means sort the data by end with letter of  a  
 * 
 * 				a%  --this means sort the data by start with letter of a
 * */

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import entity.Employee;

public class LikeMethod 
{

	public static void main(String[] args) 
	{
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		
		SessionFactory fact=con.buildSessionFactory();
		Session session=fact.openSession();
		
		Criteria cr=session.createCriteria(Employee.class);
		
						//like() method we mention property name and like command we using in Mysql Database 
		cr.add(Restrictions.like("Name", "m%"));
		
		List list=cr.list();
		
		for(Object obj:list)
		{
			System.out.println(obj);
		}

	}

}
