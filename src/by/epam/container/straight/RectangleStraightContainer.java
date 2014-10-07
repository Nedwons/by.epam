package by.epam.container.straight;

public class RectangleStraightContainer extends StraightContainer {
	
	private double baseSquare;
	
	public RectangleStraightContainer (double a, double b ) {
		
		this.baseSquare = computeSquare(a, b );
		setVolumeSquare(getSquare());
		
	}
	
	@Override
	public double getSquare() {
		
		return baseSquare;
		
	}
	
	private double computeSquare(double a, double b) {
		
		return a * b;
		
	}
	

}
