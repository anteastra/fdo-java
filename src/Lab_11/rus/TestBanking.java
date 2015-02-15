package com.mybank.test;

import com.mybank.domain.*;

public class TestBanking {

  public static void main(String[] args) {
    Bank bank = new Bank();
    ������ customer;
    Account account;

    //
    // �������� �������� ����� � �� ������
    //

    System.out.println("�������� ������� Jane Simms.");
    bank.���������������("Jane", "Simms");
    customer = bank.���������������(0);
    System.out.println("�������� �� ����� ���� �������������� ���� � ��������� �������� 500.00 � ������� 3%");
    customer.�������������(new SavingsAccount(500.00, 0.03));

    System.out.println("�������� ������� Owen Bryant.");
    bank.���������������("Owen", "Bryant");
    customer = bank.���������������(1);
    System.out.println("�������� ��� ����� ���� �� ������������� � ��������� �������� 500.00 ��� ����������.");
    customer.�������������(new CheckingAccount(500.00));

    System.out.println("�������� ������� Tim Soley.");
    bank.���������������("Tim", "Soley");
    customer = bank.���������������(2);
    System.out.println("�������� ��� ����� ���� �� ������������� � ��������� �������� 500.00 � � ����. ����������� 500.00");
    customer.�������������(new CheckingAccount(500.00, 500.00));

    System.out.println("�������� ������� Maria Soley.");
    bank.���������������("Maria", "Soley");
    customer = bank.���������������(3);
    System.out.println("Maria ����� ���������� ���� �� ������������� � ����� �� ����� Tim.");
    customer.�������������(bank.���������������(2).������������());

    System.out.println();

    //
    // ������������� ��������� ������ ���������� ����
    //

    // ��������� ����������� �������������� ����
    System.out.println("������. ���������� � ������� Jane Smith � �� ����� ���� �������������� ����.");
    customer = bank.���������������(0);
    account = customer.������������();
    System.out.println("������ [" + customer.���������������()
		       + ", " + customer.�����������()
		       + "] ����� ��������� ������: " + account.��������������());
    // ��������� ���������� ��� ������ 
    System.out.println("��������� ���������� ��� ������ [" + customer.���������������()
		       + ", " + customer.�����������()
		       + "]:");
    System.out.println("������ 150.00: " + account.�����(150.00));
    System.out.println("�������� 22.50: " + account.������(22.50));
    System.out.println("������ 47.62: " + account.�����(47.62));
    System.out.println("������ 400.00: " + account.�����(400.00));
    // ������ ��������� ������� ����� ���������� 
    System.out.println("������ [" + customer.���������������()
		       + ", " + customer.�����������()
		       + "] ����� ������: " + account.��������������());

    System.out.println();

    // ��������� ���� �� ������������� ��� ����������
    System.out.println("������. ���������� � ������� Owen Bryant � ��� ����� �� ������������� ��� ����������.");
    customer = bank.���������������(1);
    account = customer.������������();
    System.out.println("������ [" + customer.���������������()
		       + ", " + customer.�����������()
		       + "] ����� ��������� ������: " + account.��������������());
    // ��������� ���������� ��� ������
    System.out.println("��������� ���������� ��� ������ [" + customer.���������������()
		       + ", " + customer.�����������()
		       + "]:");
    System.out.println("������ 150.00: " + account.�����(150.00));
    System.out.println("�������� 22.50: " + account.������(22.50));
    System.out.println("������ 47.62: " + account.�����(47.62));
    System.out.println("������ 400.00: " + account.�����(400.00));
    // ������ ��������� ������� ����� ���������� 
    System.out.println("������ [" + customer.���������������()
		       + ", " + customer.�����������()
		       + "] ����� ������: " + account.��������������());

    System.out.println();

    // ��������� ���� �� ������������� � �����������
    System.out.println("������. ���������� � ������� Tim Soley � ��� ����� �� ������������� � �����������.");
    customer = bank.���������������(2);
    account = customer.������������();
    System.out.println("������ [" + customer.���������������()
		       + ", " + customer.�����������()
		       + "] ����� ��������� ������: " + account.��������������());
    // ��������� ���������� ��� ������
    System.out.println("��������� ���������� ��� ������ [" + customer.���������������()
		       + ", " + customer.�����������()
		       + "]:");
    System.out.println("������ 150.00: " + account.�����(150.00));
    System.out.println("�������� 22.50: " + account.������(22.50));
    System.out.println("������ 47.62: " + account.�����(47.62));
    System.out.println("������ 400.00: " + account.�����(400.00));
    // ������ ��������� ������� ����� ���������� 
    System.out.println("������ [" + customer.���������������()
		       + ", " + customer.�����������()
		       + "] ����� ������: " + account.��������������());

    System.out.println();

    // ��������� ���� �� ������������� � �����������
    System.out.println("������. ���������� � ������� Maria Soley � �� ���������� ����� �� ������������� � ����� �� ����� Tim.");
    customer = bank.���������������(3);
    account = customer.������������();
    System.out.println("������ [" + customer.���������������()
		       + ", " + customer.�����������()
		       + "] ����� ��������� ������: " + account.��������������());
    // ��������� ���������� ��� ������
    System.out.println("��������� ���������� ��� ������ [" + customer.���������������()
		       + ", " + customer.�����������()
		       + "]:");
    System.out.println("�������� 150.00: " + account.������(150.00));
    System.out.println("������ 750.00: " + account.�����(750.00));
    // ������ ��������� ������� ����� ���������� 
    System.out.println("������ [" + customer.���������������()
		       + ", " + customer.�����������()
		       + "] ����� ������: " + account.��������������());

  }
}
