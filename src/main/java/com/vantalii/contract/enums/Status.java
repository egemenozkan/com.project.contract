package com.vantalii.contract.enums;

public enum Status {
	ALL(1), PENDING(2), APPROVED(3), BANNED(4), NOTSET(0);

	private final int id;

	private Status(int id) {
		this.id = id;
	}

	public static Status getById(int id) {
		for (Status type : Status.values()) {
			if (type.id == id) {
				return type;
			}
		}
		return Status.NOTSET;
	}

	public int getId() {
		return id;
	}
}
