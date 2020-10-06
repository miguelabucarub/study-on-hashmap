package com.abucarub.miguel.study_on_hashmap;

import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * A simple class to demonstrate a ConcurrentHashMap
 * 
 * The class is a hash table that supports full concurrency of retrievals. Thus,
 * this structure is safe to use in case of multiple threads. Finally, this
 * class does not allow neither keys nor values to be null. (From javacodegeeks.com)
 * 
 * @author miguel.abucarub.neto
 * @Date 2020-10-06
 */
public class ConcurrentHashMapExample {

	public static void main(String[] args) {

		Map<String, Double> book = new ConcurrentHashMap<>();
		book.put("PETR4", 20.3);
		book.put("PETR4", 20.3);
		book.put("PETR4", 20.3);
		book.put("PETR4", 20.3);
		book.put("VVAR3", 17.87);
		book.put("BBDC4", 19.92);
		book.put("BBDC4", 19.92);
		book.put("OIBR3", 1.70);
		book.put("OIBR3", 1.70);

		// Iterate over all vehicles, using the keySet method.
		for (String key : book.keySet())
			System.out.println(key + " - " + book.get(key));

		System.out.println();

		String searchKey = "BBDC4";
		if (book.containsKey(searchKey))
			System.out.println("Found total " + book.get(searchKey) + " " + searchKey + " Stock Options!\n");

		Enumeration<Integer> elems = ((ConcurrentHashMap) book).elements();
		while (elems.hasMoreElements())
			System.out.println(elems.nextElement());
		System.out.println();

		Double val = book.putIfAbsent("OIBR3", 9.2);
		if (val != null)
			System.out.println("OIBR3 was found in the map and its value was updated!");

		val = book.putIfAbsent("VALE3", 59.59);
		if (val == null)
			System.out.println("VVAR3 wasn't found in map, thus a new pair was created!");
		System.out.println();

		// The next statements throw a NullPointerException, if uncommented.
		// book.put("VVAR3", null);
		// book.put(null, 6);

		// Clear all values.
		book.clear();

		// Equals to zero.
		System.out.println("After clear operation, size: " + book.size());

	}

}
