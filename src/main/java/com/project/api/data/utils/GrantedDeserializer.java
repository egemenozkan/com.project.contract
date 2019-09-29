package com.project.api.data.utils;

import java.io.IOException;
import java.time.LocalTime;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class GrantedDeserializer extends StdDeserializer<List<GrantedAuthority>> {

	private static final long serialVersionUID = 4956786412652154920L;
	static final Logger LOG = LoggerFactory.getLogger(GrantedDeserializer.class);

	protected GrantedDeserializer() {
		super(LocalTime.class);
	}

	@Override
	public List<GrantedAuthority> deserialize(JsonParser jp, DeserializationContext ctxt)
			throws IOException {
		if (jp != null) {
			try {
				return jp.readValueAs(List.class);
			} catch (Exception e) {
				LOG.error("{}", e);
				throw e;
			}
		} else {
			return null;
		}
	}

}
