package com.project.api.data.enums;

public enum LandingPageType {
	PLACE(1), EVENT(2), NOTSET(0);
	
	private final int id;
    private LandingPageType(int id) {
        this.id = id;
    }
    
    public static LandingPageType getById(int id) {
	    	for (LandingPageType type : LandingPageType.values()) {
	           if (type.id == id) {
	        	  return type;
	           }
	        }
	    	return LandingPageType.NOTSET;
    }
    
    public int getId() {
	return this.id;
    }
}
