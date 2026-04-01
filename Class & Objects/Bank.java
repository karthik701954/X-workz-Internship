class Bank {

    int bankId;
    String bankName;
    String branch;
    String ifsc;
    String location;

    AccountHolder accountHolder;

    public void getBankDetails() {
        System.out.println("The bankId is: " + bankId);
        System.out.println("The bankName is: " + bankName);
        System.out.println("The branch is: " + branch);
        System.out.println("The ifsc is: " + ifsc);
        System.out.println("The location is: " + location);

        accountHolder.getAccountHolderDetails();
    }
}