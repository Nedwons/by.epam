package by.epam;

import java.util.HashMap;

public class FilledContainer {
	
	public String name;
	Container container;
	Liquid liquid;
	public double a;
	
	FilledContainer(String name, double a ,HashMap<String, Double> liquids ) {
		
		this.a = a;
		this.name = name;
		this.container = new SquareContainer(a);
		this.liquid = new Liquid(name,liquids,container.getVolume());
		
	}
	
	public void printInfo() {
		
		System.out.println("Тип жидкости "+name);
		System.out.println("сторона квадрата "+a);
		System.out.println("Масса ="+liquid.getMass());
		System.out.println("Объем ="+container.getVolume());
		
	}
}
