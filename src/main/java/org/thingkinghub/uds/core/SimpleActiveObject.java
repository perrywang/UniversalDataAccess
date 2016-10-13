package org.thingkinghub.uds.core;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SimpleActiveObject implements ActiveObject, Map<String, Object>{
    
    private Map<String,Object> map;
    
    private ObjectDescriptor objectDescriptor;

    public SimpleActiveObject(Map<String,Object> m) {
        if (m == null) {
            throw new NullPointerException();
        }
        this.map = m;
    }

    public SimpleActiveObject() {
        this(new HashMap<String,Object>());
    }
    
    public Object put(String name, Object value) {
        return map.put(name,value);
    }

    public void putAll(Map<? extends String, ? extends Object> toMerge) {
        if (toMerge == null) {
            throw new NullPointerException("toMerge map is null");
        }
        for (Map.Entry<? extends String, ? extends Object> entry : toMerge.entrySet()) {
            String key = entry.getKey();
            put(key, entry.getValue());
        }
    }

    public void clear() {
        map.clear();
    }

    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    public boolean containsValue(Object value) {
        return map.containsValue(value);
    }

    public Set<Map.Entry<String, Object>> entrySet() {
        return map.entrySet();
    }
    
    @Override
    public Object get(Object key) {
        return map.get(key);
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public Set<String> keySet() {
        return map.keySet();
    }

    public Object remove(Object key) {
        return map.remove(key);
    }

    public int size() {
        return map.size();
    }

    public Collection<Object> values() {
        return map.values();
    }

    public void setField(String fieldName, Object value) {
        put(fieldName, value);
    }

    public Object getField(String fieldName) {
        return get(fieldName);
    }

    @Override
    public ObjectDescriptor getObjectDescriptor() {
        return objectDescriptor;
    }

    public  void setObjectDescriptor(ObjectDescriptor objectDescriptor) {
        this.objectDescriptor = objectDescriptor;
    }
}
