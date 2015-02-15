public class ArrayPrint {

	public static void main(String[] args) {

		int intOne[] = { 0, 1, 2, 3, 4, 5 }; // �������������� intOne
		int intTwo[];
		
		intTwo = intOne; // ����������� ���� ������ ������		
		
		printArr(intOne, "intOne"); //������ ������� intOne
		printArr(intTwo, "intTwo"); // ������ intTwo ��� ��������
		
		intTwo[0] = -1; //����� �������� ����� �� ��� intTwo
		intTwo[1] = -2;
		intTwo[2] = -3;
		intTwo[3] = -4;
		intTwo[4] = -5;
		intTwo[5] = -6;
		
		printArr(intOne, "intOne"); // ��������� ������ intOne
		
		
		printArr(intTwo, "intTwo"); // ������ intTwo ��� ��������
		
		
		
		//��� �������
		Flyer[] ������ = new Flyer[5];
		������[0] = new Superman(); // �������� ����� ������
		������[1] = new Bird(); // ������ ����� ������
		������[2] = new Airplane(); // ������� ����� ������
		������[3] = new Helicopter(); // �������� ����� ������ 
		������[4] = new SeaPlane(); // �������� ����� ������
		
		//��� ��������
		Animal[] ��������� = new Animal[2];
		
		// �� �� ������� ������ ���������, 
		//� ����� �� ������� ������� � ����� �������� ���
		���������[0] = (Animal) ������[0];
		
		// �� �� ������� ������ ������, 
		//� ����� �� ������� ������� � ����� �������� ���
		���������[1] = (Animal) ������[1];
		
		//���������[2] = (Animal) ������[2]; - ������!!! ������� �� ��������
		
		������������(������);
		�����������(���������);
		�����������(������);
		
		// ����������� �����
		��������������(new Helicopter()); // ����� � ���������������� ��������� ����������
		�������������(new Superman()); // ����� � ���������������� ��������� ����������
		

	}
	private static void ��������������(Flyer �����){
		// ������ - �����!!!
		�����.takeOff();
	}
	private static void �������������(Animal ��������){
		// �������� - ����!!!
		��������.eat();
	}
	
	private static void �����������(Flyer[] ������) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ������.length; i++) {
			if (������[i] instanceof Animal){
				System.out.println("���� ����� �������� �������� � ��� ����� �������");
				System.out.println(������[i].getClass().getName());
				((Animal)������[i]).eat();
			}
		}
	}

	static void ������������ (Flyer[] ������) {
		
		for (int i = 0; i < ������.length; i++) {
			������[i].takeOff();
		}
		
	}
	
static void ����������� (Animal[] ���������) {
		
		for (int i = 0; i < ���������.length; i++) {
			if (���������[i] instanceof Kryptonian){
				System.out.println("��� ��������� ����� ������� ��������� ��������");
				���������[i].eat();
			} else {
			System.out.println("��� ��������� ��� ������ ����");
			���������[i].eat();
			}
		}
		
	}

	static void printArr(int[] arr, String nameArr) {
		System.out.println("������ ������� " + nameArr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(nameArr + "[" + i + "] = " + arr[i]);
		}
		System.out.println(); // ������ ������ � �����
	}

}
