package feb20.com;

class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;  //bal = bal+amount
        System.out.println("Deposit of " + amount + " made. New balance is " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " processed. Remaining balance is " + balance);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = balance * interestRate / 100;
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }
}

public class BankTest {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("123456", 1000, 2.5);
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        savingsAccount.addInterest();
    }
}

