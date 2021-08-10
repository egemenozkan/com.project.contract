package com.vantalii.contract.enums;

public enum ContactFormType {
	SUGGESTION(1), NEW_CONTENT(2), NOTSET(0);

	private final int id;

	private ContactFormType(int id) {
		this.id = id;
	}

	public static ContactFormType getById(int id) {
		for (ContactFormType type : ContactFormType.values()) {
			if (type.id == id) {
				return type;
			}
		}
		return ContactFormType.NOTSET;
	}

	public int getId() {
		return this.id;
	}
}
