package BankAccount;

class BankAccount implements Cloneable {
    private double balance;
    public BankAccount() {
        balance = 0; }
    public BankAccount(double initialBalance) {
        balance = initialBalance; }
    public void deposit(double amount) {
        balance += amount; }
    public void withdraw(double amount ) { balance = balance - amount; }
    public double getBalance() { return balance; }
    public String toString() { return Double.toString(balance); }

    public Object clone()  {
        try {
           // Object clonedAccount = super.clone();
           // return clonedAccount;
            return super.clone();
        }
        catch(CloneNotSupportedException e) {
            // can't happen -- we implement cloneable
            return null;
        }
    }
}

class Customer {
    private BankAccount account;
    private String name;
    public Customer(String aName) {
        name = aName;
        account = new BankAccount(0);
    }
    public String getName() {
        return name;
    }

    public BankAccount getAccount() {
        return (BankAccount)account.clone();
    }
    public void addToAccount(double amt) {
        account.deposit(amt);
    }
    public String toString() {
        return name +" "+ account;
    }
}


// We can only review Joe's account.
// We can change it only through the proper interface.
public class CustomerTest {
    public static void main(String args[]) {
        Customer joe = new Customer("Joeseph Smith");
        joe.addToAccount(1000);
        BankAccount sureItsPrivate = joe.getAccount();
        sureItsPrivate.withdraw(100);
        System.out.println(sureItsPrivate);
        System.out.println(joe);
    }
}

