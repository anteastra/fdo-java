package com.mybank.report;

import com.mybank.domain.*;

public class CustomerReport {

  private Bank bank;

  public CustomerReport() {
  }

  public Bank getBank() {
    return bank;
  }

  public void setBank(Bank bank) {
    this.bank = bank;
  }

  public void generateReport() {

    // ������ ��������� ������
    System.out.println("\t\t\tCUSTOMERS REPORT");
    System.out.println("\t\t\t================");

    // ��� ������� �������...
    for ( int cust_idx = 0;
          cust_idx < bank.getNumOfCustomers();
          cust_idx++ ) {
      Customer customer = bank.getCustomer(cust_idx);

      // ������ ����� �������
      System.out.println();
      System.out.println("Customer: "
                         + customer.getLastName() + ", "
                         + customer.getFirstName());

      // ��� ������� ����� �������...
      for ( int acct_idx = 0;
            acct_idx < customer.getNumOfAccounts();
            acct_idx++ ) {
        Account account = customer.getAccount(acct_idx);
        String  account_type = "";

        // ����������� ���� �����
        /***  a)����������� ��������  instanceof ��� �������� ����� ��� ����� 
	*** � ������ ������ �� ���������, � ��������� ����������  account_type 
	*** ��������������� �������� �������� ��������������� ��� ��� �������������� ***/
	// ����� ����� ��� ���

        // ������ �������� ������� �����
        /***  b)������������ ��� ����� � ������� ������ ***/
	// ����� ����� ��� ���
      }
    }
  }
}
