package manytomany;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Interview
{
	@Id
	private int interviewId;
	@Column
	private String companyName;
	@Column
	private String interviewDate;
	@Column
	private String jobName;
	@ManyToMany(mappedBy = "interviewList")
	List<Canditate> canditateList=new ArrayList<Canditate>();
	public int getInterviewId() {
		return interviewId;
	}
	public void setInterviewId(int interviewId) {
		this.interviewId = interviewId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getInterviewDate() {
		return interviewDate;
	}
	public void setInterviewDate(String interviewDate) {
		this.interviewDate = interviewDate;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public List<Canditate> getCanditateList() {
		return canditateList;
	}
	public void setCanditateList(List<Canditate> canditateList) {
		this.canditateList = canditateList;
	}
	@Override
	public String toString() {
		return "Interview [interviewId=" + interviewId + ", companyName=" + companyName + ", interviewDate="
				+ interviewDate + ", jobName=" + jobName + ", canditateList=" + canditateList + "]";
	}
	public Interview() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
