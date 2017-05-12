package com.leonslegion.casino.Abstracts;

public abstract class Player {

    private double balance;
    private long accountId;

    public Player(double balance, long accountId) {
        this.balance = balance;
        this.accountId = accountId;
    }

    public long getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract double placeBet(double bet) throws Exception;

}