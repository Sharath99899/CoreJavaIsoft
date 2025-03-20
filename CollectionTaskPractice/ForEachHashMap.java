package com.CollectionTaskPractice;

import java.util.HashMap;

public class ForEachHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        // Iterating over key-value pairs
        for (var entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
      
        }
    
        
      
    }
}
