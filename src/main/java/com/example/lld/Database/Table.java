package com.example.lld.Database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Table {
    String name;
    Map<String,Column> columns;
    List<Row> rows ;
    String primaryKey=null;
    Map<Object,Row> indexedRow;
    
    public Table(String name, Map<String, Column> columns) {
        this.name = name;
        this.columns = columns;
        this.rows=new ArrayList<>();
        this.indexedRow=new HashMap<>();
        for(Column c:columns.values()){
            if(c.isPrimaryKey()){
                if(primaryKey!=null){
                    throw new RuntimeException("Primary key already exists");
                }
                primaryKey = c.name;
            }
        }
    }
    
    public void insert(Map<String,Object> data){
        if(indexedRow.containsKey(data.get(primaryKey))){
            throw new RuntimeException("Row Already exists with this value");
        }
        Row row = new Row(data);
        rows.add(row);
        if(primaryKey!=null){
            indexedRow.put(data.get(primaryKey),row);
        }
    }
    
    public void delete(Map<String, Object> conditions){
        rows.removeIf(i->i.matches(conditions));
    }
    
    public List<Row> query(Map<String,Object> condition){
        return rows.stream().filter(i->i.matches(condition)).toList();
    }
    
    public void update(Map<String,Object> condition,Map<String,Object> newData){
        rows.stream().filter(i->i.matches(condition)).forEach(i->i.update(newData));
    }
    
    public String getName() {
        return name;
    }
    
}
