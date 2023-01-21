package onetomany;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToMany;

@Entity
public class StudentDemo1 
{

	@Id
	private int studentId;
	@Column(nullable=false)
	private String studentName;
	@Column
	private String studentlocation;
	
	@Column(nullable = false)
	private String corse;
	
	
	@OneToMany(mappedBy = "student",cascade = CascadeType.ALL)
	List<Subjects> subjectlist=new ArrayList<Subjects>();
	
	
	
	public StudentDemo1() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "StudentDemo [studentId=" + studentId + ", studentName=" + studentName + ", studentlocation="
				+ studentlocation + ", corse=" + corse + ", subjectlist=" + subjectlist + "]";
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getStudentlocation() {
		return studentlocation;
	}


	public void setStudentlocation(String studentlocation) {
		this.studentlocation = studentlocation;
	}


	public String getCorse() {
		return corse;
	}


	public void setCorse(String corse) {
		this.corse = corse;
	}


	public List<Subjects> getSubjectlist() {
		return subjectlist;
	}


	public void setSubjectlist(List<Subjects> subjectlist) {
		this.subjectlist = subjectlist;
	}


	

}
