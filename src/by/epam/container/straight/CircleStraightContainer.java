package by.epam.container.straight;

public class CircleStraightContainer extends StraightContainer {

	private double baseSquare;
	
	public CircleStraightContainer (double r) {
		
		this.baseSquare = computeSquare(r);
		setVolumeSquare(getSquare());
		
	}
	
	@Override
	public double getSquare() {
		
		return baseSquare;
	}
	
	private double computeSquare(double r) {
		
		return Math.PI * r * r;
		
	}

}
