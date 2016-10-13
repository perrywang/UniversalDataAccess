package org.thingkinghub.uds.service;

import org.thingkinghub.uds.core.ActiveObject;

public interface DataService {
    
    ActiveObject create(ActiveObject object);
    
    ActiveObject save(ActiveObject object);
    
    boolean delete(ActiveObject object);
}
