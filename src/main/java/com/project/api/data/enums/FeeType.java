package com.project.api.data.enums;

public enum FeeType {
	ALL(1), FREE(2), CONDITIONAL_FREE(3), ENTRY_FEE(4), ENTRY_FEE_AND_PAID_FACILITIES(5),  NO_ENTRY_FEE_AND_PAID_FACILITIES(6), NOTSET(0);

	private final int id;

	private FeeType(int id) {
		this.id = id;
	}

	public static FeeType getById(int id) {
		for (FeeType type : FeeType.values()) {
			if (type.id == id) {
				return type;
			}
		}
		return FeeType.NOTSET;
	}

	public int getId() {
		return id;
	}
}
