package com.project.api.data.utils;

import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class LocalTimeDeserializer extends StdDeserializer<LocalTime> {

	private static final long serialVersionUID = 4956786412652154920L;
	static final Logger LOG = LoggerFactory.getLogger(LocalTimeDeserializer.class);

	protected LocalTimeDeserializer() {
		super(LocalTime.class);
	}

	@Override
	public LocalTime deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException {
		if (jp != null && jp.getText() != null && !jp.getText().isEmpty()) {
			try {
				return LocalTime.parse(jp.getText(), DateTimeFormatter.ofPattern("HH:mm"));
			} catch (Exception e) {
				LOG.error("{}", e);
				throw e;
			}
		} else {
			return null;
		}
	}

}
