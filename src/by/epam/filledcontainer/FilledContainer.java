package by.epam.filledcontainer;

import java.util.HashMap;

import by.epam.container.straight.CircleStraightContainer;
import by.epam.container.straight.EllipseStraightContainer;
import by.epam.container.straight.HexagonStraightContainer;
import by.epam.container.straight.RectangleStraightContainer;
import by.epam.container.straight.SquareStraightContainer;
import by.epam.container.straight.TrapezoidStraightContainer;

public class FilledContainer {
	private String containerType;
	private String name;
	private String baseType;
	private double [] parameters;
	
	Container container;
	public Liquid liquid;
	
	public FilledContainer(String name,String containerType, String baseType , HashMap<String, Double> liquids, double... parameters ) {
		
		this.parameters = parameters;
		this.name = name;
		this.containerType = containerType;
		this.baseType = baseType;		
		
		if( containerType.equalsIgnoreCase("straitght") ) {
			
			if ( baseType.equalsIgnoreCase("square")  ) {
				
				this.container = new SquareStraightContainer(parameters[0]);
				
			}
			if ( baseType.equalsIgnoreCase("rectangle")  ) {
				
				this.container = new RectangleStraightContainer(parameters[0],parameters[1]);
				
			}
			if ( baseType.equalsIgnoreCase("trapezoid")  ) {

				this.container = new TrapezoidStraightContainer(parameters[0], parameters[1], parameters[2]);
				
			}
			
			if ( baseType.equalsIgnoreCase("hexagon")  ) {

				this.container = new HexagonStraightContainer(parameters[0]);
				
			}
			
			if ( baseType.equalsIgnoreCase("circle")  ) {

				this.container = new CircleStraightContainer(parameters[0]);
				
			}
			
			if ( baseType.equalsIgnoreCase("ellipse")  ) {

				this.container = new EllipseStraightContainer(parameters[0], parameters[1] );
				
			}
		}
		
		
		
		this.liquid = new Liquid( name, liquids, container.getVolume() );
		
	}
	
	public String getName() {
		
		return this.name;
		
	}
	
	public void printInfo() {
		
		System.out.printf("| %-12s | %-17s | %-17s | %-14.0f | %-14.0f | %-14d |", name, containerType, baseType, 
				liquid.getMass(), container.getVolume(), this.container.CONTAINER_HIGHT );
		
		switch (parameters.length) {
		
			case 1 :  System.out.printf("a = %-17.0f |\n",parameters[0]);
				break;
		
			case 2: System.out.printf("a = %-6.0f b = %-6.0f |\n",parameters[0] ,parameters[1]);
				break;
			
			case 3: System.out.printf("a = %-2.0f b = %-2.0f h = %-3.0f |\n",parameters[0] ,parameters[1], parameters[2]);
				break;	

		}
	}
}
