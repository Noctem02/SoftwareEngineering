package co.edu.poli.prototype3.model;

import java.util.HashMap;
import java.util.Map;

public class ItemStore {
	
	private static Map<String, Item> productMap;
	
	public ItemStore() {
		productMap = new HashMap<String, Item>();
	}
	
	public void addProduct (String s, Item p) {
		productMap.put(s, p);
	}

	public Item getProduct (String s) {
		return (Item) productMap.get(s).cloneObj();
		
	}

}
