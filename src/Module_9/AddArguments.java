// ��������� ����������� ��������� ��������� ������

public class AddArguments {
	public static void main(String args[]) {
		
		printArgs(args); // ������ ����������
		
		int sum = ArithmClass.first(args); // ������������ ����������
		
		System.out.println("Sum = " + sum); // ����� ����� ����������
	}

	private static void printArgs(String[] args) {
		// ���������� ���������� �� ������
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