class BankAccountExecutor {

    public static void main(String args[]) {

        double balance = BankAccount.getBalance();
        System.out.println("Initial Balance of BankAccount is : " + balance);

        System.out.println("After Credit:");

        double balance1 = BankAccount.credit(80000);
        System.out.println(balance1);

        System.out.println("After Debit:");

        double balance2 = BankAccount.debit(20000);
        System.out.println(balance2);
		
		System.out.println("After Credit:");

        double balance3 = BankAccount.credit(70000);
        System.out.println(balance3);

        System.out.println("After Debit:");

        double balance4 = BankAccount.debit(90000);
        System.out.println(balance4);
    }
}