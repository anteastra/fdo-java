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

    // Печать заголовка отчета
    System.out.println("\t\t\tCUSTOMERS REPORT");
    System.out.println("\t\t\t================");

    // Для каждого клиента...
    for ( int cust_idx = 0;
          cust_idx < bank.getNumOfCustomers();
          cust_idx++ ) {
      Customer customer = bank.getCustomer(cust_idx);

      // Печать имени клиента
      System.out.println();
      System.out.println("Customer: "
                         + customer.getLastName() + ", "
                         + customer.getFirstName());

      // Для каждого счета клиента...
      for ( int acct_idx = 0;
            acct_idx < customer.getNumOfAccounts();
            acct_idx++ ) {
        Account account = customer.getAccount(acct_idx);
        String  account_type = "";

        // Определение типа счета
        /***  a)Используйте оператор  instanceof для проверки какой вид счета 
	*** в данный момент мы наблюдаем, и назначьте переменной  account_type 
	*** соответствующее значение например «Сберегательный» или «До востребования» ***/
	// ЗДЕСЬ БУДЕТ ВАШ КОД

        // Печать текущего баланса счета
        /***  b)Распечатайте тип счета и текущий баланс ***/
	// ЗДЕСЬ БУДЕТ ВАШ КОД
      }
    }
  }
}
