package onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person 
{
	@Id
	private int personId;
	@Column(nullable=false)
	private String personName;
	@Column
	private String PersonFatherName;
	@Column
	private String eMail;
	
	@OneToOne
	private PanCard pancard;

	

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonFatherName() {
		return PersonFatherName;
	}

	public void setPersonFatherName(String personFatherName) {
		PersonFatherName = personFatherName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public PanCard getPancard() {
		return pancard;
	}

	public void setPancard(PanCard pancard) {
		this.pancard = pancard;
	}
	
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", PersonFatherName=" + PersonFatherName
				+ ", eMail=" + eMail + ", pancard=" + pancard + "]";
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

}
