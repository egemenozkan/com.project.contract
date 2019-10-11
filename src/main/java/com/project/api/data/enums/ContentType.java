package com.project.api.data.enums;

public enum ContentType {
	ALL(1), CONTENT(2), NOTSET(0),;

	private final int id;

	private ContentType(int id) {
		this.id = id;
	}

	public static ContentType getById(int id) {
		for (ContentType type : ContentType.values()) {
			if (type.id == id) {
				return type;
			}
		}
		return ContentType.NOTSET;
	}
	
	public int getId() {
		return id;
	}
}
