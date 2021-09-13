package entity;

//import this to be able to use entity
import javax.persistence.Entity;

//map table and columns
import javax.persistence.Table;

//import to map column from Database 
import javax.persistence.Column;

//import this and add @Id on the primary key
import javax.persistence.Id;

//add " @Entity" to use import javax.persistence.Entity;
@Entity

//to map use this and input name value based on table name in database
//student entity to table name
@Table(name="student")
public class student {

	
	//map columns using @Column(name="variable name") be sure to place exact column name value from the database 
	@Id
	@Column(name="id") 
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;

	
	
	//Two constructors (with constructor and without constructor)
	
	//with parameter/argument constructor
	public student(int id,String fn, String ln, String em ) {
	
		//pass the variable from arguments to argument of this.set
		//set variable can be varied
		
		//This is setting process
		this.setId(id);
		this.setFirstName(fn);
		this.setLastName(ln);
		this.setLastName(em);
	}
	//no parameter constructor
	public student() {
		
	}
	
	
	
	
	//ID
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//first name
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	//last name
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	//email
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
