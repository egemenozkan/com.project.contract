package com.project.contract.enums;

public enum VehicleClassType {
	ECONOMY("economy"), ECONOMY_PLUS("economy+"),LUXURY("luxury");
	
	private String code;

	private VehicleClassType(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
}
