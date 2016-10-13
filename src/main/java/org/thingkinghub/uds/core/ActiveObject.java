package org.thingkinghub.uds.core;

public interface ActiveObject {
    
    ObjectDescriptor getObjectDescriptor();
    
    void setField(String fieldName, Object value);
    
    Object getField(String fieldName);
}
