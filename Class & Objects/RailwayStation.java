class RailwayStation {

    int stationId;
    String stationName;
    String location;
    int totalPlatforms;
    String zone;

    Platform platform;

    public void getRailwayStationDetails() {
        System.out.println("The stationId is: " + stationId);
        System.out.println("The stationName is: " + stationName);
        System.out.println("The location is: " + location);
        System.out.println("The totalPlatforms is: " + totalPlatforms);
        System.out.println("The zone is: " + zone);

        platform.getPlatformDetails();
    }
}
