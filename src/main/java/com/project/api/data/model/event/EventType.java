package com.project.api.data.model.event;

public enum EventType {
	ALL(1), CONCERT(2), DANCE_AND_BALLET(3), OPERA(4), MUSICALS(5), THEATER(6), LIVE_MUSIC(7), ATHLETICS(8), BASKETBALL(9),
	GOLF(10), SOCCER(11), EXHIBITIONS(12), FESTIVALS(13), VISITOR_ATTRACTIONS(14), TRANSPORT(15), MUSEUMS(16), 
	FAMILY_SHOWS(17), SHOPPING(18), DISCOUNTS(19), EXCURSIONS(20), STAND_UP(21), CINEMA(22), NOTSET(0);

	private final int id;

	private EventType(int id) {
		this.id = id;
	}

	public static EventType getById(int id) {
		for (EventType type : EventType.values()) {
			if (type.id == id) {
				return type;
			}
		}
		return EventType.NOTSET;
	}

	public int getId() {
		return id;
	}
}
