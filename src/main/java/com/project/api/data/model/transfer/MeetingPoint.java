/**
 * 
 */
package com.project.api.data.model.transfer;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.project.api.data.model.spatial.Point;

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
