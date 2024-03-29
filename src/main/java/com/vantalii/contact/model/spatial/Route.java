package com.vantalii.contact.model.spatial;

import java.io.Serializable;
import java.util.List;

public class Route implements Serializable {

	private static final long serialVersionUID = 7214927559041140074L;
	private int id;
	private String name;
	private Point startPoint;
	private Point endPoint;
	private List<TimePoint> stopPoints;

	public Route() {

	}

	public Route(Point startPoint, Point endPoint) {
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}

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

	public Point getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(Point startPoint) {
		this.startPoint = startPoint;
	}

	public Point getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(Point endPoint) {
		this.endPoint = endPoint;
	}

	public List<TimePoint> getStopPoints() {
		return stopPoints;
	}

	public void setStopPoints(List<TimePoint> stopPoints) {
		this.stopPoints = stopPoints;
	}

}
