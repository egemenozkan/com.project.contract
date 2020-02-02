package com.project.api.data.model.gis.enums;

public enum DistrictEnum {
	AKSEKI(1, "Akseki", CityEnum.ANTALYA, 99),
	AKSU(2, "Aksu", CityEnum.ANTALYA, 99),
	ALANYA(3, "Alanya", CityEnum.ANTALYA, 99),
	DEMRE(4, "Demre", CityEnum.ANTALYA, 99),
	DOSEMEALTI(5, "Döşemealtı", CityEnum.ANTALYA, 99),
	ELMALI(6, "Elmalı", CityEnum.ANTALYA, 99),
	FINIKE(7, "Finike", CityEnum.ANTALYA, 99),
	GAZIPASA(7, "Gazipaşa", CityEnum.ANTALYA, 99),
	GUNDOGMUS(8, "Gündoğmuş", CityEnum.ANTALYA, 99),
	IBRADI(9, "İbradi", CityEnum.ANTALYA, 99),
	KAS(10, "Kaş", CityEnum.ANTALYA, 99),
	KEMER(11, "Kemer", CityEnum.ANTALYA, 3),
	KEPEZ(12, "Kepez", CityEnum.ANTALYA, 99),
	KONYAALTI(13,"Konyaaltı", CityEnum.ANTALYA, 2),
	KORKUTELI(14, "Korkuteli", CityEnum.ANTALYA, 99),
	KUMLUCA(15, "Kumluca", CityEnum.ANTALYA, 99),
	MANAVGAT(16, "Manavgat", CityEnum.ANTALYA, 99),
	MURATPASA(17, "Muratpaşa", CityEnum.ANTALYA, 1),
	SERIK(18, "Serik", CityEnum.ANTALYA, 99);

	private int id;
	private String name;
	private CityEnum city;
	private int order;

	public CityEnum getCityEnum() {
		return city;
	}

	private DistrictEnum(int id, String name, CityEnum city, int order) {
		this.id = id;
		this.city = city;
		this.name = name;
		this.order = order;
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

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

}
