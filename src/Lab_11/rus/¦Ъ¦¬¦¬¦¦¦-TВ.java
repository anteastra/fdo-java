
package com.mybank.domain;

/**
 *
 * @author student
 */
public class  лиент {

    private String firstName;
    private String lastName;
    private Account account;

    public  лиент(String f, String l) {
        firstName = f;
        lastName = l;
    }

    public String получить»м€() {
        return firstName;
    }

    public String получить‘амилию() {
        return lastName;
    }

    public Account получить—чет() {
        return account;
    }

    public void назначить—чет(Account acct) {
        account = acct;
    }
    
}
