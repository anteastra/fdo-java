
//: c06:FinalData.java
// Эффект полей  final.

class Value {
	int i = 1;
}

public class FinalData {
	// Может быть константой во время компиляции
	final int i1 = 9;
	static final int VAL_TWO = 99;
	// Обычная public константы:
	public static final int VAL_THREE = 39;
	// Не может быть константой во время компиляции:
	final int i4 = (int) (Math.random() * 20);
	static final int i5 = (int) (Math.random() * 20);

	Value v1 = new Value();
	final Value v2 = new Value();
	static final Value v3 = new Value();
	// Массивы:
	final int[] a = { 1, 2, 3, 4, 5, 6 };

	public void print(String id) {
		System.out.println(id + ": " + "i4 = " + i4 + ", i5 = " + i5);
	}

	public static void main(String[] args) {
		FinalData fd1 = new FinalData();
		// ! fd1.i1++; // Ошибка: значение не может быть изменено
		fd1.v2.i++; // Объект не константа!
		fd1.v1 = new Value(); // OK -- не final
		for (int i = 0; i < fd1.a.length; i++)
			fd1.a[i]++; // Объект не константа!
		// ! fd1.v2 = new Value(); // Ошибка: Нельзя
		// ! fd1.v3 = new Value(); // изменить ссылку
		// ! fd1.a = new int[3];

		fd1.print("fd1");
		System.out.println("Creating new FinalData");
		FinalData fd2 = new FinalData();
		fd1.print("fd1");
		fd2.print("fd2");
	}
} // /:~

