package by.epam;

import java.util.HashMap;

public class Liquid {

	private String name;
	private double density;
	private double volume;
	private double mass;
	HashMap<String, Double> liquids;
	
	public Liquid(String name, HashMap<String, Double> liquids, double volume) {
		
		this.name = name;
		this.liquids = liquids;
		this.volume = volume;
		this.density = (double) liquids.get( name );
		this.mass = computeMass(density, volume);
	
	}
	private double computeMass(double density, double volume) {
		
		return density * volume;
		
	}
	
	public double getMass() {
		
		return this.mass;
		
	}
	
	public double getVolume() {
		
		return this.volume;
		
	}
	
	public double getDensity() {
		
		return this.density;
		
	}
	
	public String getName() {
		
		return this.name;
		
	}

}
