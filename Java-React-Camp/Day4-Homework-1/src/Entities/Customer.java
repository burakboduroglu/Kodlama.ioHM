package Entities;

import java.time.LocalDate;

import Abstract.IEntity;

public class Customer implements IEntity {
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String nationalityID;



	public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, String nationalityID) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityID = nationalityID;
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

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalityID() {
		return nationalityID;
	}

	public void setNationalityID(String nationalityID) {
		this.nationalityID = nationalityID;
	}

	
}
