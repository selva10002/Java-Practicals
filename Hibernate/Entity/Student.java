package entity;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class Student
{
	


	@Id
	private int ID;
	
	@Column(length=20,nullable = false)
	private String name;
	
	@Column(length=30,nullable=false)
	private String location;
	
	@Column(length=15)
	private String contact;
	
	
	public int getID() 
	{
		return ID;
	}
	public void setID(int iD)
	{
		ID = iD;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getLocation() 
	{
		return location;
	}
	public void setLocation(String location)
	{
		this.location = location;
	}
	public String getContact() 
	{
		return contact;
	}
	public void setContact(String contact)
	{
		this.contact = contact;
	}
	
	
	
	@Override
	public String toString()
	{
		return "Student [ID=" + ID + ", name=" + name + ", location=" + location + ", contact=" + contact + "]";
	}
	
	


}
