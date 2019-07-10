/*
 * Copyright (c) 2015 Guillaume Hillairet.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Guillaume Hillairet - initial API and implementation
 *
 */
package org.emfjson.gwt.map;

import java.util.Map;

import com.google.gwt.json.client.JSONValue;
import org.eclipse.emf.common.util.Callback;
import org.eclipse.emf.ecore.resource.Resource;
import org.emfjson.gwt.common.Options;

import static com.google.gwt.json.client.JSONParser.parseStrict;

public class JsonMapper extends AbstractMapper {

	@Override
	public void parse(Resource resource, String content, Map<?, ?> options, Callback<Resource> callback) {
		parse(resource, parseStrict(content), options, callback);
	}

	@Override
	public String write(Resource resource, Map<?, ?> options) {
		JSONValue json = writeToJSON(resource, options);
		String value = json.toString();
		return value;
	}

	public void parse(Resource resource, JSONValue value, Map<?, ?> options, Callback<Resource> callback) {
		if (resource == null || value == null || callback == null) return;

		final JsonReader reader = new JsonReader(resource, Options.from(options));
		reader.parse(value, callback);
	}

	public JSONValue writeToJSON(Resource resource, Map<?, ?> options) {
		if (resource == null) return null;

		final JsonWriter writer = new JsonWriter(resource, Options.from(options));
		return writer.toValue();
	}

}
