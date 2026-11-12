public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Deposit amount must be positive."
            );
        }

        balance += amount;
        System.out.println("Amount deposited successfully!");
        System.out.printf("Updated Balance: %.2f%n", balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                "Withdrawal amount must be positive."
            );
        }

        if (amount > balance) {
            throw new IllegalArgumentException(
                "Insufficient balance! Withdrawal failed."
            );
        }

        balance -= amount;
        System.out.println("Amount withdrawn successfully!");
        System.out.printf("Updated Balance: %.2f%n", balance);
    }

    public double getBalance() {
        return balance;
    }
} 
    
