package com.project.api.data.model.gis.enums;

public enum RegionEnum {
	// @formatter:off	
	KUNDU(6, "Kundu", "Kundu", DistrictEnum.MURATPASA, TransferRegionEnum.KUNDU),
	LARA(7, "Lara", "Lara", DistrictEnum.MURATPASA, TransferRegionEnum.LARA),
	KONYAALTI(5, "Konyaaltı", "Konyaalti", DistrictEnum.KONYAALTI, TransferRegionEnum.KONYAALTI),
	HURMA(999, "Hurma", "Hurma", DistrictEnum.KONYAALTI, TransferRegionEnum.KONYAALTI),
	KALEICI(5, "Kaleiçi", "Kaleici", DistrictEnum.MURATPASA, TransferRegionEnum.KONYAALTI),
	EXPO_ANTALYA(6, "Expo", "Expo", DistrictEnum.AKSU, TransferRegionEnum.KONYAALTI),
	AIRPORT_AYT(7, "Antalya Havalimanı", "Antalya Airport", DistrictEnum.AKSU, TransferRegionEnum.AIRPORT),
	BELEK(8, "Belek", "Belek", DistrictEnum.SERIK, TransferRegionEnum.BELEK),
	BOGAZKENT(10, "Boğazkent", "Bogazkent", DistrictEnum.SERIK, TransferRegionEnum.BOGAZKENT),
	KUMKOY(26, "Kumköy", "Kumkoy", DistrictEnum.MANAVGAT, TransferRegionEnum.KUMKOY),
	ANTALYA_CENTER(4, "Antalya Şehir Merkezi", "Antalya Centrum", DistrictEnum.MANAVGAT, TransferRegionEnum.KUMKOY),
	INCEKUM(11, "İncekum", "Incekum", DistrictEnum.ALANYA, TransferRegionEnum.INCEKUM),
	KEMER(13, "Kemer", "Kemer", DistrictEnum.KEMER, TransferRegionEnum.KEMER),
	KEMER_CENTER(14, "Kemer Şehir Merkezi", "Kemer Centrum", DistrictEnum.KEMER, TransferRegionEnum.KEMER),
	BELDIBI(15, "Beldibi", "Beldibi", DistrictEnum.KEMER, TransferRegionEnum.BELDIBI),
	CAMYUVA(16, "Çamyuva", "Camyuva", DistrictEnum.KEMER, TransferRegionEnum.BELDIBI),
	GOYNUK(17, "Göynük", "Goynuk", DistrictEnum.KEMER, TransferRegionEnum.GOYNUK),
	KIRIS(18, "Kiriş", "Kiris", DistrictEnum.KEMER, TransferRegionEnum.KEMER),
	TEKIROVA(19, "Tekirova", "Tekirova", DistrictEnum.KEMER, TransferRegionEnum.KEMER),
	SIDE(20, "Side", "Side", DistrictEnum.MANAVGAT, TransferRegionEnum.SIDE),
	SIDE_CENTER(21, "Side Şehir Merkezi", "Side Centrum", DistrictEnum.MANAVGAT, TransferRegionEnum.SIDE),
	COLAKLI(22, "Çolaklı", "Colakli", DistrictEnum.ALANYA, TransferRegionEnum.COLAKLI),
	MANAVGAT(27, "Manavgat", "Manavgat", DistrictEnum.MANAVGAT, TransferRegionEnum.COLAKLI),
	ALTINOVA(28, "Altınova", "Altinova", DistrictEnum.KEPEZ, TransferRegionEnum.AIRPORT),
	ALANYA_CENTER(22, "Alanya Şehir Merkezi", "Alanya Centrum", DistrictEnum.ALANYA, TransferRegionEnum.ALANYA);








	// @formatter:on

	private int id;
	private String name;
	private String enName;
	private DistrictEnum district;
	private TransferRegionEnum transferRegionEnum;

	private RegionEnum(int id, String name, String enName, DistrictEnum district, TransferRegionEnum transferRegionEnum) {
		this.id = id;
		this.district = district;
		this.transferRegionEnum = transferRegionEnum;
		this.name = name;
		this.enName = enName;
	}

	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public String getEnName() {
		return enName;
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
