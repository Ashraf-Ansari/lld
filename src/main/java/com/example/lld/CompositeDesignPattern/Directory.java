package com.example.lld.CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    
    List<FileSystem> files;
    String name;
    
    Directory(String name){
        this.files=new ArrayList<>();
        this.name=name;
    }
    
    void add(FileSystem file){
        files.add(file);
    }
    
    @Override public void ls() {
        System.out.println("directory name "+name);
        for(FileSystem data:files){
            data.ls();
        }
    }
}
