package by.epam;

import java.util.HashMap;

public class Run {

	public static void main(String[] args) {
		HashMap<String, Double> liquids = new HashMap();
		liquids.put("Benzene",new Double (740));
		liquids.put("Kerosine",new Double (820));
		liquids.put("Oil",new Double (910));
		
		FilledContainer filledContainer = new FilledContainer("Kerosine", 20, liquids);
		filledContainer.printInfo();
		
		//Liquid map = new Liquid("Benzene", liquids,10 );
		//Container kon = new SquareContainer(10); 
		//System.out.println("Масса ="+map.getMass());
		//System.out.println("Объем ="+kon.getVolume());
	
	}
}
