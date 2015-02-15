
public class StaticTest {

	/**
	 * ��������� ��� ���� ���� ����������� ������ �������
	 */
	int field1;
	static int stat_field;
	
	public static void main(String[] args) {
		
		//���������� � ������������ ����
		stat_field = 22;
		
		//�������� �������� � ��-������������ ���� �� ������������ ������ main
		//field1 = 44; // ������ ����������
		
		//������� ��������� ������ StaticTest
		StaticTest st1 = new StaticTest();
		System.out.println("�������� ���� st1.field1: "+st1.field1);
		st1.field1++;
		System.out.println("�������� ���� st1.field1: "+st1.field1);
		
		System.out.println("�������� static ���� st1.stat_field: "+st1.stat_field);
		
		//������� ������ ��������� ������ StaticTest
		StaticTest st2 = new StaticTest();
		System.out.println("�������� ���� st2.field1: "+st2.field1);
		st2.field1--;
		System.out.println("�������� ���� st2.field1: "+st2.field1);
		
		System.out.println("�������� static ���� st2.stat_field: "+st2.stat_field);
		
//		����������� ����������� ���� � ��� ����
		StaticTest.stat_field *=2; // ����� �� � ������ �������� stat_field *=2;
		
		//��������
		System.out.println("�������� ���� st2.field1: "+st2.field1);
		System.out.println("�������� ���� st1.field1: "+st1.field1);
		
		System.out.println("�������� static ���� st1.stat_field: "+st2.stat_field);
		System.out.println("�������� static ���� st2.stat_field: "+st1.stat_field);
		
	}

}
