package com.tourist.service.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="touristRegister")
public class Tourist {
	
	@Id
	private String id;
	private String firstName;
	private String lastName;
	private String age;
	private String fromPlace;
	private String numberOfDaysVisit;
	private String gender;
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getFromPlace() {
		return fromPlace;
	}
	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}
	public String getNumberOfDaysVisit() {
		return numberOfDaysVisit;
	}
	public void setNumberOfDaysVisit(String numberOfDaysVisit) {
		this.numberOfDaysVisit = numberOfDaysVisit;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Tourist(String id, String firstName, String lastName, String age, String fromPlace, String numberOfDaysVisit,
			String gender) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.fromPlace = fromPlace;
		this.numberOfDaysVisit = numberOfDaysVisit;
		this.gender = gender;
	}
	public Tourist() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Tourist [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", fromPlace=" + fromPlace + ", numberOfDaysVisit=" + numberOfDaysVisit + ", gender=" + gender + "]";
	}
	
	

}
