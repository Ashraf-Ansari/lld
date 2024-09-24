package com.example.lld.Database;

public class Column {
    String name;
    boolean primaryKey;
    
    public Column(String name, boolean primaryKey) {
        this.name = name;
        this.primaryKey = primaryKey;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public boolean isPrimaryKey() {
        return primaryKey;
    }
    
    public void setPrimaryKey(boolean primaryKey) {
        this.primaryKey = primaryKey;
    }
}
