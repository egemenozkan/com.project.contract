package com.project.api.data.enums;

public enum MainType {
	ALL(1, "all"), LODGING(2, "lodging"), TRANSPORT(3, "transport"), SHOPPING(4, "shopping"),
	FOOD_AND_BEVERAGE(5, "food-and-beverage"), ATTRACTIONS(6, "attractions"), HEALTH(7, "health"),
	ENTERTAINMENT(8, "entertainment"), PUBLIC_ENTERPRISE(9, "public-enterprise"), NOTSET(0, "notset");

	private final int id;
	private final String slug;

	private MainType(int id, String slug) {
		this.id = id;
		this.slug = slug;
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
			if (type.getSlug().equalsIgnoreCase(slug)) {
				return type;
			}
		}
		return MainType.NOTSET;
	}

	public int getId() {
		return id;
	}

	public String getSlug() {
		return slug;
	}
}
