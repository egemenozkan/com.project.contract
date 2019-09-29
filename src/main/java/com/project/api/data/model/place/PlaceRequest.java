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
	private boolean hideAddress;
	private boolean hideContact;
	private boolean hideContent;
	private boolean hideImages;
	private boolean hideMainImage;
	private boolean hideTimeTable;

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

	public boolean isHideAddress() {
		return hideAddress;
	}

	public void setHideAddress(boolean hideAddress) {
		this.hideAddress = hideAddress;
	}

	public boolean isHideContact() {
		return hideContact;
	}

	public void setHideContact(boolean hideContact) {
		this.hideContact = hideContact;
	}

	public boolean isHideContent() {
		return hideContent;
	}

	public void setHideContent(boolean hideContent) {
		this.hideContent = hideContent;
	}

	public boolean isHideImages() {
		return hideImages;
	}

	public void setHideImages(boolean hideImages) {
		this.hideImages = hideImages;
	}

	public boolean isHideMainImage() {
		return hideMainImage;
	}

	public void setHideMainImage(boolean hideMainImage) {
		this.hideMainImage = hideMainImage;
	}

	public boolean isHideTimeTable() {
		return hideTimeTable;
	}

	public void setHideTimeTable(boolean hideTimeTable) {
		this.hideTimeTable = hideTimeTable;
	}


}
