package by.epam;

import java.util.HashMap;

public class FilledContainer {
	private String containerType;
	private String name;
	private String baseType;
	private double a;
	private double b;
	
	Container container;
	Liquid liquid;
	
	FilledContainer(String name,String containerType, String baseType, double a ,double b, HashMap<String, Double> liquids ) {
		
		this.a = a;
		this.b = b;
		this.name = name;
		
		if( containerType.equalsIgnoreCase("straitght") ) {
			
			if ( baseType.equalsIgnoreCase("square")  ) {
				
				this.container = new SquareStraightContainer(a);
				
			}
			if ( baseType.equalsIgnoreCase("rectangle")  ) {
				
				this.container = new RectangleStraightContainer(a,b);
				
			}
			
		}
		
		this.liquid = new Liquid( name, liquids, container.getVolume() );
		
	}
	
	public String getName() {
		
		return this.name;
		
	}
	
	public void printInfo() {
		
		System.out.printf("| %-14s | %-19.0s | %-19.0fs |a(r) = %-3.2f b = %-3.2f | %-3.2f | %-3.2f |", name, containerType, baseType, a, b, 
				liquid.getMass(), container.getVolume(), this.container.CONTAINER_HIGHT );
		System.out.println(" ");
		
	}
}
