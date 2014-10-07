package by.epam.container.straight;

public class HexagonStraightContainer extends StraightContainer {
	
	private double baseSquare;
	
	public HexagonStraightContainer (double a) {
		
		this.baseSquare = computeSquare(a);
		setVolumeSquare(getSquare());
		
	}
	
	@Override
	public double getSquare() {
		
		return baseSquare;
		
	}

	private double computeSquare(double a) {
		
		return a * a * Math.sqrt(27) / 2;
		
	}
}
