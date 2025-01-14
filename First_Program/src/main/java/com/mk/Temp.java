/*
 * package com.mk;
 * 
 * import java.util.HashMap;
 * 
 * public class Temp {
 * 
 * public static void main(String[] args) { HashMap<String,String> map = new
 * HashMap<String,String>(); map.put("subbu","Value1");
 * map.put("madhu","Value2"); map.put("balu", "Value1");
 * map.values().stream().sorted().forEach(System.out::println); }
 * 
 * }
 */
package com.mk;

import java.util.HashMap;
import java.util.Map;

import lombok.Data;

@Data
public class Temp {
	private int age;

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("subbu", "Value1");
		map.put("madhu", "Value2");
		map.put("balu", "Value1");

		// Sort the entries by value and print key-value pairs
		map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
	}
}
