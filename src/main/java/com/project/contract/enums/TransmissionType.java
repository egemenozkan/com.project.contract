package com.project.contract.enums;

public enum TransmissionType {
	MANUAL("manual"), AUTOMATIC("automatic");
	
	private String code;

	private TransmissionType(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
}
