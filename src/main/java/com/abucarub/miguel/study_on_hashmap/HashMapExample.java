package com.abucarub.miguel.study_on_hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * A simple class to demonstrate a HashMap data structure in Java
 * 
 * The most common class that implements the Map interface is the Java HashMap.
 * A HashMap is a hash table based implementation of the Map interface. It
 * permits null keys and values. Also, this class does not maintain any order
 * among its elements and especially, it does not guarantee that the order will
 * remain constant over time. Finally, a HashMap contains two fundamental
 * parameters: initial capacity and performance. The capacity is defined as the
 * number of buckets in the hash table, while the load factor is a measure that
 * indicates the maximum value the hash table can reach, before being
 * automatically increased. (From javacodegeeks.com)
 * 
 * @author miguel.abucarub.neto
 * @Date 2020-10-06
 */
public class HashMapExample {
	public static void main(String[] args) {
	
		Map<String, Double> book = new HashMap<>();
		book.put("PETR4", 20.3);
		book.put("PETR4", 20.3);
		book.put("PETR4", 20.3);
		book.put("PETR4", 20.3);
		book.put("VVAR3", 17.87);
		book.put("BBDC4", 19.92);
		book.put("BBDC4", 19.92);
		book.put("OIBR3", 1.70);
		book.put("OIBR3", 1.70);

		System.out.println("Book -> total itens : " + book.size());

		// Iterate in book
		for (String key : book.keySet()) {
			System.out.println(key + " - " + book.get(key));
		}
		System.out.println();

		String searchKey = "PETR4";
		if (book.containsKey(searchKey)) {
			System.out.println("Found total " + book.get(searchKey) + " " + searchKey + " Stock Options!\n");
		}

		// Clear all values.
		book.clear();

		// Equals to zero.
		System.out.println("After clear operation, size: " + book.size());

	}
}
