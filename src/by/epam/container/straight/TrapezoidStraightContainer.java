package by.epam.container.straight;

public class TrapezoidStraightContainer extends StraightContainer {

	private double baseSquare;
	
	public TrapezoidStraightContainer (double a, double b, double h ) {
		
		this.baseSquare = computeSquare(a, b, h );
		setVolumeSquare(getSquare());
		
	}
	
	@Override
	public double getSquare() {
		
		return baseSquare;
		
	}
	
	private double computeSquare(double a, double b, double h) {
		
		return (a + b) * h / 2;
		
	}
	

}
