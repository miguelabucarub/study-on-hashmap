package com.abucarub.miguel.study_on_hashmap;

import java.util.Hashtable;
import java.util.Map;

/**
 * A simple class that demonstrate a HashTable use The HashTable class
 * 
 * implements a hash table and maps keys to values. However, neither the key nor
 * the value can be null. This class contains two fundamental parameters:
 * initial capacity and performance, with the same definitions as the HashMap
 * class. (From javacodegeeks.com)
 * 
 * @author miguel.abucarub.neto
 * @Date 2020-10-06 Note: Here, in this implementation of hash table neither the
 *       key nor the value can be null!!
 */
public class HashTableExample {

	public static void main(String[] args) {

		Map<String, Double> book = new Hashtable<>();
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

        // The next statements throw a NullPointerException, if uncommented.
         book.put("IRBR3", null);
        // vehicles.put(null, 6);
	}

}
