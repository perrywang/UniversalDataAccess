package org.thingkinghub.uds.core;

import java.util.List;

public interface ObjectDescriptor {
    
    void addField(String name, DataType type);
    
    List<FieldDescriptor> getFields();

    boolean hasField(String name);
    
    Tenant getTentant();
}
