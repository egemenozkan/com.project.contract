package com.project.api.data.model.autocomplete;

import java.io.Serializable;

import com.project.api.data.enums.Language;
import com.project.api.data.enums.ProductType;

public class Item implements Serializable {

	private static final long serialVersionUID = -890111125410033922L;

	private long id;
	private String label;
	private String url;
	private ProductType productType;
	private Language language;
	private String type;


	public Item() {

	}
	public Item(String label, String url) {
		this.label = label;
		this.url = url;
	}


	public Item(long id, String label, String url, ProductType productType) {
		this.id = id;
		this.label = label;
		this.url = url;
		this.productType = productType;
	}

	public Item(long id, String label, String url, ProductType productType, Language language) {
		this.id = id;
		this.label = label;
		this.url = url;
		this.productType = productType;
		this.setLanguage(language);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
