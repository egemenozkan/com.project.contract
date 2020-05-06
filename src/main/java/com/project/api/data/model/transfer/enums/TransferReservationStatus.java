/**
 * 
 */
package com.project.api.data.model.transfer.enums;

/**
 * @author egemen
 *
 */
public enum TransferReservationStatus {

	INIT(1), CANCELLED(3),  DONE(9);
	
	/**
	 * @param i
	 */
	TransferReservationStatus(int i) {
		// TODO Auto-generated constructor stub
	}

	private int id;	
}
