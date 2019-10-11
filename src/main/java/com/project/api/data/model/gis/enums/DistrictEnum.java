package com.project.api.data.model.gis.enums;

public enum DistrictEnum {
	AKSEKI(1, "Akseki", CityEnum.ANTALYA),
	AKSU(2, "Aksu", CityEnum.ANTALYA),
	ALANYA(3, "Alanya", CityEnum.ANTALYA),
	DEMRE(4, "Demre", CityEnum.ANTALYA),
	DOSEMEALTI(5, "Döşemealtı", CityEnum.ANTALYA),
	ELMALI(6, "Elmalı", CityEnum.ANTALYA),
	FINIKE(7, "Finike", CityEnum.ANTALYA),
	GAZIPASA(7, "Gazipaşa", CityEnum.ANTALYA),
	GUNDOGMUS(8, "Gündoğmuş", CityEnum.ANTALYA),
	IBRADI(9, "İbradi", CityEnum.ANTALYA),
	KAS(10, "Kaş", CityEnum.ANTALYA),
	KEMER(11, "Kemer", CityEnum.ANTALYA),
	KEPEZ(12, "Kepez", CityEnum.ANTALYA),
	KONYAALTI(13,"Konyaaltı", CityEnum.ANTALYA),
	KORKUTELI(14, "Korkuteli", CityEnum.ANTALYA),
	KUMLUCA(15, "Kumluca", CityEnum.ANTALYA),
	MANAVGAT(16, "Manavgat", CityEnum.ANTALYA),
	MURATPASA(17, "Muratpaşa", CityEnum.ANTALYA),
	SERIK(18, "Serik", CityEnum.ANTALYA);

	private int id;
	private String name;
	private CityEnum city;

	public CityEnum getCityEnum() {
		return city;
	}

	private DistrictEnum(int id, String name, CityEnum city) {
		this.id = id;
		this.city = city;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public static DistrictEnum getById(int id) {
		for(DistrictEnum district : DistrictEnum.values()) {
			if (district.getId() == id) {
				return district;
			}
		}
		return null;
	}
}
