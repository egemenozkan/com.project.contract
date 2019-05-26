package com.project.api.data.enums;

public enum MainType {
	ALL(1), LODGING(2), TRANSPORT(3), SHOPPING(4), FOOD_AND_BEVERAGE(5), ATTRACTIONS(6), HEALTH(7), ENTERTAINMENT(8), PUBLIC_ENTERPRISE(
			9), NOTSET(0);

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

	public static MainType getBySlug(String slug) {
		for (MainType type : MainType.values()) {
			if (type.toString().toLowerCase().replaceAll("_", "-").equalsIgnoreCase(slug)) {
				return type;
			}
		}
		return MainType.NOTSET;
	}

	public int getId() {
		return id;
	}
}
