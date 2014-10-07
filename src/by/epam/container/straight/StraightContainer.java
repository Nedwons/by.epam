package by.epam.container.straight;

import by.epam.Container;

public abstract class StraightContainer extends Container {
	
	public void setVolumeSquare(double baseSquare) {
		
		super.setVolume(CONTAINER_HIGHT * baseSquare);
		
	}

	abstract double getSquare();
}
