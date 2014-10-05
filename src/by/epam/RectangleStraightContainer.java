package by.epam;

public class RectangleStraightContainer extends StraightContainer {
	
	private double baseSquare;
	
	@Override
	public double getSquare() {
		
		return baseSquare;
		
	}
	
	RectangleStraightContainer (double a, double b ) {
		
		this.baseSquare = computeSquare(a, b );
		setVolumeSquare(getSquare());
		
	}
	
	private double computeSquare(double a, double b) {
		
		return a * b;
		
	}
	

}
