package org.thingkinghub.uds.service;

import org.thingkinghub.uds.core.DataType;
import org.thingkinghub.uds.core.FieldDescriptor;
import org.thingkinghub.uds.core.IndexDescriptor;
import org.thingkinghub.uds.core.ObjectDescriptor;

public interface SchemaService {
    
    ObjectDescriptor createObject(String name);
    
    FieldDescriptor addField(Object object, String fieldName, DataType dataType);
    
    IndexDescriptor createIndex(FieldDescriptor field);
}
