package com.vantalii.contract.enums;

public enum PeriodType {
	ALL(1), WEEKDAYS(2), WEEKENDS(3), FRIDAYS_AND_SATURDAYS(4),
	MONDAYS(11), TUESDAYS(12), WEDNESDAYS(13), THURSDAYS(14), FRIDAYS(15), SATURDAYS(16), SUNDAYS(17),
	UNORDINARY(21), 
	ONEDAY(31),
	NOTSET(0);

	private final int id;

	private PeriodType(int id) {
		this.id = id;
	}

	public static PeriodType getById(int id) {
		for (PeriodType type : PeriodType.values()) {
			if (type.id == id) {
				return type;
			}
		}
		return PeriodType.NOTSET;
	}
	
	public int getId() {
		return id;
	}
}
