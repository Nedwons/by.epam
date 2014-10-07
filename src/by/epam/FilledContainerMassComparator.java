package by.epam;

import java.util.Comparator;

import by.epam.container.FilledContainer;

public class FilledContainerMassComparator implements Comparator<FilledContainer> {

	@Override
	public int compare(FilledContainer a, FilledContainer b) {
		
		return (int) (b.liquid.getMass() - a.liquid.getMass());
	}
	
}
