package com.project.contract.enums;

public enum VehicleBrand {
	MAZDA("mazda"), BMW("bmw"), MERCEDES("mercedes");

	private String code;

	private VehicleBrand(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

}
