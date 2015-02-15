package com.mybank.domain;

public class Bank {
    private  лиент[] customers;
    private int        numberOfCustomers;
    
    public Bank() {
        customers = new  лиент[10];
        numberOfCustomers = 0;
    }
    
    public void добавить лиента(String f, String l) {
        int i = numberOfCustomers++;
        customers[i] = new  лиент(f, l);
    }
    public int получить„исло лиентов() {
        return numberOfCustomers;
    }
    public  лиент получить лиента(int customer_index) {
        return customers[customer_index];
    }
}
