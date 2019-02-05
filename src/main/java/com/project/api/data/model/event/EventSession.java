package com.project.api.data.model.event;

import java.time.LocalDateTime;

public class EventSession {
	private long id;
	private long eventId;
	private LocalDateTime sessionDateTime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getEventId() {
		return eventId;
	}

	public void setEventId(long eventId) {
		this.eventId = eventId;
	}

	public LocalDateTime getSessionDateTime() {
		return sessionDateTime;
	}

	public void setSessionDateTime(LocalDateTime sessionDateTime) {
		this.sessionDateTime = sessionDateTime;
	}

}
