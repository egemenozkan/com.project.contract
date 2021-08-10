package com.vantalii.contact.model.event;

import java.time.LocalDate;

import com.birprojedaha.common.enums.Language;
import com.vantalii.contract.enums.PeriodType;

public class EventRequest {
	private long id;
	private EventType type;
	private PeriodType periodType;
	private long placeId;
	private LocalDate startDate;
	private LocalDate endDate;
	private Language language;
	private int limit;
	private Boolean random;
	private String[] types = new String[0];
	private Boolean distinct;
	private long timeTableId;
	private EventStatus status;
	private String name;
	private String[] districts =  new String[0];
	private String[] regions = new String[0];
	private boolean hidePlace;

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

	public PeriodType getPeriodType() {
		return periodType;
	}

	public void setPeriodType(PeriodType periodType) {
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

	public String[] getTypes() {
		return types;
	}

	public void setTypes(String[] types) {
		this.types = types;
	}

	public Boolean getDistinct() {
		return distinct;
	}

	public void setDistinct(Boolean distinct) {
		this.distinct = distinct;
	}

	public long getTimeTableId() {
		return timeTableId;
	}

	public void setTimeTableId(long timeTableId) {
		this.timeTableId = timeTableId;
	}

	public EventStatus getStatus() {
		return status;
	}

	public void setStatus(EventStatus status) {
		this.status = status;
	}

	public boolean isHidePlace() {
		return hidePlace;
	}

	public void setHidePlace(boolean hidePlace) {
		this.hidePlace = hidePlace;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getDistricts() {
		return districts;
	}

	public void setDistricts(String[] districts) {
		this.districts = districts;
	}

	public String[] getRegions() {
		return regions;
	}

	public void setRegions(String[] regions) {
		this.regions = regions;
	}

}
