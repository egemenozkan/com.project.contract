package com.project.api.data.model.event;

import java.io.Serializable;
import java.util.List;

import com.project.api.data.enums.Language;
import com.project.api.data.model.common.Content;

public class EventLandingPage implements Serializable {

	private static final long serialVersionUID = 2517340320654743895L;
	
	/** **/
	
	private long id;
	private String title;
	private String keywords;
	private String description;
	private String slug;
	private List<Content> contents;
	private Language language;
	private Event event;

	public String getUrl() {
		StringBuilder strBuilder = new StringBuilder("/");
		if (this.language == Language.RUSSIAN) {
			strBuilder.append("events/").append(this.slug);
		} else {
			strBuilder.append(this.language.toString().toLowerCase()).append("/events/").append(this.slug);
		}
		if (this.event != null && this.event.getTimeTableId() > 0) {
			strBuilder.append("?tmid=").append(event.getTimeTableId());
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

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

}
