package com.project.api.data.model.gis.enums;

public enum TransferRegionEnum {
	// @formatter:off	
	AIRPORT(1,"Havalimanı"),
	KONYAALTI(2, "Konyaaltı"),
	LARA(3, "Lara"),
	KUNDU(4, "Kundu"),
	BELEK(5, "Belek"),
	BOGAZKENT(6, "Boğazkent"),
	KUMKOY(7, "Kumköy"),
	INCEKUM(8, "İncekum"),
	KEMER(9, "Kemer"),
	BELDIBI(10, "Beldibi"),
	CAMYUVA(11, "Çamyuva"),
	GOYNUK(12, "Göynük"),
	SIDE(13, "Side"),
	COLAKLI(14, "Çolaklı"),
	MANAVGAT(15, "Manavgat");



	// @formatter:on	

	private int id;
	private String name;

	TransferRegionEnum(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

}
