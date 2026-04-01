class History {

    int historyId;
    String transactionType;
    double amount;
    String date;
    String status;

    public void getHistoryDetails() {
        System.out.println("The historyId is: " + historyId);
        System.out.println("The transactionType is: " + transactionType);
        System.out.println("The amount is: " + amount);
        System.out.println("The date is: " + date);
        System.out.println("The status is: " + status);
    }
}
