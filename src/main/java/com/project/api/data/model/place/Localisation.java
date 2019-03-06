package com.project.api.data.model.place;

import java.io.Serializable;

import com.project.api.data.enums.Language;

public class Localisation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -39811926631306143L;
	
	private String name;
	private Language language;
	private String slug;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

}
