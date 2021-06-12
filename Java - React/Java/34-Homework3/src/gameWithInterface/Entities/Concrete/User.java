package gameWithInterface.Entities.Concrete;

import java.util.Date;

import gameWithInterface.Entities.Abstract.Entity;

// Ciplak Class Kalmasýn
public class User implements Entity {
	private int id;
	private String userName;
	private String email;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String nationalityId;
	
	public User() {
		
	}

	public User(int id, String userName, String email, String firstName, String lastName, Date dateOfBirth,
			String nationalityId) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	
}
