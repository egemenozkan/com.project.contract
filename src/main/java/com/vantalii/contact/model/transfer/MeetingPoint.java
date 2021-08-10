/**
 * 
 */
package com.vantalii.contact.model.transfer;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.vantalii.contact.model.spatial.Point;

/**
 * @author egemen
 *
 */
public class MeetingPoint implements Serializable {

	private Point point;
	private LocalDateTime meetingDateTime;

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public LocalDateTime getMeetingDateTime() {
		return meetingDateTime;
	}

	public void setMeetingDateTime(LocalDateTime meetingDateTime) {
		this.meetingDateTime = meetingDateTime;
	}

}
