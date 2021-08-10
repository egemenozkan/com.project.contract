package com.vantalii.contact.model.transfer;

import java.io.Serializable;
import java.util.Date;

public class DriverLicence implements Serializable {

	private static final long serialVersionUID = -5493539574863155150L;
	
	private String number;
	private Date expiryDate;
	private String licenceClass;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getLicenceClass() {
		return licenceClass;
	}

	public void setLicenceClass(String licenceClass) {
		this.licenceClass = licenceClass;
	}

}
