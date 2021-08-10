package com.vantalii.contract.enums;

public enum PlaceType {
	ALL(1, MainType.ALL, "all", "fa-"), HOTEL(2, MainType.LODGING, "hotel", "fa-hotel"), AIRPORT(3, MainType.TRANSPORT, "airport", "fa-plane"),
	BUS_TERMINAL(4, MainType.TRANSPORT, "bus-terminal", "fad fa-bus"), MALL(5, MainType.SHOPPING, "mall", "fa-shopping-cart"),
	RESTAURANT(6, MainType.FOOD_AND_BEVERAGE, "restaurant", "fa-utensils-alt"), MUSEUM(8, MainType.ATTRACTIONS, "museum", "fa-landmark"),
	FAST_FOOD(9, MainType.FOOD_AND_BEVERAGE, "fast-food", "fa-burger-soda"), MARKETPLACE(10, MainType.SHOPPING, "marketplace-bazaar", "fa-shopping-basket"), 
	NATURE_AND_PARK(11, MainType.ATTRACTIONS, "nature-and-park", "fa-"), WATERFALL(12, MainType.ATTRACTIONS, "waterfall", "fa-"),
	TAXI_STATION(13, MainType.TRANSPORT, "taxi-station", "fad fa-taxi"), HISTORIC_SITE(14,	MainType.ATTRACTIONS, "historic-site", "fa-"),
	FOREST_AND_PICNIC(14, MainType.ATTRACTIONS, "forest-and-picnic", "fa-"), HOSPITAL(15, MainType.HEALTH, "hospital", "fa-"),
	CINEMA(16, MainType.ENTERTAINMENT, "cinema", "fa-"), BEACH(17, MainType.ATTRACTIONS, "beach", "fa-umbrella-beach"),
	CANYON(18, MainType.ATTRACTIONS, "canyon", "fa-"), THEATHER(19, MainType.ENTERTAINMENT, "theather", "fa-"),
	NIGHT_CLUB(20, MainType.NIGHT_LIFE, "night-club", "fa-"), BAR(21, MainType.NIGHT_LIFE, "bar", "fa-"), 
	MUNICIPALITY(22, MainType.PUBLIC_ENTERPRISE, "municipality", "fa-"), CONSULATE(25, MainType.PUBLIC_ENTERPRISE, "consulate", "fa-"),
	THEME_PARK(23, MainType.ATTRACTIONS, "theme-park", "fa-"), CONGRESS_AND_EXHIBITON_CENTER(24, MainType.ATTRACTIONS, "congress-and-exhibition-center", "fa-"),
	//26
	NOTSET(0, MainType.NOTSET, "notset", "fa-");

	private final int id;
	private final MainType mainType;
	private final String slug;
	private final String icon;

	private PlaceType(int id, MainType mainType, String slug, String icon) {
		this.id = id;
		this.mainType = mainType;
		this.slug = slug;
		this.icon = icon;
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
	
	public String getIcon() {
		return icon;
	}
}
