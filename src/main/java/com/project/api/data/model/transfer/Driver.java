package com.project.api.data.model.transfer;

import java.io.Serializable;

import com.project.api.data.model.common.Person;

public class Driver extends Person implements Serializable {

	private static final long serialVersionUID = 6771140235225019499L;

	private DriverLicence licence;

	public DriverLicence getLicence() {
		return licence;
	}

	public void setLicence(DriverLicence licence) {
		this.licence = licence;
	}

	

}
