class Platform {

    int platformId;
    int platformNumber;
    String trainName;
    String arrivalTime;
    String departureTime;

    public void getPlatformDetails() {
        System.out.println("The platformId is: " + platformId);
        System.out.println("The platformNumber is: " + platformNumber);
        System.out.println("The trainName is: " + trainName);
        System.out.println("The arrivalTime is: " + arrivalTime);
        System.out.println("The departureTime is: " + departureTime);
    }
}