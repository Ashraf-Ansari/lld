package com.example.lld.Database;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    
    public static void main(String[] args) {
        try {
            Database database = new Database();
            Map<String, Column> columns = new HashMap<>();
            Column c1 = new Column("id", true);
            Column c2 = new Column("name", false);
            Column c3 = new Column("roll", false);
            columns.put(c1.getName(), c1);
            columns.put(c2.getName(), c2);
            columns.put(c3.getName(), c3);
            database.createTable(new Table("collection", columns));
            System.out.println(database.tables.keySet());
            Table table = database.getTable("collection");
            Map<String, Object> row1 = new HashMap<>();
            Map<String, Object> row2 = new HashMap<>();
            row1.put("id",1);
            row2.put("id",2);
            table.insert(row1);
            table.insert(row2);
            table.delete(row2);
            table.query(new HashMap<>()).forEach(i-> System.out.println(i.getData()));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
