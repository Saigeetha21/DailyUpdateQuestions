package com.cg.day19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Fruit{
	public static void main(String[] args) {
		// Creating a hashmap with one key and multiple values using lists
        Map<String, List<String>> myHashMap = new HashMap<>();
        // Adding values to the hashmap
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        myHashMap.put("fruit", fruits);
        // Accessing values using the key
        List<String> fruitValues = myHashMap.get("fruit");
        System.out.println("Fruits: " + fruitValues);
   

}

}