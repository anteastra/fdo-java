
public class ArithmClass {
	
	static int first(String[] first_arg){
		return second(first_arg);
	}

	static int second(String[] second_arg) {
		int sum = 0;
		for (int i = 0; i < second_arg.length; i++) {
			// ������������ ������������ ��������
			sum += Integer.parseInt(second_arg[i]);
		}
		// ������� ����� �������� ���������� ��������� � ����� ������������������
		// ���������� ������ �� ������� �������: ArrayIndexOutOfBoundsException
		System.out.println("Last arg: " + second_arg[second_arg.length-1]);
		
		
		return sum;
	}

}
