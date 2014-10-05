package by.epam;

import java.util.HashMap;

public class FilledContainer {
	
	private String name;
	Container container;
	Liquid liquid;
	private double a;

	FilledContainer(String name, double a ,double b, HashMap<String, Double> liquids ) {
		
		this.a = a;
		this.name = name;
		this.container = new SquareStraightContainer(a);
		
		this.liquid = new Liquid( name, liquids, container.getVolume() );
		
	}
	
	public String getName() {
		
		return this.name;
		
	}
	
	public void printInfo() {
		
		System.out.printf("| %-12s | %-16.0f | %-7.0f | %-7.0f |", name, a, liquid.getMass(), container.getVolume() );
		System.out.println(" ");
		
	}
}
