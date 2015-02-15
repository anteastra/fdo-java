public class ArrayPrint {

	public static void main(String[] args) {

		int intOne[] = { 0, 1, 2, 3, 4, 5 }; // инициализируем intOne
		int intTwo[];
		
		intTwo = intOne; // присваиваем одну ссылку другой		
		
		printArr(intOne, "intOne"); //печать массива intOne
		printArr(intTwo, "intTwo"); // печать intTwo для проверки
		
		intTwo[0] = -1; //меням значения вроде бы для intTwo
		intTwo[1] = -2;
		intTwo[2] = -3;
		intTwo[3] = -4;
		intTwo[4] = -5;
		intTwo[5] = -6;
		
		printArr(intOne, "intOne"); // повторяем печать intOne
		
		
		printArr(intTwo, "intTwo"); // печать intTwo для проверки

	}

	static void printArr(int[] arr, String nameArr) {
		System.out.println("Печать массива "+ nameArr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(nameArr+"[" + i + "] = " + arr[i]);
		}
		System.out.println(); // пустая строка в конце
	}

}
