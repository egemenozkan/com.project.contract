package com.project.api.data.model.autocomplete;

import java.io.Serializable;

import com.project.api.data.enums.ProductType;
import com.project.common.enums.Language;

public class AutocompleteRequest implements Serializable {

	private static final long serialVersionUID = -2669612280355926476L;

	private String query;
	private Language language;
	private ProductType productType;
	private int cityId;
	private int regionId;
	private int districtId;

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

}
