class BankAccount {

    static double balance = 0.0;

    static double getBalance() {
        return balance;
    }

    static double credit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("Invalid amount to credit");
        }
        return balance;
    }

    static double debit(double amount) {
        if (amount > 0) {
            balance = balance - amount;
        } else {
            System.out.println("The Account Balance is insufficient");
        }
        return balance;
    }
}

