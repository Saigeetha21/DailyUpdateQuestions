package feb28.runtimepoly.com;

class Account {
    void showAccountType() {
        System.out.println("Generic Account");
    }
}

class SavingsAccount extends Account {
    void showAccountType() {
        System.out.println("Savings Account");
    }
}

class CurrentAccount extends Account {
    void showAccountType() {
        System.out.println("Current Account");
    }
}

public class AccountPoly {
    public static void main(String[] args) {
        Account acc1 = new SavingsAccount();
        Account acc2 = new CurrentAccount();

        acc1.showAccountType(); // Output: Savings Account
        acc2.showAccountType(); // Output: Current Account
    }
}
