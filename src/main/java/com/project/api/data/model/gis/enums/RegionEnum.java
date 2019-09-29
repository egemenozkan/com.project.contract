package com.project.api.data.model.gis.enums;

public enum RegionEnum {
	// @formatter:off	
	KUNDU(6, "Kundu", DistrictEnum.MURATPASA, TransferRegionEnum.KUNDU),
	LARA(7, "Lara", DistrictEnum.MURATPASA, TransferRegionEnum.LARA),
	KONYAALTI(5, "Konyaaltı", DistrictEnum.KONYAALTI, TransferRegionEnum.KONYAALTI),
	HURMA(999, "Hurma", DistrictEnum.KONYAALTI, TransferRegionEnum.KONYAALTI),
	KALEICI(5, "Kaleiçi", DistrictEnum.MURATPASA, TransferRegionEnum.KONYAALTI),
	EXPO_ANTALYA(6, "Expo", DistrictEnum.AKSU, TransferRegionEnum.KONYAALTI),
	AIRPORT_AYT(7, "Antalya Havalimanı", DistrictEnum.AKSU, TransferRegionEnum.AIRPORT),
	BELEK(8, "Belek", DistrictEnum.SERIK, TransferRegionEnum.BELEK),
	BOGAZKENT(10, "Boğazkent", DistrictEnum.SERIK, TransferRegionEnum.BOGAZKENT),
	KUMKOY(26, "Kumköy", DistrictEnum.MANAVGAT, TransferRegionEnum.KUMKOY),
	ANTALYA_CENTER(4, "Antalya Şehir Merkezi", DistrictEnum.MANAVGAT, TransferRegionEnum.KUMKOY),
	INCEKUM(11, "İncekum", DistrictEnum.ALANYA, TransferRegionEnum.INCEKUM),
	KEMER(13, "Kemer", DistrictEnum.KEMER, TransferRegionEnum.KEMER),
	KEMER_CENTER(14, "Kemer Şehir Merkezi", DistrictEnum.KEMER, TransferRegionEnum.KEMER),
	BELDIBI(15, "Beldibi", DistrictEnum.KEMER, TransferRegionEnum.BELDIBI),
	CAMYUVA(16, "Çamyuva", DistrictEnum.KEMER, TransferRegionEnum.BELDIBI),
	GOYNUK(17, "Göynük", DistrictEnum.KEMER, TransferRegionEnum.GOYNUK),
	KIRIS(18, "Kiriş", DistrictEnum.KEMER, TransferRegionEnum.KEMER),
	TEKIROVA(19, "Tekirova", DistrictEnum.KEMER, TransferRegionEnum.KEMER),
	SIDE(20, "Side", DistrictEnum.MANAVGAT, TransferRegionEnum.SIDE),
	SIDE_CENTER(21, "Side Şehir Merkezi", DistrictEnum.MANAVGAT, TransferRegionEnum.SIDE),
	COLAKLI(22, "Çolaklı", DistrictEnum.ALANYA, TransferRegionEnum.COLAKLI),
	MANAVGAT(27, "Manavgat", DistrictEnum.MANAVGAT, TransferRegionEnum.COLAKLI),
	ALTINOVA(28, "Altınova", DistrictEnum.KEPEZ, TransferRegionEnum.AIRPORT);









	// @formatter:on

	private int id;
	private String name;
	private DistrictEnum district;
	private TransferRegionEnum transferRegionEnum;

	private RegionEnum(int id, String name, DistrictEnum district, TransferRegionEnum transferRegionEnum) {
		this.id = id;
		this.district = district;
		this.transferRegionEnum = transferRegionEnum;
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public DistrictEnum getDistrictEnum() {
		return district;
	}

	public TransferRegionEnum getTransferRegionEnum() {
		return transferRegionEnum;
	}
	
	public static RegionEnum getById(int id) {
		for(RegionEnum region : RegionEnum.values()) {
			if (region.getId() == id) {
				return region;
			}
		}
		return null;
	}

}
