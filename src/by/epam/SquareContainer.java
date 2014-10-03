package by.epam;

import java.util.HashMap;

public class SquareContainer extends StraightContainer {
	
	private Liquid bucket;
	public HashMap liquids;
	private double baseSquare;
	private String name;

	SquareContainer (String name, double a, HashMap<String, Double> liquids) {
		
		this.name = name;
		this.liquids = liquids;
		this.baseSquare = a * a;
		
		bucket = new Liquid(name, this.liquids, getVolume());
	}
	
	public double getSquare() {
		
		 return baseSquare;
		
	}
}
