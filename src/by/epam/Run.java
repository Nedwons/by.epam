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
		list.add(new FilledContainer("Benzene", "straitght", "square",10 , 0, liquids));
		list.add(new FilledContainer("Benzene", "straitght", "rectangle",7 , 6, liquids));
		
// сортировка		
		Collections.sort(list, new FilledContainerMassComparator());
		
		System.out.println("Вывод набора емкостей (полный состав атрибутов) и их содержимого:\n");
		System.out.println("| Тип жидкости | Тип стенки сосуда |  Форма основания  |  Параметры основания | Масса жидкости | Объем жидкости | Высота емкости |");
		for( FilledContainer a : list ) {
			
			a.printInfo();
			
		}
// поиск емксоти с наименьшей массой	
		System.out.println("\n Емкость с наименьшей массой бензина:");
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
			
			System.out.println("| Тип жидкости | Тип стенки сосуда |  Форма основания  |  Параметры основания | Масса жидкости | Объем жидкости | Высота емкости |");
			minBenzeneMassReference.printInfo();
			
		}
	}
}
