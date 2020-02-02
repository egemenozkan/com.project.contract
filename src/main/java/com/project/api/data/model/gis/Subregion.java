package com.project.api.data.model.gis;

import java.io.Serializable;

public class Subregion implements Serializable {

	private static final long serialVersionUID = -5064152456966562040L;
	
	private int id;
	private String code;
	private String name;
	private Region region;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

}
