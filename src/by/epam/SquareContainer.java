package by.epam;

import java.util.HashMap;

public class SquareContainer extends StraightContainer {
	
	private Liquid bucket;
	public HashMap liquids;
	private double baseSquare;
	private String name;

	SquareContainer (double a) {
		
		this.baseSquare = computeSquare(a);
		
	}
	
	public double getSquare() {
		
		 return baseSquare;
		
	}
	private double computeSquare(double a) {
		
		return a * a;
		
	}
}
