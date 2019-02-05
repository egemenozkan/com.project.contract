package com.project.api.data.enums;

public enum EventPeriodType {
	ALL(1), WEEKDAYS(2), WEEKENDS(3), FRIDAYS_AND_SATURDAYS(4),
	MONDAYS(11), TUESDAYS(12), WEDNESDAYS(13), THURSDAYS(14), FRIDAYS(15), SATURDAYS(16), SUNDAYS(17),
	UNORDINARY(21), ONEDAY(22),
	NOTSET(0);

	private final int id;

	private EventPeriodType(int id) {
		this.id = id;
	}

	public static EventPeriodType getById(int id) {
		for (EventPeriodType type : EventPeriodType.values()) {
			if (type.id == id) {
				return type;
			}
		}
		return EventPeriodType.NOTSET;
	}
	
	public int getId() {
		return id;
	}
}
