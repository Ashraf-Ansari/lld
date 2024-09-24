package com.example.lld.Database;

import java.util.HashMap;
import java.util.Map;

public class Database {
    Map<String,Table> tables ;
    
    public Database() {
        this.tables = new HashMap<>();
    }
    
    void createTable(Table table) {
        if(tables.containsKey(table.getName())){
            throw new RuntimeException(table.getName()+" Already exists");
        }
        tables.put(table.getName(),table);
    }
    
    public Table getTable(String tableName){
        return tables.get(tableName);
    }
}
