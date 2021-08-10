package com.vantalii.contact.model.event;

public enum EventType {
	ALL(1, ""), CONCERT(2, "concert"), DANCE_AND_BALLET(3, "dance-and-ballet"), OPERA(4, "opera"),
	MUSICALS(5, "musicals"), THEATER(6, "theater"), LIVE_MUSIC(7, "life-music"), ATHLETICS(8, "atheletics"),
	BASKETBALL(9, "basketball"), GOLF(10, "golf"), SOCCER(11, "soccer"), EXHIBITIONS(12, "exhibitions"),
	FESTIVALS(13, "festivals"), VISITOR_ATTRACTIONS(14, "visitor-attractions"), TRANSPORT(15, "transport"),
	MUSEUMS(16, "museums"), FAMILY_SHOWS(17, "family-shows"), SHOPPING(18, "shopping"), DISCOUNTS(19, "discounts"),
	EXCURSIONS(20, "excursions"), STAND_UP(21, "stand-up"), CINEMA(22, "cinema"), NOTSET(0, "");

	private final int id;
	private final String slug;

	private EventType(int id, String slug) {
		this.id = id;
		this.slug = slug;
	}

	public static EventType getById(int id) {
		for (EventType type : EventType.values()) {
			if (type.id == id) {
				return type;
			}
		}
		return EventType.NOTSET;
	}
	
	public static EventType getBySlug(String slug) {
		for (EventType type : EventType.values()) {
			if (type.getSlug().equalsIgnoreCase(slug)) {
				return type;
			}
		}
		return EventType.NOTSET;
	}

	public int getId() {
		return id;
	}

	public String getSlug() {
		return slug;
	}
}
