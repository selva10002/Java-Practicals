package onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Subjects
{
	@Id
	private int subjectId;
	@Column
	private String subjectName;
	
	
	@ManyToOne
	private StudentDemo1 student;


	public Subjects() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Subjects [subjectId=" + subjectId + ", subjectName=" + subjectName + ", student=" + student + "]";
	}


	public int getSubjectId() {
		return subjectId;
	}


	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}


	public String getSubjectName() {
		return subjectName;
	}


	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}


	public StudentDemo1 getStudent() {
		return student;
	}


	public void setStudent(StudentDemo1 student) {
		this.student = student;
	}
	

}
