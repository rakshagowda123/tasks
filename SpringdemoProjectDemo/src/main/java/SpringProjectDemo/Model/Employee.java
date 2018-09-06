package SpringProjectDemo.Model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name ="Employee")
public class Employee {
	@Id
	@SequenceGenerator(name="seq-gen",sequenceName="MY_SEQ_GEN",initialValue=1, allocationSize=12)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator="seq-gen")
	@Column(name = "id")
	private Long id;
	
	@Column(name = "email", nullable = false, unique = true)
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "first_name")
	private String firstName;
	
	  @OneToOne
	    @JoinColumn(name="project_id")
	    private Project pro;
	  
	  
	@Column(name = "last_name")
	private String lastName;
	public Employee(String firstname2, String lastname2, String email,String password2) {
		this.firstName=firstname2;
		this.lastName=lastname2;
		this.password=password2;
		this.email=email;
		
		// TODO Auto-generated constructor stub
	}
	public Employee() {}
	public Project getProject() {
        return  pro;
    }
    public void setProject(Project project) {
        this.pro = project;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
