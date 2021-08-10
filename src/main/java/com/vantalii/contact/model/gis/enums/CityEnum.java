package com.vantalii.contact.model.gis.enums;

public enum CityEnum {
	// @formatter:off	
	ANTALYA(1, "Antalya", "07", "242", CountryEnum.TURKEY),
	IZMIR(2, "İzmir", "35", "232", CountryEnum.TURKEY);
	// @formatter:on

	private int id;
	private String plateCode;
	private String phoneCode;
	private String name;
	private CountryEnum country;

	private CityEnum(int id, String name, String plateCode, String phoneCode, CountryEnum country) {
		this.id = id;
		this.plateCode = plateCode;
		this.phoneCode = phoneCode;
		this.name = name;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public String getPlateCode() {
		return plateCode;
	}

	public String getPhoneCode() {
		return phoneCode;
	}

	public String getName() {
		return name;
	}

	public CountryEnum getCountry() {
		return country;
	}
	
	public static CityEnum getById(int id) {
		for(CityEnum city : CityEnum.values()) {
			if (city.getId() == id) {
				return city;
			}
		}
		return null;
	}

}
