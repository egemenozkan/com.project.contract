package com.project.api.data.utils;

import java.util.List;

public class MyBatisUtils {

	static public String inStatement(List<String> ids) {
		
		if (ids != null && !ids.isEmpty()) {
			StringBuilder strBuilder = new StringBuilder();
			strBuilder.append("IN (");
			strBuilder.append(String.join(",", ids));
			strBuilder.append(")");
			
			return strBuilder.toString();
		}

		return "";		
	}
	
}
