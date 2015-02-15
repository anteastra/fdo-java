public class ArrayPrint {

	public static void main(String[] args) {

		int intOne[] = { 0, 1, 2, 3, 4, 5 }; // инициализируем intOne
		int intTwo[];
		
		intTwo = intOne; // присваиваем одну ссылку другой		
		
		printArr(intOne, "intOne"); //печать массива intOne
		printArr(intTwo, "intTwo"); // печать intTwo дл€ проверки
		
		intTwo[0] = -1; //мен€м значени€ вроде бы дл€ intTwo
		intTwo[1] = -2;
		intTwo[2] = -3;
		intTwo[3] = -4;
		intTwo[4] = -5;
		intTwo[5] = -6;
		
		printArr(intOne, "intOne"); // повтор€ем печать intOne
		
		
		printArr(intTwo, "intTwo"); // печать intTwo дл€ проверки
		
		
		
		//дл€ летунов
		Flyer[] летуны = new Flyer[5];
		летуны[0] = new Superman(); // супермен умеет летать
		летуны[1] = new Bird(); // птичка умеет летать
		летуны[2] = new Airplane(); // самолет умеет летать
		летуны[3] = new Helicopter(); // вертолет умеет летать 
		летуны[4] = new SeaPlane(); // вертолет умеет летать
		
		//дл€ животных
		Animal[] животинки = new Animal[2];
		
		// мы не создаем нового супермена, 
		//а берем из массива летунов и затем приводим тип
		животинки[0] = (Animal) летуны[0];
		
		// мы не создаем нового птичку, 
		//а берем из массива летунов и затем приводим тип
		животинки[1] = (Animal) летуны[1];
		
		//животинки[2] = (Animal) летуны[2]; - ошибка!!! самолет не животное
		
		всем¬злетать(летуны);
		всех ормить(животинки);
		всех ормить(летуны);
		
		// полиморфный вызов
		одному¬злетать(new Helicopter()); // вызов с непосредственным созданием экземпл€ра
		одного ормить(new Superman()); // вызов с непосредственным созданием экземпл€ра
		

	}
	private static void одному¬злетать(Flyer летун){
		// летуну - взлет!!!
		летун.takeOff();
	}
	private static void одного ормить(Animal животина){
		// животине - есть!!!
		животина.eat();
	}
	
	private static void всех ормить(Flyer[] летуны) {
		// TODO Auto-generated method stub
		for (int i = 0; i < летуны.length; i++) {
			if (летуны[i] instanceof Animal){
				System.out.println("Ётот летун оказалс€ животным и его нужно кормить");
				System.out.println(летуны[i].getClass().getName());
				((Animal)летуны[i]).eat();
			}
		}
	}

	static void всем¬злетать (Flyer[] летуны) {
		
		for (int i = 0; i < летуны.length; i++) {
			летуны[i].takeOff();
		}
		
	}
	
static void всех ормить (Animal[] животинки) {
		
		for (int i = 0; i < животинки.length; i++) {
			if (животинки[i] instanceof Kryptonian){
				System.out.println("Ёту животинку нужно кормить солнечной энергией");
				животинки[i].eat();
			} else {
			System.out.println("Ёта животинка ест земную пищу");
			животинки[i].eat();
			}
		}
		
	}

	static void printArr(int[] arr, String nameArr) {
		System.out.println("ѕечать массива " + nameArr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(nameArr + "[" + i + "] = " + arr[i]);
		}
		System.out.println(); // пуста€ строка в конце
	}

}
