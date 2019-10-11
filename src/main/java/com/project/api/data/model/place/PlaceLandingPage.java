package com.project.api.data.model.place;

import java.io.Serializable;
import java.util.List;

import com.project.api.data.enums.Language;
import com.project.api.data.model.common.Content;

public class PlaceLandingPage implements Serializable {

	private static final long serialVersionUID = 9056090986462784786L;

	private long id;
	private String title;
	private String keywords;
	private String description;
	private String slug;
	private List<Content> contents;
	private Language language;
	private Place place;

	public String getUrl() {
		StringBuilder strBuilder = new StringBuilder("/");
		if (this.language == Language.RUSSIAN) {
			strBuilder.append("places/").append(this.slug);
		} else {
			strBuilder.append(this.language.toString().toLowerCase()).append("/places/").append(this.slug);
		}

		return strBuilder.toString();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Content> getContents() {
		return contents;
	}

	public void setContents(List<Content> contents) {
		this.contents = contents;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public Place getPlace() {
		return place;
	}

	public void setPlace(Place place) {
		this.place = place;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

}
