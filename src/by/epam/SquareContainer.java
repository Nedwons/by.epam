package by.epam;

public class SquareContainer extends StraightContainer {
	
	private double baseSquare;

	SquareContainer (double a) {
		
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
