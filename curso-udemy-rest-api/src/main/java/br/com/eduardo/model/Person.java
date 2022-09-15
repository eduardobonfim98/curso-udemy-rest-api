package br.com.eduardo.model;

import java.io.Serializable;

public class Person implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Long id;
	private String firstName; 
	private String lastName;
	private String adress;
	private String gender; 
	
	public Person() {}

	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAdress() {
		return adress;
	}

	public String getGender() {
		return gender;
	}
	
	
}