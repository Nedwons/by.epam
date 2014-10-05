package by.epam;

import java.util.*;

public class Run {

	public static void main(String[] args) {

		LinkedList<FilledContainer> list = new LinkedList<FilledContainer>();
		HashMap<String, Double> liquids = new HashMap();
		
		liquids.put("Benzene",new Double (740));
		liquids.put("Kerosine",new Double (820));
		liquids.put("Oil",new Double (910));
// инициализация 
		list.add(new FilledContainer("Benzene", 3, 0, liquids));
		list.add(new FilledContainer("Kerosine", 20, 0, liquids));
		list.add(new FilledContainer("Oil", 30, 0, liquids));
		list.add(new FilledContainer("Kerosine", 5, 0, liquids));
		list.add(new FilledContainer("Benzene", 4, 0, liquids));
// сортировка		
		Collections.sort(list, new FilledContainerMassComparator());
		
		System.out.println("Вывод набора емкостей (полный состав атрибутов) и их содержимого:\n");
		System.out.println("| Тип жидкости | сторона квадрата |  Масса  |  Объем  |");
		for( FilledContainer a : list ) {
			
			a.printInfo();
			
		}
// поиск емксоти с наименьшей массой		
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
			
			System.out.println("\n Нет емкости с бензином");
			
		} else {
			
			System.out.println("\n \n Параметры емкости с наименьшей массой бензина, залитого в емкость:\n");
			System.out.println("| Тип жидкости | сторона квадрата |  Масса  |  Объем  |");
			minBenzeneMassReference.printInfo();
			
		}
	}
}
