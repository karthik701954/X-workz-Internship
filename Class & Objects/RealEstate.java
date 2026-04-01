class RealEstate {

    int realEstateId;
    String companyName;
    String location;
    int totalProjects;
    String owner;

    Property property;

    public void getRealEstateDetails() {
        System.out.println("The realEstateId is: " + realEstateId);
        System.out.println("The companyName is: " + companyName);
        System.out.println("The location is: " + location);
        System.out.println("The totalProjects is: " + totalProjects);
        System.out.println("The owner is: " + owner);

        property.getPropertyDetails();
    }
}