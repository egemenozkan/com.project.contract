package com.project.api.data.enums;

public enum MainType {
	ALL(1, "", false), LODGING(2, "lodging", false), TRANSPORT(3, "transport", false), SHOPPING(4, "shopping", true),
	FOOD_AND_BEVERAGE(5, "food-and-beverage", true), ATTRACTIONS(6, "attractions", true), HEALTH(7, "health", false),
	ENTERTAINMENT(8, "entertainment", false), PUBLIC_ENTERPRISE(9, "public-enterprise", false),
	NIGHT_LIFE(10, "night-life", true), NOTSET(0, "", false);

	private final int id;
	private final String slug;
	private final boolean showInPopulars;

	private MainType(int id, String slug, boolean showInPopulars) {
		this.id = id;
		this.slug = slug;
		this.showInPopulars = showInPopulars;
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

	public boolean isShowInPopulars() {
		return showInPopulars;
	}
}
