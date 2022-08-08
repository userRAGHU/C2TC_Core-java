package day_22;

import java.util.HashMap;

public class Main1 {

	public static void main(String[] args) {
	 HashMap<String, Double> bike = new HashMap<String, Double>();
		bike.put("Gixxer", 155.5);
		bike.put("Royal Enfield", 350.00);
		bike.put("KTM RC 390", 373.5);
		bike.put("RE Himalayan", 410.00);
		System.out.println(bike.keySet());
		System.out.println(bike.entrySet());
	}

}
