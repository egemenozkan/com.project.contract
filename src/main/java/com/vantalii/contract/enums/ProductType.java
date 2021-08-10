package com.vantalii.contract.enums;

public enum ProductType {
	PLACE(1), EVENT(2), NOTSET(0);

	private final int id;

	private ProductType(int id) {
		this.id = id;
	}

	public static ProductType getById(int id) {
		for (ProductType type : ProductType.values()) {
			if (type.id == id) {
				return type;
			}
		}
		return ProductType.NOTSET;
	}

	public int getId() {
		return this.id;
	}
}
