package by.epam.container.incline;

import by.epam.filledcontainer.Container;

public abstract class InclineContainer extends Container {
	
	public void setVolumeSquare(double baseSquare) {
		
		super.setVolume( (baseSquare + Math.sqrt(baseSquare * 1.1* baseSquare) + 1.1* baseSquare) * CONTAINER_HIGHT / 3);
		
	}
	
	public abstract double getSquare();
}
