package com.project.contract.enums;

public enum FeePeriod{
	_1_3("1_3"), _4_7("4_7"), _8_15("8_15"), _16_21("16_21"), _22_28("22_28"), _29_99("29_99");
	
	private String code;

	private FeePeriod(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
}
