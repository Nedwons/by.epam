package by.epam;

import java.util.HashMap;

public class Run {

	public static void main(String[] args) {
		HashMap<String, Double> liquids = new HashMap();
		liquids.put("Benzene",new Double (740));
		liquids.put("Kerosine",new Double (820));
		liquids.put("Oil",new Double (910));
		
		Liquid map = new Liquid("Benzene", liquids,10 );
		System.out.println("Масса ="+map.getMass());
	
		//Liquid(String name, HashMap<String, Double> liquids, double volume
	}
}
