class Factory {

    int factoryId;
    String factoryName;
    String location;
    int workers;
    String type;

    Machine machine;

    public void getFactoryDetails() {
        System.out.println("The factoryId is: " + factoryId);
        System.out.println("The factoryName is: " + factoryName);
        System.out.println("The location is: " + location);
        System.out.println("The workers is: " + workers);
        System.out.println("The type is: " + type);

        machine.getMachineDetails();
    }
}