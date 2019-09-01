package com.company;

import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private String acountHolderName;
    private String AccountType;
    private double balance;
    public double minBalance = 5000.00;

    static Scanner inp = new Scanner(System.in);

    public void setAccountNumber(){
        System.out.println("Enter Your Account Number: ");
        accountNumber = inp.nextLine();

    }
    public void setAcountHolderName(){
        System.out.println("Enter Account Holder Name: ");
        acountHolderName = inp.nextLine();

    }
    public void setAccountType(){
        System.out.println("Enter account Type: ");
        AccountType = inp.nextLine();

    }
    public void setBalance(){
        System.out.println("Enter Account Balance: ");
        double x = inp.nextInt();
        if(x < minBalance){
            System.out.println("Minimum Balance should be atleast 5000.00");
            setBalance();
        }
        else {
            balance = x;
        }

    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAcountHolderName(){
        return acountHolderName;
    }

    public String getAccountType() {
        return AccountType;
    }

    public double getBalance() {
        return balance;
    }
    public void depositAmount(Double x){
        balance +=x;
    }
    public void withDrawal(Double y){
        balance -=y;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        account1.setAccountNumber();
        account1.setAcountHolderName();
        account1.setAccountType();
        account1.setBalance();
        System.out.println("Your Balance is: "+ account1.getBalance());
        System.out.println("Deposite Amount: ");
        double a = inp.nextDouble();
        account1.depositAmount(a);
        System.out.println("amount deposited new balance is: "+ account1.getBalance());

    }
}
