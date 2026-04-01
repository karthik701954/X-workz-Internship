class AdityaBirlaGroup {

    int groupId;
    String groupName;
    String headquarters;
    int employees;
    String industry;

    RCB rcb;

    public void getGroupDetails() {
        System.out.println("The groupId is: " + groupId);
        System.out.println("The groupName is: " + groupName);
        System.out.println("The headquarters is: " + headquarters);
        System.out.println("The employees is: " + employees);
        System.out.println("The industry is: " + industry);

        rcb.getRCBDetails();
    }
}
