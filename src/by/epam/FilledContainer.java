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
		this.containerType = containerType;
		this.baseType = baseType;
		
		
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
		
		System.out.printf("| %-12s | %-17s | %-17s |a(r) = %-5.0f b = %-4.0f | %-14.0f | %-14.0f | %-14d |", name, containerType, baseType, a, b, 
				liquid.getMass(), container.getVolume(), this.container.CONTAINER_HIGHT );
		System.out.println(" ");
		
	}
}
