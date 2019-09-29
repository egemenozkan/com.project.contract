package com.project.api.data.model.gis.enums;

public enum CountryEnum {
	TURKEY(1, "Türkiye", "TR", "90", "TR", "TRY");

	private int id;
	private String name;
	private String code;
	private String phoneCode;
	private String languageCode;
	private String currencyCode;

	private CountryEnum(int id, String name, String code, String phoneCode, String languageCode, String currencyCode) {
		this.id = id;
		this.name = name;
		this.code = code;
		this.phoneCode = phoneCode;
		this.languageCode = languageCode;
		this.currencyCode = currencyCode;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCode() {
		return code;
	}

	public String getPhoneCode() {
		return phoneCode;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}
	
	public static CountryEnum getById(int id) {
		for(CountryEnum country : CountryEnum.values()) {
			if (country.getId() == id) {
				return country;
			}
		}
		return null;
	}

}
