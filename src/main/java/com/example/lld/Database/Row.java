package com.example.lld.Database;

import java.util.Map;

public class Row {
    
    Map<String,Object> data;
    public Row(Map<String, Object> data) {
        this.data = data;
    }
    
    void update(Map<String,Object> data){
        this.data.putAll(data);
    }
    
    public Map<String, Object> getData() {
        return data;
    }
    
    public boolean matches(Map<String,Object> conditions){
        for(Map.Entry<String, Object> key :conditions.entrySet()){
            if(!data.get(key.getKey()).equals(conditions.get(key.getKey()))){
                return false;
            }
        }
        return true;
    }
}
