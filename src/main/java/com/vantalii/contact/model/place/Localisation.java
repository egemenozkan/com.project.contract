package com.vantalii.contact.model.place;

import java.io.Serializable;

import com.birprojedaha.common.enums.Language;

public class Localisation implements Serializable {

	private static final long serialVersionUID = -39811926631306143L;
	
	private String name;
	private Language language;
	private String slug;
	
	public Localisation(String name, Language language, String slug) {
		this.name = name;
		this.language = language;
		this.slug = slug;
	}
	public Localisation() {
		
	}
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
