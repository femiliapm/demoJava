package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

public class MapTesting {
	public void map() {
		HashMap<String, String> hari = new HashMap<>();
		hari.put("satu", "Senin");
		hari.put("dua", "selasa");
		hari.put("tiga", "rabu");
		hari.put("empat", "kamis");
		hari.put("tiga", "selasa");
		hari.put("lima", "minggu");
		hari.put("enam", "sabtu");
		hari.put("lima", "jumat");

		System.out.println(hari);

//		System.out.println(hari.get(5));

//		List<String> list = new ArrayList<>();
//		list.addAll(hari.values());
		for (String s : hari.keySet()) {
			System.out.println("Key: " + s + "\tValue: " + hari.get(s));
		}
	}
	
	public void linkhm() {
		LinkedHashMap<String, String> hari = new LinkedHashMap<>();
		hari.put("satu", "Senin");
		hari.put("dua", "selasa");
		hari.put("tiga", "rabu");
		hari.put("empat", "kamis");
		hari.put("tiga", "selasa");
		hari.put("lima", "minggu");
		hari.put("enam", "sabtu");
		hari.put("lima", "jumat");
		
		System.out.println(hari);
	}
	
	public void treemap() {
		TreeMap<String, String> hari = new TreeMap<>();
		hari.put("satu", "Senin");
		hari.put("dua", "selasa");
		hari.put("tiga", "rabu");
		hari.put("empat", "kamis");
		hari.put("tiga", "selasa");
		hari.put("lima", "minggu");
		hari.put("enam", "sabtu");
		hari.put("lima", "jumat");
		
		System.out.println(hari);
	}

	public static void main(String[] args) {
		MapTesting mt = new MapTesting();
		mt.map();
		System.out.println();
		mt.linkhm();
		System.out.println();
		mt.treemap();
	}
}
