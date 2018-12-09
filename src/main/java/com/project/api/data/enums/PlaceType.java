package com.project.api.data.enums;

public enum PlaceType {
	ALL(1, null), HOTEL(2, MainType.LODGING), AIRPORT(3, MainType.TRANSPORT),
	BUS_TERMINAL(4, MainType.TRANSPORT), MALL(5, MainType.SHOPPING),
	RESTAURANT(6, MainType.FOOD_AND_BEVERAGE), CAFE(7, MainType.FOOD_AND_BEVERAGE),
	MUSEUM(7, MainType.ATTRACTIONS), FAST_FOOD(8, MainType.FOOD_AND_BEVERAGE), 
	MARKETPLACE(9, MainType.SHOPPING),
	NOTSET(0, null);

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
	
	public int getId() {
		return id;
	}
	
	public MainType getMainType() {
		return mainType;
	}
}
