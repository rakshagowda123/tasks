package SpringProjectDemo.Model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name ="Project")
public class Project {
	@Id
	@SequenceGenerator(name="seq-gen",sequenceName="MY_SEQ_GEN",initialValue=1, allocationSize=12)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="seq-gen")
	@Column(name = "project_id")
	private int project_id;
	
	@Column(name = "description", nullable = false, unique = true)
	private String des;
	
	
	@Column(name = "start_date")
	private Date sod;
	
	
	  
	  @Column(name = "end_date")
		private Date eod;



	public int getProject_id() {
		return project_id;
	}

	public Project(String desc,Date sod, Date eod) {
		this.des=desc;
		this.sod=sod;
		this.eod=eod;
		
		
		// TODO Auto-generated constructor stub
	}


	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}



	public String getDes() {
		return des;
	}



	public void setDes(String des) {
		this.des = des;
	}



	public Date getSod() {
		return sod;
	}



	public void setSod(Date sod) {
		this.sod = sod;
	}



	public Date getEod() {
		return eod;
	}



	public void setEod(Date eod) {
		this.eod = eod;
	}

	
	

	
	
	
}