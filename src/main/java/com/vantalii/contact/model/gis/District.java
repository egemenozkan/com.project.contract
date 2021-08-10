package com.vantalii.contact.model.gis;

import java.io.Serializable;

public class District implements Serializable
{

	private static final long serialVersionUID = 8801457752761987305L;
	
	private int id;
	private String code;
	private String name;
	private City city;
	private int order;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}
	
	
}
