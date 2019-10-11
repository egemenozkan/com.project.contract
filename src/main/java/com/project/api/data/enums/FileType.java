package com.project.api.data.enums;

public enum FileType {
	ALL(1), IMAGE(2),  NOTSET(0),;

	private final int id;

	private FileType(int id) {
		this.id = id;
	}

	public static FileType getById(int id) {
		for (FileType type : FileType.values()) {
			if (type.id == id) {
				return type;
			}
		}
		return FileType.NOTSET;
	}
	
	public int getId() {
		return id;
	}
}