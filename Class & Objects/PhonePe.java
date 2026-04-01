class PhonePe {

    int phonePeId;
    String mobileNumber;
    String upiId;
    String accountType;
    String status;

    History history;

    public void getPhonePeDetails() {
        System.out.println("The phonePeId is: " + phonePeId);
        System.out.println("The mobileNumber is: " + mobileNumber);
        System.out.println("The upiId is: " + upiId);
        System.out.println("The accountType is: " + accountType);
        System.out.println("The status is: " + status);

        history.getHistoryDetails();
    }
}