package com.mybank.domain;

public class Bank {
    private ������[] customers;
    private int        numberOfCustomers;
    
    public Bank() {
        customers = new ������[10];
        numberOfCustomers = 0;
    }
    
    public void ���������������(String f, String l) {
        int i = numberOfCustomers++;
        customers[i] = new ������(f, l);
    }
    public int ���������������������() {
        return numberOfCustomers;
    }
    public ������ ���������������(int customer_index) {
        return customers[customer_index];
    }
}
