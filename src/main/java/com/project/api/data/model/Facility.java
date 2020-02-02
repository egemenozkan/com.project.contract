package com.project.api.data.model;

import java.io.Serializable;
import java.util.Map;

import com.project.api.data.model.place.Localisation;

public class Facility implements Serializable {

	private static final long serialVersionUID = 2122537065035613294L;

	private String id;
	private String code;
	private Map<String, Localisation> localisation;
	private String icon;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Map<String, Localisation> getLocalisation() {
		return localisation;
	}

	public void setLocalisation(Map<String, Localisation> localisation) {
		this.localisation = localisation;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

}
