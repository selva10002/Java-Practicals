package entity;

import javax.persistence.*;
import javax.persistence.Id;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


@Entity
public class StudentDemo
{
	@Id
	private int ID;
	@Column(length=20,nullable=false)
	private String name;
	@Column(length=30,nullable=false)
	private String collage;
	
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getCollage() {
		return collage;
	}

	public void setCollage(String collage) {
		this.collage = collage;
	}




	@Override
	public String toString() {
		return "StudentDemo [ID=" + ID + ", name=" + name + ", collage=" + collage + "]";
	}

	public static void main(String[] args)
	{
		
		/*
		 * Configuration is class it is used to make connection with database
		 * and define driver and mapping classes.. 
		 * */
		Configuration cfg=new Configuration();
		
		/*
		 * it is one method in Configuration and we used to define the configuration file path
		 * */
		cfg.configure("com/Hibernate1/hibernate.cfg.xml");
		
		/* 
		 * SessionFactory is a interface  available in org.hibernate package
		 * and this is thread safe(Synchronized)
		 * and this is mutable(not changeable)
		 * 
		 * and this method used to create object of Session interface
		 * */
		SessionFactory fact=cfg.buildSessionFactory();
		
		/*
		 * the Session interface available in org.hibernate package
		 * 
		 * and the  Session interface use to perform CURD operations
		 * 
		 * C-Create
		 * U-Update 
		 * R-Read
		 * D-Delete
		 * */ 
		Session s=fact.openSession();
		
		/*
		 * Transaction is a interface available in org.hibernate package
		 * 
		 * this is used to the CURD operation do any works it commit permanently
		 * 
		 * using of commit method
		 * */
		Transaction tr=s.beginTransaction();
		
		
		//calling the StudentDemo Class
		StudentDemo obj=new StudentDemo();
		
		obj.setID(1);
		obj.setName("magi");
		obj.setCollage("govt. collage");
		
		//this save method used to save this operations
		s.save(obj);
		
		//this commit() method used to make changes permanently
		tr.commit();
		
		

	}

}
