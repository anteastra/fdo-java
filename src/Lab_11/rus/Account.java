package com.mybank.domain;

public class Account {
    
    private double balance;
    
    public Account(double initBalance) {
        balance = initBalance;
    }
    
    public double ��������������() {
        return balance;
    }
    
    public boolean ������(double amt) {
        balance = balance + amt;
        return true;
    }
    
    public boolean �����(double amt) {
        boolean result = false;  // assume operation failure
        if ( amt <= balance ) {
            balance = balance - amt;
            result = true;  // operation succeeds
        }
        return result;
    }
}
