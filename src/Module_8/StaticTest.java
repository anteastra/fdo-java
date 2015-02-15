
public class StaticTest {

	/**
	 * Объявлены два поля одно статическое другое обычное
	 */
	int field1;
	static int stat_field;
	
	public static void main(String[] args) {
		
		//обращаемся к статическому полю
		stat_field = 22;
		
		//Пытаемся обратить к не-статическому полю из статического метода main
		//field1 = 44; // ошибка компиляции
		
		//Создаем экземпляр класса StaticTest
		StaticTest st1 = new StaticTest();
		System.out.println("Печатаем поле st1.field1: "+st1.field1);
		st1.field1++;
		System.out.println("Печатаем поле st1.field1: "+st1.field1);
		
		System.out.println("Печатаем static поле st1.stat_field: "+st1.stat_field);
		
		//Создаем второй экземпляр класса StaticTest
		StaticTest st2 = new StaticTest();
		System.out.println("Печатаем поле st2.field1: "+st2.field1);
		st2.field1--;
		System.out.println("Печатаем поле st2.field1: "+st2.field1);
		
		System.out.println("Печатаем static поле st2.stat_field: "+st2.stat_field);
		
//		Увеличиваем статическое поле в два раза
		StaticTest.stat_field *=2; // могли бы и просто написать stat_field *=2;
		
		//Печатаем
		System.out.println("Печатаем поле st2.field1: "+st2.field1);
		System.out.println("Печатаем поле st1.field1: "+st1.field1);
		
		System.out.println("Печатаем static поле st1.stat_field: "+st2.stat_field);
		System.out.println("Печатаем static поле st2.stat_field: "+st1.stat_field);
		
	}

}
