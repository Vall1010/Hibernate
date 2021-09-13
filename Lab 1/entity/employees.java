package entity;
import javax.persistence.*;
import java.sql.Timestamp;
import java.time.Instant;

@Entity
@Table(name="employees")
public class employees {
	
	
	String str="2018-09-01 09:01:15"; 
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="salary")
	private String salary;
	
	@Column(name="created_date")
	private Timestamp createdDate = Timestamp.valueOf(str);
	
	@Column(name="modified_date")
	private Timestamp modifiedDate = Timestamp.valueOf(str);
	
	public employees(int id,String fn, String ln, String em, String sal, Timestamp cd, Timestamp md ) {
		
		
		this.setId(id);
		this.setFirstName(fn);
		this.setLastName(ln);
		this.setEmail(em);
		this.setSalary(sal);
		this.setCreatedDate(cd);
		this.setModifiedDate(md);
		this.setCreatedDate(cd);
		this.setModifiedDate(md);
		
	}
	//no parameter constructor
	public employees() {
		
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
	public Timestamp getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
	
	
	
	
	
	
	
	
	
}

