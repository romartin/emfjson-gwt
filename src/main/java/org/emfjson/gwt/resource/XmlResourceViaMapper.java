package org.emfjson.gwt.resource;

import org.eclipse.emf.common.util.URI;
import org.emfjson.gwt.map.Mapper;
import org.emfjson.gwt.map.XmlMapper;

public class XmlResourceViaMapper extends MapperResource {

    public XmlResourceViaMapper(URI uri) {
        super(uri);
    }

    @Override
    protected Mapper getMapper() {
        return new XmlMapper();
    }
}
