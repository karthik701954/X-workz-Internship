class AccountHolder {

    int accountId;
    String name;
    long accountNumber;
    String accountType;
    double balance;

    public void getAccountHolderDetails() {
        System.out.println("The accountId is: " + accountId);
        System.out.println("The name is: " + name);
        System.out.println("The accountNumber is: " + accountNumber);
        System.out.println("The accountType is: " + accountType);
        System.out.println("The balance is: " + balance);
    }
}