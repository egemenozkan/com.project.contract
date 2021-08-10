package com.vantalii.contact.model.driver;

import java.time.LocalDate;

import com.vantalii.contract.enums.DrivingLicenceType;

public class DrivingLicence {
	private int id;
    private DrivingLicenceType type;
    private LocalDate issueDate;
    private String licence;

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

	public String getLicence() {
		return licence;
	}

	public void setLicence(String licence) {
		this.licence = licence;
	}

	public DrivingLicenceType getType() {
		return type;
	}

	public void setType(DrivingLicenceType type) {
		this.type = type;
	}
}
