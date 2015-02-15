package com.mybank.test;

import com.mybank.domain.*;

public class TestBanking {

  public static void main(String[] args) {
    Bank bank = new Bank();
     лиент customer;
    Account account;

    //
    // —оздание клиентов банка и их счетов
    //

    System.out.println("—оздание клиента Jane Simms.");
    bank.добавить лиента("Jane", "Simms");
    customer = bank.получить лиента(0);
    System.out.println("—оздание ее счета вида —берегательный счет с начальным балансом 500.00 и ставкой 3%");
    customer.назначить—чет(new SavingsAccount(500.00, 0.03));

    System.out.println("—оздание клиента Owen Bryant.");
    bank.добавить лиента("Owen", "Bryant");
    customer = bank.получить лиента(1);
    System.out.println("—оздание его счета вида ƒо востребовани€ с начальным балансом 500.00 без овердрафта.");
    customer.назначить—чет(new CheckingAccount(500.00));

    System.out.println("—оздание клиента Tim Soley.");
    bank.добавить лиента("Tim", "Soley");
    customer = bank.получить лиента(2);
    System.out.println("—оздание его счета вида ƒо востребовани€ с начальным балансом 500.00 и с макс. овердрафтом 500.00");
    customer.назначить—чет(new CheckingAccount(500.00, 500.00));

    System.out.println("—оздание клиента Maria Soley.");
    bank.добавить лиента("Maria", "Soley");
    customer = bank.получить лиента(3);
    System.out.println("Maria имеет совместный счет ƒо востребовани€ с мужем по имени Tim.");
    customer.назначить—чет(bank.получить лиента(2).получить—чет());

    System.out.println();

    //
    // ƒемонстрирует поведение счетов различного вида
    //

    // “естируем стандартный —берегательный счет
    System.out.println("»звлеч. информации о клиенте Jane Smith и ее счете вида —берегательный счет.");
    customer = bank.получить лиента(0);
    account = customer.получить—чет();
    System.out.println(" лиент [" + customer.получить‘амилию()
		       + ", " + customer.получить»м€()
		       + "] имеет начальный баланс: " + account.получитьЅаланс());
    // ¬ыполн€ем транзакции над счетом 
    System.out.println("¬ыполн€ем транзакции над счетом [" + customer.получить‘амилию()
		       + ", " + customer.получить»м€()
		       + "]:");
    System.out.println("—н€тие 150.00: " + account.сн€ть(150.00));
    System.out.println("¬несение 22.50: " + account.внести(22.50));
    System.out.println("—н€тие 47.62: " + account.сн€ть(47.62));
    System.out.println("—н€тие 400.00: " + account.сн€ть(400.00));
    // ѕечать конечного баланса после транзакций 
    System.out.println(" лиент [" + customer.получить‘амилию()
		       + ", " + customer.получить»м€()
		       + "] имеет баланс: " + account.получитьЅаланс());

    System.out.println();

    // “естируем счет ƒо востребовани€ без овердрафта
    System.out.println("»звлеч. информации о клиенте Owen Bryant и его счете ƒо востребовани€ без овердрафта.");
    customer = bank.получить лиента(1);
    account = customer.получить—чет();
    System.out.println(" лиент [" + customer.получить‘амилию()
		       + ", " + customer.получить»м€()
		       + "] имеет начальный баланс: " + account.получитьЅаланс());
    // ¬ыполн€ем транзакции над счетом
    System.out.println("¬ыполн€ем транзакции над счетом [" + customer.получить‘амилию()
		       + ", " + customer.получить»м€()
		       + "]:");
    System.out.println("—н€тие 150.00: " + account.сн€ть(150.00));
    System.out.println("¬несение 22.50: " + account.внести(22.50));
    System.out.println("—н€тие 47.62: " + account.сн€ть(47.62));
    System.out.println("—н€тие 400.00: " + account.сн€ть(400.00));
    // ѕечать конечного баланса после транзакций 
    System.out.println(" лиент [" + customer.получить‘амилию()
		       + ", " + customer.получить»м€()
		       + "] имеет баланс: " + account.получитьЅаланс());

    System.out.println();

    // “естируем счет ƒо востребовани€ с овердрафтом
    System.out.println("»звлеч. информации о клиенте Tim Soley и его счете ƒо востребовани€ с овердрафтом.");
    customer = bank.получить лиента(2);
    account = customer.получить—чет();
    System.out.println(" лиент [" + customer.получить‘амилию()
		       + ", " + customer.получить»м€()
		       + "] имеет начальный баланс: " + account.получитьЅаланс());
    // ¬ыполн€ем транзакции над счетом
    System.out.println("¬ыполн€ем транзакции над счетом [" + customer.получить‘амилию()
		       + ", " + customer.получить»м€()
		       + "]:");
    System.out.println("—н€тие 150.00: " + account.сн€ть(150.00));
    System.out.println("¬несение 22.50: " + account.внести(22.50));
    System.out.println("—н€тие 47.62: " + account.сн€ть(47.62));
    System.out.println("—н€тие 400.00: " + account.сн€ть(400.00));
    // ѕечать конечного баланса после транзакций 
    System.out.println(" лиент [" + customer.получить‘амилию()
		       + ", " + customer.получить»м€()
		       + "] имеет баланс: " + account.получитьЅаланс());

    System.out.println();

    // “естируем счет ƒо востребовани€ с овердрафтом
    System.out.println("»звлеч. информации о клиенте Maria Soley и ее совместном счете ƒо востребовани€ с мужем по имени Tim.");
    customer = bank.получить лиента(3);
    account = customer.получить—чет();
    System.out.println(" лиент [" + customer.получить‘амилию()
		       + ", " + customer.получить»м€()
		       + "] имеет начальный баланс: " + account.получитьЅаланс());
    // ¬ыполн€ем транзакции над счетом
    System.out.println("¬ыполн€ем транзакции над счетом [" + customer.получить‘амилию()
		       + ", " + customer.получить»м€()
		       + "]:");
    System.out.println("¬несение 150.00: " + account.внести(150.00));
    System.out.println("—н€тие 750.00: " + account.сн€ть(750.00));
    // ѕечать конечного баланса после транзакций 
    System.out.println(" лиент [" + customer.получить‘амилию()
		       + ", " + customer.получить»м€()
		       + "] имеет баланс: " + account.получитьЅаланс());

  }
}
