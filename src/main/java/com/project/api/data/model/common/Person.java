package com.project.api.data.model.common;

import java.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.project.api.data.utils.LocalDateDeserializer;
import com.project.api.data.utils.LocalDateSerializer;
import com.project.common.enums.BloodType;
import com.project.common.enums.Gender;
import com.project.common.enums.MaritalStatus;

public class Person {
	private long id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String fullName;
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	private LocalDate birtdate;
	private IdValue nationality;
	private String nationalID;
	private Gender gender;
	private MaritalStatus maritalStatus;
	private ContactInformation contactInformation;
	private BloodType bloodType;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public LocalDate getBirtdate() {
		return birtdate;
	}

	public void setBirtdate(LocalDate birtdate) {
		this.birtdate = birtdate;
	}

	public IdValue getNationality() {
		return nationality;
	}

	public void setNationality(IdValue nationality) {
		this.nationality = nationality;
	}

	public String getNationalID() {
		return nationalID;
	}

	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public MaritalStatus getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public ContactInformation getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(ContactInformation contactInformation) {
		this.contactInformation = contactInformation;
	}

	public BloodType getBloodType() {
		return bloodType;
	}

	public void setBloodType(BloodType bloodType) {
		this.bloodType = bloodType;
	}

}
