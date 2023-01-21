package manytomany;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;


@Entity
public class Canditate 
{
	@Id
	private int canditateId;
	@Column
	private String canditateName;
	@Column
	private String canditateFatherName;
	@Column
	private String canditateLocation;
	
	@ManyToMany(cascade = CascadeType.ALL)
	
	@JoinTable( name="Canditate_Interview",
		joinColumns=@JoinColumn(name="cID",referencedColumnName = "canditateId"), 
		inverseJoinColumns =@JoinColumn(name="interviewID",referencedColumnName = "interviewId") 
	)
	
	List<Interview> interviewList=new ArrayList<Interview>();

	public int getCanditateId() {
		return canditateId;
	}

	public void setCanditateId(int canditateId) {
		this.canditateId = canditateId;
	}

	public String getCanditateName() {
		return canditateName;
	}

	public void setCanditateName(String canditateName) {
		this.canditateName = canditateName;
	}

	public String getCanditateFatherName() {
		return canditateFatherName;
	}

	public void setCanditateFatherName(String canditateFatherName) {
		this.canditateFatherName = canditateFatherName;
	}

	public String getCanditateLocation() {
		return canditateLocation;
	}

	public void setCanditateLocation(String canditateLocation) {
		this.canditateLocation = canditateLocation;
	}

	public List<Interview> getInterviewList() {
		return interviewList;
	}

	public void setInterviewList(List<Interview> interviewList) {
		this.interviewList = interviewList;
	}

	@Override
	public String toString() {
		return "Canditate [canditateId=" + canditateId + ", canditateName=" + canditateName + ", canditateFatherName="
				+ canditateFatherName + ", canditateLocation=" + canditateLocation + ", interviewList=" + interviewList
				+ "]";
	}

	public Canditate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
