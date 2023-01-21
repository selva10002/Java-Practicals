package onetomany;

import org.hibernate.Session;
import java.util.*;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyApp
{

	public static void main(String[] args)
	{
		Configuration con=new Configuration();
		
		con.configure("hibernate.cfg.xml");
		
		SessionFactory fact=con.buildSessionFactory();
		
		Session session=fact.openSession();
		
		Transaction trs=session.beginTransaction();
		
		StudentDemo1 studentObj=new StudentDemo1();
		
		studentObj.setStudentId(1);
		studentObj.setStudentName("Magi");
		studentObj.setCorse("Computer Sience");
		studentObj.setStudentlocation("TamilNadu");
		
		Subjects subjectObj=new Subjects();
		
		subjectObj.setSubjectId(1);
		subjectObj.setSubjectName("Java");
		subjectObj.setStudent(studentObj);
		
		Subjects subjectObj1=new Subjects();
		
		subjectObj1.setSubjectId(2);
		subjectObj1.setSubjectName("Data Mining");
		subjectObj1.setStudent(studentObj);
		
		Subjects subjectObj2=new Subjects();
		
		subjectObj2.setSubjectId(3);
		subjectObj2.setSubjectName("DataBase");
		subjectObj2.setStudent(studentObj);
		
		Subjects subjectObj3=new Subjects();
		
		subjectObj3.setSubjectId(4);
		subjectObj3.setSubjectName("Html");
		subjectObj3.setStudent(studentObj);
		
		List<Subjects> subjectlist=new ArrayList<Subjects>();;
		
		subjectlist.add(subjectObj);
		subjectlist.add(subjectObj1);
		subjectlist.add(subjectObj2);
		subjectlist.add(subjectObj3);
		
		
		studentObj.setSubjectlist(subjectlist);
		
	
		
		
		session.save(studentObj);
	//	session.save(subjectObj);
//		session.save(subjectObj1);
//		session.save(subjectObj2);
//		session.save(subjectObj3);
		
		trs.commit();
	}

}
