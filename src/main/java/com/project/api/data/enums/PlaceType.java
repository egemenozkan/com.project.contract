package com.project.api.data.enums;

public enum PlaceType {
	ALL(1, null), HOTEL(2, MainType.LODGING), AIRPORT(3, MainType.TRANSPORT), BUS_TERMINAL(4, MainType.TRANSPORT), MALL(5,
			MainType.SHOPPING), RESTAURANT(6, MainType.FOOD_AND_BEVERAGE), MUSEUM(8, MainType.ATTRACTIONS), FAST_FOOD(9,
					MainType.FOOD_AND_BEVERAGE), MARKETPLACE(10, MainType.SHOPPING), NATURE_AND_PARK(11, MainType.ATTRACTIONS), WATERFALL(
							12, MainType.ATTRACTIONS), TAXI_STATION(13, MainType.TRANSPORT), HISTORIC_SITE(14,
									MainType.ATTRACTIONS), FOREST_AND_PICNIC(14, MainType.ATTRACTIONS), HOSPITAL(15,
											MainType.HEALTH), CINEMA(16, MainType.ENTERTAINMENT), BEACH(17, MainType.ATTRACTIONS), CANYON(
													18, MainType.ATTRACTIONS), THEATHER(19, MainType.ENTERTAINMENT), NIGHT_CLUB(20,
															MainType.ENTERTAINMENT), BAR(21, MainType.FOOD_AND_BEVERAGE), MUNICIPALITY(22,
																	MainType.PUBLIC_ENTERPRISE), CONSULATE(22,
																			MainType.PUBLIC_ENTERPRISE), THEME_PARK(23,
																					MainType.ATTRACTIONS), NOTSET(0, null);

	private final int id;
	private final MainType mainType;

	private PlaceType(int id, MainType mainType) {
		this.id = id;
		this.mainType = mainType;
	}

	public static PlaceType getById(int id) {
		for (PlaceType type : PlaceType.values()) {
			if (type.id == id) {
				return type;
			}
		}
		return PlaceType.NOTSET;
	}

	public static PlaceType getByMainType(MainType mainType) {
		for (PlaceType type : PlaceType.values()) {
			if (type.mainType == mainType) {
				return type;
			}
		}
		return PlaceType.NOTSET;
	}

	public static PlaceType getBySlug(String slug) {
		for (PlaceType type : PlaceType.values()) {
			if (type.toString().toLowerCase().replaceAll("_", "-").equalsIgnoreCase(slug)) {
				return type;
			}
		}
		return PlaceType.NOTSET;
	}

	public int getId() {
		return id;
	}

	public MainType getMainType() {
		return mainType;
	}
}
