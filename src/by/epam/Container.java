package by.epam;

public abstract class Container {
	
	public static final int CONTAINER_HIGHT = 10;
	
	private double volume;
	public void setVolume(double volume) {
		
		this.volume = volume;
		
	}
	
	public double getVolume() {
		
		 return this.volume;
		
	}
}
