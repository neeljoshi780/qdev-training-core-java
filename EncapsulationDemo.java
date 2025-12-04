// Encapsulation Demonstration: BankAccount class

/**
 * The BankAccount class demonstrates encapsulation by using private fields
 * and providing public methods to access and modify those fields.
 * 
 * @author Neel Joshi
 * @version 1.0.0
 * @since 2025-12-02
 */
class BankAccount {
    // Private field to encapsulate the account balance
    private double balance;

    // Constructor to initialize the bank account with an initial balance
    public BankAccount(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance must be greater than 0. Setting balance to 0.");
        }
    }

    // Getter method to access the balance
    public double getBalance() {
        return balance;
    }

    // Setter method to modify the balance (for example, deposit money)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    // Setter method to withdraw money (with validation)
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        // Create a BankAccount object with an initial balance
        BankAccount account = new BankAccount(1000);

        // Display current balance
        System.out.println("Current Balance: " + account.getBalance());

        // Deposit money
        account.deposit(500);
        System.out.println("Balance after deposit: " + account.getBalance());

        // Withdraw money
        account.withdraw(200);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        // Try to withdraw an invalid amount
        account.withdraw(1500); // Insufficient balance
        System.out.println("Balance after invalid withdrawal: " + account.getBalance());
    }
}