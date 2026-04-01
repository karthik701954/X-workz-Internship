class GovernmentIdentification {

    int idNumber;
    String idType;
    String issueDate;
    String expiryDate;
    String authority;

    public void getGovernmentIdDetails() {
        System.out.println("The idNumber is: " + idNumber);
        System.out.println("The idType is: " + idType);
        System.out.println("The issueDate is: " + issueDate);
        System.out.println("The expiryDate is: " + expiryDate);
        System.out.println("The authority is: " + authority);
    }
}