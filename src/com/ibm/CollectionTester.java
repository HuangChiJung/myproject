package com.ibm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionTester {

	public static void main(String[] args) {
		//bag1();

		//bagGeneric();
		
		//baghashset();
		
		hashMap();
		
		TreeSet<Integer> nums = new TreeSet<>();
		
		nums.add(12);
		nums.add(22);
		nums.add(52);
		nums.add(72);
		nums.add(12);
		
		System.out.println(nums);
		
		TreeMap<String, String> stocks = new TreeMap<>();
		stocks.put("2330", "台積電");
		stocks.put("2454", "聯發科");
		stocks.put("2317", "鴻海");
		stocks.put("2454", "xxxx");
		
		System.out.println(stocks);
		System.out.println(stocks.size());
	}

	private static void hashMap() {
		HashMap<String, String> stocks = new HashMap<>();
		
		stocks.put("2330", "台積電");
		stocks.put("2454", "聯發科");
		stocks.put("2317", "鴻海");
		stocks.put("2454", "xxxx");
		System.out.println(stocks.containsKey("2330")); 
		System.out.println(stocks);
		System.out.println(stocks.size());
		
		HashMap<Integer, Float> temps = new HashMap<>();
		
		temps.put(1, 28.6f);
		temps.put(2, 29.1f);
		temps.put(3, 24.3f);
		System.out.println(temps);	
		System.out.println(temps.get(2));
		 
		System.out.println(temps.get(5));
	}

	private static void baghashset() {
		HashSet<Integer> set = new HashSet<>();
		
		set.add(5);
		set.add(99);
		set.add(34);
		set.add(867);
	
		//set.add(5);
		System.out.println(set);
		
		Iterator<Integer> it = set.iterator();
		int sum= 0;
		while(it.hasNext()){
			int n = it.next();   // auto-unboxing
			sum = sum+n;
		}
		System.out.println(sum);
	}

	private static void bagGeneric() {
		ArrayList<String> bag = new ArrayList<>();
		
		bag.add("abc");
		bag.add("78546");
		bag.add("xyz");
		bag.add(0, "555");
		String s1 = bag.get(1);
		System.out.println(s1);
		System.out.println(bag.get(0));
	}

	private static void bag1() {
		ArrayList bag = new ArrayList();
		
		bag.add("abc");
		bag.add(new Integer(5));
		bag.add(6);   //autoboxing
		bag.add(new Double(3.6));
		bag.add(7.5);
		bag.add(new Boolean(true));
		bag.add("xyz");
		
		System.out.println(bag.get(1));
		
		String s1 = (String)bag.get(1);
	}

}
