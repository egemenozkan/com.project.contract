package com.project.api.data.model.autocomplete;

import java.io.Serializable;

import com.project.api.data.enums.Language;

public class AutocompleteRequest implements Serializable {

	private static final long serialVersionUID = -2669612280355926476L;
	
	String query;
	Language language;

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

}
