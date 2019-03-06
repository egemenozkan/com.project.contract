package com.project.api.data.model.place;

import com.project.api.data.enums.Language;
import com.project.api.data.enums.MainType;
import com.project.api.data.enums.PlaceType;

public class PlaceRequest {
	private long id;
	private PlaceType type;
	private MainType mainType;
	private Language language;
	private int limit;
	private Boolean random;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public PlaceType getType() {
		return type;
	}

	public void setType(PlaceType type) {
		this.type = type;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public MainType getMainType() {
		return mainType;
	}

	public void setMainType(MainType mainType) {
		this.mainType = mainType;
	}

	public int getLimit() {
		return limit;
	}

	public Boolean getRandom() {
		return random;
	}

	public void setRandom(Boolean random) {
		this.random = random;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

}
