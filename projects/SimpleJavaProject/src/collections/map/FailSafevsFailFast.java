package collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafevsFailFast {

	public static void main(String[] args) {

		//Fail Safe
		concurrentHashMap();
		//Fail Fast
		hashMap();
	}

	private static void hashMap() {
		Map<String, String> conMap = new HashMap<String, String>();

		conMap.put("1", "Test");
		conMap.put("2", "Two");
		conMap.put("3", "Three");

		Iterator<String> iterator = conMap.keySet().iterator();

		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key);
			conMap.put("4", "Four");
		}
	}

	private static void concurrentHashMap() {
		Map<String, String> conMap = new ConcurrentHashMap<String, String>();

		conMap.put("1", "Test");
		conMap.put("2", "Two");
		conMap.put("3", "Three");

		Iterator<String> iterator = conMap.keySet().iterator();

		while (iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(key);
			conMap.put("4", "Four");
		}
	}

}
