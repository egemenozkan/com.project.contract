package com.project.api.data.model.transfer;

import java.io.Serializable;
import java.util.Set;

import com.project.api.data.model.common.Person;

public class Passenger extends Person implements Serializable {

	private static final long serialVersionUID = -1090382307775517010L;
	
	
	/**
	 * inRoutes: Passenger travels in which routes
	 */
	private Set<Long> inRoutes;

	public Set<Long> getInRoutes() {
		return inRoutes;
	}

	public void setInRoutes(Set<Long> inRoutes) {
		this.inRoutes = inRoutes;
	}
	
}
