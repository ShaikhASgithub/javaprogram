package assigment;

import java.util.Scanner;

public class BankAccount {
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.balance = balance;
    }

    
    public void deposit(double amount) {
        balance += amount;
    }

    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }

    
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(accountNumber, initialBalance);

        
        System.out.print("Enter the amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter the amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

        
        System.out.println("Account balance: $" + account.getBalance());

        scanner.close();
    }
}

