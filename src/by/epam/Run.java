package by.epam;

import java.util.*;

import by.epam.filledcontainer.FilledContainer;

public class Run {

	public static void main(String[] args) {

		LinkedList<FilledContainer> list = new LinkedList<FilledContainer>();
		HashMap<String, Double> liquids = new HashMap();
		
		liquids.put("Benzene",new Double (740));
		liquids.put("Kerosine",new Double (820));
		liquids.put("Oil",new Double (910));
// ������������� 
		list.add(new FilledContainer("Benzene", "straitght", "square", liquids, 10));
		list.add(new FilledContainer("Benzene", "straitght", "rectangle", liquids,7 , 6));
		list.add(new FilledContainer("Oil", "straitght", "trapezoid", liquids, 5, 4, 12));
		list.add(new FilledContainer("Kerosine", "straitght", "trapezoid", liquids, 1, 2, 3));
		list.add(new FilledContainer("Benzene", "straitght", "hexagon", liquids, 4));
		list.add(new FilledContainer("Benzene", "straitght", "circle", liquids, 7));
		list.add(new FilledContainer("Benzene", "straitght", "ellipse", liquids, 2, 1));
// ����������		
		Collections.sort(list, new FilledContainerMassComparator());
		
		System.out.println("����� ������ �������� (������ ������ ���������) � �� �����������:\n");
		System.out.println("| ��� �������� | ��� ������ ������ |  ����� ���������  | ����� �������� | ����� �������� | ������ ������� |  ��������� ��������� |");
		for( FilledContainer a : list ) {
			
			a.printInfo();
			
		}
// ����� ������� � ���������� ������	
		System.out.println("\n ������� � ���������� ������ �������:");
		double minBenzeneMass = 0;
		Boolean flag = true;
		FilledContainer minBenzeneMassReference = null;
		for( FilledContainer a : list ) {
			
			if( a.getName().equals( "Benzene")) {
				
				if ( (a.liquid.getMass() < minBenzeneMass) || flag) {
					
					minBenzeneMass = a.liquid.getMass();
					minBenzeneMassReference = a;
					if ( flag ) {
						flag = false;
					}
				}
			}
		}
		if ( minBenzeneMassReference == null ) {
			
			System.out.println("\n ��� ������� � ��������");
			
		} else {
			
			System.out.println("| ��� �������� | ��� ������ ������ |  ����� ���������  |"
					+ " ����� �������� | ����� �������� | ������ ������� |  ��������� ��������� |");
			minBenzeneMassReference.printInfo();
			
		}
	}
}
