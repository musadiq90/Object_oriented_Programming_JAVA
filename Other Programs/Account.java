package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Account {
    static Scanner inp = new Scanner(System.in);
    private Double accNumber;
    private String accountHolderName;
    private Double Balance;

    Account(Double accNum, String accHolderName, Double balance){
        this.accNumber = accNum;
        this.accountHolderName = accHolderName;
        this.Balance = balance;

    }

    void getDetails(){
        System.out.println(accNumber + "  " + accountHolderName + "  "+ Balance);
    }
    public static void main(String[] args) {
        System.out.println("enter the number of account Holders: ");
        int x = inp.nextInt();
        ArrayList<Account> accounts = new ArrayList<Account>();

        for (int i=0; i<x; i++){
            System.out.println("Account Number: ");
            double a = inp.nextDouble();
            System.out.println("accoutn holder name:");
            String b = inp.next();
            System.out.println("Balance:");
            Double c = inp.nextDouble();

            accounts.add(new Account(a,b,c));
        }

        System.out.println("All data is inserted: ");

        for (int i=0; i<x; i++){
            accounts.get(i).getDetails();
        }

    }
}
