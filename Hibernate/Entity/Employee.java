package entity;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class Employee
{
	@Id
	private int ID;
	@Column(nullable = false)
	private String Name;
	@Column
	private String Email;
	@Column
	private int Salary;

	

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", Name=" + Name + ", Email=" + Email + ", Salary=" + Salary + "]";
	}
	

}
