/**
 * 
 */
package com.vantalii.contact.model.spatial;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author egemen
 *
 */
public class TimePoint implements Serializable {
	private static final long serialVersionUID = 4098986742194480661L;

	private Point point;
	private LocalDateTime time;

	private String note;

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}
