package onetoone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PanCard
{
	@Id
	private int panID;
	@Column(unique=true,nullable=false)
	private String panNumber;
	
	@OneToOne
	private Person person;

	@Override
	public String toString() {
		return "PanCard [panID=" + panID + ", panNumber=" + panNumber + ", person=" + person + "]";
	}

	public PanCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPanID() {
		return panID;
	}

	public void setPanID(int panID) {
		this.panID = panID;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	

}
