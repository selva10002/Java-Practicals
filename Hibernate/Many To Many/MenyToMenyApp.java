package manytomany;

import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MenyToMenyApp
{

	public static void main(String[] args)
	{
		Configuration con=new Configuration();
		con.configure("hibernate.cfg.xml");
		
		SessionFactory fact=con.buildSessionFactory();
		Session session=fact.openSession();
		
		Transaction trs=session.beginTransaction();
		
		Canditate canditateObj=new Canditate();
		
		canditateObj.setCanditateId(101);
		canditateObj.setCanditateName("Magi");
		canditateObj.setCanditateFatherName("ABC");
		canditateObj.setCanditateLocation("TamilNadu");
		
		Canditate canditateObj1=new Canditate();
		
		canditateObj1.setCanditateId(102);
		canditateObj1.setCanditateName("Kanniyappan");
		canditateObj1.setCanditateFatherName("DCD");
		canditateObj1.setCanditateLocation("TamilNadu");


		Canditate canditateObj2=new Canditate();
		
		canditateObj2.setCanditateId(103);
		canditateObj2.setCanditateName("Seenivasan");
		canditateObj2.setCanditateFatherName("FGH");
		canditateObj2.setCanditateLocation("TamilNadu");
		
		List<Canditate> canditateList=new ArrayList<Canditate>();

		canditateList.add(canditateObj);
		canditateList.add(canditateObj1);
		canditateList.add(canditateObj2);
		
		Interview interviewObj=new Interview();
		
		interviewObj.setInterviewId(1);
		interviewObj.setCompanyName("Google");
		interviewObj.setInterviewDate("10-02-2023");
		interviewObj.setJobName("Software");
		interviewObj.setCanditateList(canditateList);
		
		Interview interviewObj1=new Interview();
		
		interviewObj1.setInterviewId(2);
		interviewObj1.setCompanyName("MicroSoft");
		interviewObj1.setInterviewDate("10-03-2023");
		interviewObj1.setJobName("BackEnd");
		interviewObj1.setCanditateList(canditateList);

		Interview interviewObj2=new Interview();
		
		interviewObj2.setInterviewId(3);
		interviewObj2.setCompanyName("Gapgimini");
		interviewObj2.setInterviewDate("10-04-2023");
		interviewObj2.setJobName("Frount End");
		interviewObj2.setCanditateList(canditateList);
		
		List<Interview> interviewList=new ArrayList<Interview>();
		interviewList.add(interviewObj);
		interviewList.add(interviewObj1);
		interviewList.add(interviewObj2);
		
		
		canditateObj.setInterviewList(interviewList);
		canditateObj1.setInterviewList(interviewList);
		canditateObj.setInterviewList(interviewList);
		
		session.save(canditateObj);
		session.save(canditateObj1);
		session.save(canditateObj2);
		
		trs.commit();
		
	}

}
