package com.project.api.data.model.event;

import java.time.LocalDate;

import com.project.api.data.enums.EventPeriodType;
import com.project.api.data.enums.EventType;
import com.project.api.data.enums.Language;

public class EventRequest {
	private long id;
	private EventType type;
	private EventPeriodType periodType;
	private long placeId;
	private LocalDate startDate;
	private LocalDate endDate;
	private Language language;
	private int limit;
	private Boolean random;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EventType getType() {
		return type;
	}

	public void setType(EventType type) {
		this.type = type;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public long getPlaceId() {
		return placeId;
	}

	public void setPlaceId(long placeId) {
		this.placeId = placeId;
	}

	public EventPeriodType getPeriodType() {
		return periodType;
	}

	public void setPeriodType(EventPeriodType periodType) {
		this.periodType = periodType;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public Boolean getRandom() {
		return random;
	}

	public void setRandom(Boolean random) {
		this.random = random;
	}

}
