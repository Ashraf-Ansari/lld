package com.example.lld.LRU.DoubleLinkList;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    int capacity;
    Map<String,Node> cache;
    Node head;
    Node tail;

    LRUCache(int capacity){
        this.capacity=capacity;
        this.cache=new HashMap<>();
        this.head = new Node("","");
        this.tail = new Node("","");
        this.head.next=this.tail;
        this.tail.prev=this.head;
    }

    void set(String key,String value){
        if(cache.containsKey(key)){
            Node oldNode = cache.get(key);
            remove(oldNode);
        }
        Node node = new Node(key,value);
        cache.put(key,node);
        add(node);
        if(cache.size()>capacity){
            Node deletedNode = cache.get(tail.prev.key);
            remove(deletedNode);
            cache.remove(deletedNode.key);
        }
    }

    public String get(String key){
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            remove(node);
            add(node);
            return node.value;
        }
        else return null;
    }

    private void add(Node node) {
        Node nextNode = this.head.next;
        this.head.next=node;
        node.next=nextNode;
        nextNode.prev=node;
        node.prev=head;
    }

    private void remove(Node oldNode) {
        Node prevNode = oldNode.prev;
        Node nextNode = oldNode.next;
        prevNode.next=nextNode;
        nextNode.prev=prevNode;
    }
}
