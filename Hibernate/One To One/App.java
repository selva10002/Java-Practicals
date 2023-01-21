package onetoone;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App
{
	

	public static void main(String[] args)
	{
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		
		SessionFactory fact=con.buildSessionFactory();
		Session session=fact.openSession();
		
		Transaction trs=session.beginTransaction();
		
		Person personobj=new Person();
		
		personobj.seteMail("suresh@gmail.com");
		personobj.setPersonFatherName("Abc");
		personobj.setPersonId(1);
		personobj.setPersonName("Suresh");
		
		
		PanCard panobj=new PanCard();
		
		panobj.setPanID(101);
		panobj.setPanNumber("234567890875");
		
		panobj.setPerson(personobj);
		
		personobj.setPancard(panobj);

		session.save(personobj);
		session.save(panobj);
		
		trs.commit();
	}

}
