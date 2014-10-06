package by.epam;

public class RectangleStraightContainer extends StraightContainer {
	
	private double baseSquare;
	
	RectangleStraightContainer (double a, double b ) {
		
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
