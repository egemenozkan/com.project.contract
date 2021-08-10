package com.vantalii.contact.model.place;

import com.birprojedaha.common.enums.Language;
import com.vantalii.contract.enums.MainType;
import com.vantalii.contract.enums.PlaceType;

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
	private String[] types;
	private int cityId;
	private String[] districts;
	private String[] regions;
	private String name;

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

	public String[] getTypes() {
		return types;
	}

	public void setTypes(String[] types) {
		this.types = types;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getRegions() {
		return regions;
	}

	public void setRegions(String[] regions) {
		this.regions = regions;
	}

	public String[] getDistricts() {
		return districts;
	}

	public void setDistricts(String[] districts) {
		this.districts = districts;
	}


}
