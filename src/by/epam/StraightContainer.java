package by.epam;

public class StraightContainer extends Container {
	
	private double volume;
	public void setVolume(double baseSquare) {
		
		this.volume = CONTAINER_HIGHT * baseSquare;
		
	}
	
	public double getVolume() {
		
		 return this.volume;
		
	}
	
}
