package Entities;

import java.time.LocalDate;

import Abstract.IEntity;

public class Gamer implements IEntity {
	private int id;
	private String firstName;
	private String lastName;
	private String nationalityID;
	private LocalDate birthDate;
	
	public Gamer(int id, String firstName, String lastName, String nationalityID, LocalDate birthDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityID = nationalityID;
		this.birthDate = birthDate;
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

	public String getNationalityID() {
		return nationalityID;
	}

	public void setNationalityID(String nationalityID) {
		this.nationalityID = nationalityID;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

}
