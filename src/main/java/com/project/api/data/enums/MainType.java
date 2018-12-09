package com.project.api.data.enums;

public enum MainType {
	ALL(1), LODGING(2), TRANSPORT(3), SHOPPING(4), FOOD_AND_BEVERAGE(5), ATTRACTIONS(6), NOTSET(0);

	private final int id;

	private MainType(int id) {
		this.id = id;
	}

	public static MainType getById(int id) {
		for (MainType type : MainType.values()) {
			if (type.id == id) {
				return type;
			}
		}
		return MainType.NOTSET;
	}
	
	public int getId() {
		return id;
	}
}
