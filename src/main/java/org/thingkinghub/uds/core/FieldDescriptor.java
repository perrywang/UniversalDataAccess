package org.thingkinghub.uds.core;

public interface FieldDescriptor {
     
    ObjectDescriptor getObjectDescriptor();
    
    String getName();
     
    DataType getDataType();
    
    int getSequence();
    
    default boolean indexed() {return false;}
    
    Object getDetail();
}
