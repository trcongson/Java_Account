package BT_Account;

import java.util.Date;
import java.util.Scanner;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    double depAmount;
    double monthlyInterestRate = annualInterestRate / 12;
    double monthlyInterest = balance * monthlyInterestRate;

    Scanner sc = new Scanner(System.in);

    public Account() {
    }

    public Account(int id, double balance, double annualInterestRate, Date dateCreated) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = dateCreated;
    }

    public double getMonthlyInterestRate() {
        return monthlyInterestRate;
    }

    public double getMonthyInterst() {
        return monthlyInterest;
    }

    public void withdraw() {
        System.out.print("Số tiền bạn muốn rút: ");
        depAmount = sc.nextDouble();
        this.balance -= balance * monthlyInterestRate;
    }

    public void deposit() {
        System.out.print("Số tiền bạn muốn gửi: ");
        depAmount = sc.nextDouble();
        this.balance += depAmount;
    }

    public double getBalance() {
        return this.balance;
    }

    public String display() {
        return "Account {" + id + " Số dư: " + balance + "tiền lãi tháng" + monthlyInterest + dateCreated + "}";
    }
}
