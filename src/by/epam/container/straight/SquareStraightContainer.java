package by.epam.container.straight;


public class SquareStraightContainer extends StraightContainer {
	
	private double baseSquare;

	public SquareStraightContainer (double a) {
		
		this.baseSquare = computeSquare(a);
		setVolumeSquare(getSquare());
		
	}
	
	public double getSquare() {
		
		 return baseSquare;
		
	}
	
	private double computeSquare(double a) {
		
		return a * a;
		
	}
}
