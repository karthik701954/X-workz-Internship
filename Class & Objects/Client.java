class Client {

    int clientId;
    String clientName;
    String project;
    int budget;
    String deadline;

    public void getClientDetails() {
        System.out.println("The clientId is: " + clientId);
        System.out.println("The clientName is: " + clientName);
        System.out.println("The project is: " + project);
        System.out.println("The budget is: " + budget);
        System.out.println("The deadline is: " + deadline);
    }
}
