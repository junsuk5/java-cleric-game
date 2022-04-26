package com.survivalcoding.quiz;

import java.util.Objects;

public class Account {
    private final String accountNumber;
    private int balance;

    public Account(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return accountNumber.trim().equals(account.accountNumber.trim());
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber);
    }

    @Override
    public String toString() {
        return balance + "원 (계좌번호=" + accountNumber + ")";
    }

    public static void main(String[] args) {
        Account a = new Account("  4649", 1592);
        Account b = new Account(" 4649", 2000);

        System.out.println(a.equals(b));
    }
}
