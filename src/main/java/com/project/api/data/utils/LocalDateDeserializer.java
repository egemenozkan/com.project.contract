package com.project.api.data.utils;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class LocalDateDeserializer extends StdDeserializer<LocalDate> {

	private static final long serialVersionUID = 4956786412652154920L;
	private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");
	private static final DateTimeFormatter FORMATTER_ISO = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	protected LocalDateDeserializer() {
		super(LocalDate.class);
	}

	@Override
	public LocalDate deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		String dateText = jp.getText();
		if (dateText != null && !dateText.isEmpty()) {
			try {
				if (dateText.indexOf('-') != -1) {
					return LocalDate.parse(jp.getText(), FORMATTER_ISO);
				} else {
					return LocalDate.parse(jp.getText(), FORMATTER);
				}

			} catch (Exception e) {
				System.out.println(e);
				throw e;
			}
		} else {
			return null;
		}
	}

}
