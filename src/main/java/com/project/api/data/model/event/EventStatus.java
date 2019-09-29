package com.project.api.data.model.event;


public enum EventStatus {

		ALL(1), PAST(2), ACTIVE(3), NOTSET(0);

		private final int id;

		private EventStatus(int id) {
			this.id = id;
		}

		public static EventStatus getById(int id) {
			for (EventStatus type : EventStatus.values()) {
				if (type.id == id) {
					return type;
				}
			}
			return EventStatus.NOTSET;
		}
		
		public int getId() {
			return id;
		}
	}
