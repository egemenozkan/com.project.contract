package com.vantalii.contact.model.common;

import java.io.Serializable;

import com.birprojedaha.common.enums.Language;
import com.vantalii.contract.enums.ContentType;

public class Content implements Serializable {
	
	private static final long serialVersionUID = -2817146583114746877L;
	
	private int id;
	private String title;
	private String description;
	private String keywords;
	private String text;
	private ContentType type;
	private int order;
	private Language language;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public ContentType getType() {
		return type;
	}

	public void setType(ContentType type) {
		this.type = type;
	}
	
	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

}
