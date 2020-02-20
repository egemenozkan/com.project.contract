package com.project.api.data.model.spatial;

import java.io.Serializable;
import java.util.List;

public class Route implements Serializable {

	private static final long serialVersionUID = 7214927559041140074L;
	private Point startPoint;
	private Point endPoint;
	private List<Point> stopPoints;

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

	public List<Point> getStopPoints() {
		return stopPoints;
	}

	public void setStopPoints(List<Point> stopPoints) {
		this.stopPoints = stopPoints;
	}

}
