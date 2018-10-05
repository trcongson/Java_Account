package BT_Account;

import java.util.Date;
import java.util.Scanner;

public class TestAcc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tài khoản id: ");
        int id = sc.nextInt();
        System.out.print("Nhập số dư tài khoản: ");
        double balance = sc.nextDouble();
        System.out.print("Nhập lãi xuất tài khoản: ");
        double annualInterstRate = sc.nextDouble();
        Date dateCreated = new Date();

        Account account = new Account(id, balance, annualInterstRate, dateCreated);

        System.out.println("Tài khoản \n" + account.display());
    }
}
