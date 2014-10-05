package by.epam;

import java.util.Comparator;

public class FilledContainerMassComparator implements Comparator<FilledContainer> {

	@Override
	public int compare(FilledContainer a, FilledContainer b) {
		
		return (int) (b.liquid.getMass() - a.liquid.getMass());
	}
	
}
