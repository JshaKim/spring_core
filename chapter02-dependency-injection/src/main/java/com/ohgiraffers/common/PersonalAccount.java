package com.ohgiraffers.common;

public class PersonalAccount implements Account{


    private final int bankCode;

    private final String accNo;

    private int balance;

    public PersonalAccount(String accNo, int bankCode) {
        this.bankCode = bankCode;
        this.accNo = accNo;
    }

    public int getBankCode() {
        return bankCode;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String getBalance() {
        return this.accNo + "계좌의 현재 잔액은 " + this.balance + "원입니다.";
    }

    @Override
    public String deposit(int money) {
        String str = "";
        if(money>=0) {
            this.balance += money;
            str = money + "원이 입금되었습니다.";
        } else {
            str = "금액을 잘못입력했습니다";
        }
        return str;
    }

    @Override
    public String withdraw(int money) {
        String str = "";
        if(money>=0) {
            this.balance += money;
            str = money + "원이 출금되었습니다.";
        } else {
            str = "잔액이 부족합니다";
        }
        return str;
    }

    @Override
    public String toString() {
        return "PersonalAccount{" +
                "bankCode=" + bankCode +
                ", accNo='" + accNo + '\'' +
                ", balance=" + balance +
                '}';
    }
}
