// Программа суммирующая аргументы командной строки

public class AddArguments {
	public static void main(String args[]) {
		
		printArgs(args); // печать аргументов
		
		int sum = ArithmClass.first(args); // суммирование аргументов
		
		System.out.println("Sum = " + sum); // вывод суммы аргументов
	}

	private static void printArgs(String[] args) {
		// распечатка аргументов на экране
		System.out.print("Args: ");
		if (args.length==0) {
			System.out.println("<no args>");
			return;
		}
		for (int i = 0; i < args.length; i++) {
			System.out.print(args[i]+" ");
		}
		System.out.println();
	}
}