package com.project.api.data.enums;

public enum PlaceType {
	ALL(1, MainType.ALL, "all"), HOTEL(2, MainType.LODGING, "hotel"), AIRPORT(3, MainType.TRANSPORT, "airport"),
	BUS_TERMINAL(4, MainType.TRANSPORT, "bus-terminal"), MALL(5, MainType.SHOPPING, "mall"),
	RESTAURANT(6, MainType.FOOD_AND_BEVERAGE, "restaurant"), MUSEUM(8, MainType.ATTRACTIONS, "museum"),
	FAST_FOOD(9, MainType.FOOD_AND_BEVERAGE, "fast-food"), MARKETPLACE(10, MainType.SHOPPING, "marketplace-bazaar"), 
	NATURE_AND_PARK(11, MainType.ATTRACTIONS, "nature-and-park"), WATERFALL(12, MainType.ATTRACTIONS, "waterfall"),
	TAXI_STATION(13, MainType.TRANSPORT, "taxi-station"), HISTORIC_SITE(14,	MainType.ATTRACTIONS, "historic-site"),
	FOREST_AND_PICNIC(14, MainType.ATTRACTIONS, "forest-and-picnic"), HOSPITAL(15, MainType.HEALTH, "hospital"),
	CINEMA(16, MainType.ENTERTAINMENT, "cinema"), BEACH(17, MainType.ATTRACTIONS, "beach"),
	CANYON(18, MainType.ATTRACTIONS, "canyon"), THEATHER(19, MainType.ENTERTAINMENT, "theather"),
	NIGHT_CLUB(20, MainType.NIGHT_LIFE, "night-club"), BAR(21, MainType.NIGHT_LIFE, "bar"), 
	MUNICIPALITY(22, MainType.PUBLIC_ENTERPRISE, "municipality"), CONSULATE(25, MainType.PUBLIC_ENTERPRISE, "consulate"),
	THEME_PARK(23, MainType.ATTRACTIONS, "theme-park"), CONGRESS_AND_EXHIBITON_CENTER(24, MainType.ATTRACTIONS, "congress-and-exhibition-center"),
	//26
	NOTSET(0, MainType.NOTSET, "notset");

	private final int id;
	private final MainType mainType;
	private final String slug;

	private PlaceType(int id, MainType mainType, String slug) {
		this.id = id;
		this.mainType = mainType;
		this.slug = slug;
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
			if (type.getSlug().equalsIgnoreCase(slug)) {
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

	public String getSlug() {
		return slug;
	}
}
