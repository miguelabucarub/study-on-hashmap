package com.abucarub.miguel.study_on_hashmap;

import java.util.Map;
import java.util.TreeMap;

/**
 * A simple class to demonstrate TreeMap use
 * 
 * The TreeMap is a Red-Black tree implementation that is sorted according to
 * the natural ordering of its keys, or by a Comparator provided at the creation
 * time. Also, this class maintains an order on its elements. Finally, this
 * class in not synchronized and thus, if an application uses multiple threads,
 * the map must be synchronized externally. (From javacodegeeks.com)
 * 
 * @author miguel.abucarub.neto
 * @Date 2020-10-06
 */
public class TreeMapExample {

	public static void main(String[] args) {

		Map<String, Double> book = new TreeMap<>();
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

		System.out.println("Highest key: " + ((TreeMap) book).lastKey());
		System.out.println("Lowest key: " + ((TreeMap) book).firstKey());

		System.out.println("\nPrinting all values:");

		for (Double val : book.values())
			System.out.println(val);
		System.out.println();

		// Clear all values.
		book.clear();

		// Equals to zero.
		System.out.println("After clear operation, size: " + book.size());

	}

}
