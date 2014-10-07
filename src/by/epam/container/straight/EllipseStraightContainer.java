package by.epam.container.straight;

public class EllipseStraightContainer extends StraightContainer {

	private double baseSquare;
	
	public EllipseStraightContainer (double a, double b) {
		
		this.baseSquare = computeSquare(a,b);
		setVolumeSquare(getSquare());
		
	}
	
	@Override
	public double getSquare() {
		
		return baseSquare;
	}
	
	private double computeSquare(double a, double b) {
		
		return Math.PI * a * b;
		
	}

}
