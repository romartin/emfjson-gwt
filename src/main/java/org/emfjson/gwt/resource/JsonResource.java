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
package org.emfjson.gwt.resource;

import org.eclipse.emf.common.util.URI;
import org.emfjson.gwt.map.JsonMapper;
import org.emfjson.gwt.map.Mapper;

/**
 * Resource implementation meant to be used on the client side of a
 * GWT application.
 *
 * @author ghillairet
 * @since 0.4.0
 */
public class JsonResource extends MapperResource {

	public JsonResource(URI uri) {
		super(uri);
	}

	@Override
	protected Mapper getMapper() {
		return new JsonMapper();
	}
}
