package com.example.lld.LRU.DoubleLinkList;

public class Node {
    String key;
    String value;
    Node prev;
    Node next;

    Node(String key,String value){
        this.key=key;
        this.value=value;
        this.prev=null;
        this.next=null;
    }
}
