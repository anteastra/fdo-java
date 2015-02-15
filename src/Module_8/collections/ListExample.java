package collections;

import java.util.*;

public class ListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// �������� � ���������� ������

		List list = new ArrayList(); // "�����" ������
		
		//���������� ���������
		list.add("one");
		list.add("second");
		list.add("3rd");
		list.add(new Integer(4));
		list.add(new Float(5.0F));
		list.add("second");
		list.add(new Integer(4));
		int i = 32500;
		list.add(i); // ��� ���������� "in-boxing", �� ���� ������������� � ��� ��������
		System.out.println(list); // ���������� ����������� ������������ ����������
		
		//�������� �� ���� ��������� ������ � ������� ���������
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next(); // �� ��������� ����������� ������������ �������
			//������������� ���������� ������� ������� � ��������� ���������� � ����
			System.out.println(object.toString() + " \t" + object.getClass().getName());
		}
		
		String zero = (String) list.get(0); //���������� �������� �� ������ �� �������
		
		
	}
}
