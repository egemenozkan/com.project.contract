package com.project.contract.enums;

public enum FuelType {
	BENZINE("benzine"), DIESEL("diesel");
	
	private String code;

	private FuelType(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
}
