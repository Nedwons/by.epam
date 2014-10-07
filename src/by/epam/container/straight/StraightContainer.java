package by.epam.container.straight;

import by.epam.filledcontainer.Container;

public abstract class StraightContainer extends Container {
	
	public void setVolumeSquare(double baseSquare) {
		
		super.setVolume(CONTAINER_HIGHT * baseSquare);
		
	}

	public abstract double getSquare();
}
