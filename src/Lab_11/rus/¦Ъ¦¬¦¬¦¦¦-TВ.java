
package com.mybank.domain;

/**
 *
 * @author student
 */
public class ������ {

    private String firstName;
    private String lastName;
    private Account account;

    public ������(String f, String l) {
        firstName = f;
        lastName = l;
    }

    public String �����������() {
        return firstName;
    }

    public String ���������������() {
        return lastName;
    }

    public Account ������������() {
        return account;
    }

    public void �������������(Account acct) {
        account = acct;
    }
    
}
