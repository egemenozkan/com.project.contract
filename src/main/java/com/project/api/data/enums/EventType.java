package com.project.api.data.enums;

public enum EventType {
	ALL(1), CONCERT(2), NOTSET(0),;

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
