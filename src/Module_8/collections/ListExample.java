package collections;

import java.util.*;

public class ListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Создание и наполнение списка

		List list = new ArrayList(); // "сырой" список
		
		//добавление элементов
		list.add("one");
		list.add("second");
		list.add("3rd");
		list.add(new Integer(4));
		list.add(new Float(5.0F));
		list.add("second");
		list.add(new Integer(4));
		int i = 32500;
		list.add(i); // так называемый "in-boxing", то есть заворачивание в тип оболочку
		System.out.println(list); // распечатка содержимого стандартными средствами
		
		//итерация по всем элементам списка с помощью итератора
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next(); // из коллекции извлекаются обезличенные объекты
			//распечатываем содержимое каждого объекта и извлекаем информацию о типе
			System.out.println(object.toString() + " \t" + object.getClass().getName());
		}
		
		String zero = (String) list.get(0); //извлечение элемента из списка по индексу
		
		
	}
}
